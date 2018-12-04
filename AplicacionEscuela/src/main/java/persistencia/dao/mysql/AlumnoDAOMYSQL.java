package persistencia.dao.mysql;

import java.util.List;

import com.mysql.jdbc.Statement;

import java.util.LinkedList;

import connections.ConnectionManager;
import dto.AlumnoDTO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class AlumnoDAOMYSQL
{
	private static final String insert = "INSERT INTO alumnos_table (id, nombre, apellido ,DNI, fechaNacimiento, responsable) VALUES(?, ?, ?, ?, ?, ?)";
	private static final String delete = "DELETE FROM alumnos_table WHERE id=?";
	private static final String readall = "SELECT * FROM alumnos_table";
	private static final String update = "UPDATE alumnos_table SET nombre=?, apellido=?, dni=?, fechaNaciemiento=?, responsable=? WHERE id=?";
	private static final String readByID = "SELECT * FROM alumnos_table WHERE id=?";
	private static AlumnoDAOMYSQL instance;
	
	private AlumnoDAOMYSQL(){}
	
	public static AlumnoDAOMYSQL getInstance()
	{
		if (instance == null)
			instance = new AlumnoDAOMYSQL();
		return instance;
	}
	
	private List<AlumnoDTO> query(PreparedStatement statement) throws SQLException
	{
		List<AlumnoDTO> ret = new LinkedList<>();
		ResultSet resultSet = statement.executeQuery();
		
		while(resultSet.next())
		{
			AlumnoDTO elem = new AlumnoDTO();
			elem.setId(resultSet.getInt("id"));
			elem.setDni(resultSet.getString("dni"));
			elem.setFechaNacimiento(resultSet.getDate("fechaNacimiento"));
			elem.setNombre(resultSet.getString("nombre"));
			elem.setApellido(resultSet.getString("apellido"));
			elem.setResponsable(resultSet.getString("responsable"));
			ret.add(elem);
		}
		return ret;
	}
	
	public boolean create(AlumnoDTO alumnodto)
	{
		try
		{
			PreparedStatement statement = ConnectionManager.getConnectionManager().getSQLConnection().prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
			statement.setInt(1, alumnodto.getId());
			statement.setString(2, alumnodto.getNombre());
			statement.setString(3, alumnodto.getApellido());
			statement.setString(4, alumnodto.getDni());
			statement.setDate(5, new java.sql.Date(alumnodto.getFechaNacimientoExacta().getTime()));
			statement.setString(6, alumnodto.getResponsable());
			
			if(statement.executeUpdate() > 0)
			{
				ResultSet generatedKey = statement.getGeneratedKeys();
				generatedKey.next();
				alumnodto.setId(generatedKey.getInt(1));
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean delete(AlumnoDTO alumnodto)
	{
		try
		{
			PreparedStatement statement = ConnectionManager.getConnectionManager().getSQLConnection().prepareStatement(delete);
			statement.setInt(1, alumnodto.getId());
			
			if(statement.executeUpdate() > 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean update(AlumnoDTO alumnodto)
	{
		try
		{
			PreparedStatement statement;
			statement = ConnectionManager.getConnectionManager().getSQLConnection().prepareStatement(update);
			statement.setInt(1, alumnodto.getId());
			statement.setString(2, alumnodto.getNombre());
			statement.setString(3, alumnodto.getApellido());
			statement.setString(4, alumnodto.getDni());
			statement.setDate(5, new java.sql.Date(alumnodto.getFechaNacimientoExacta().getTime()));
			statement.setString(6, alumnodto.getResponsable());
			if(statement.executeUpdate() > 0)
			{
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public List<AlumnoDTO> readAll()
	{
		try
		{
			return query(ConnectionManager.getConnectionManager().getSQLConnection().prepareStatement(readall));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public AlumnoDTO readById(int id)
	{
		try
		{
			PreparedStatement statement = ConnectionManager.getConnectionManager().getSQLConnection().prepareStatement(readByID);
			statement.setInt(1, id);
			List<AlumnoDTO> result = query(statement);
			if(!result.isEmpty())
				return result.get(0);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<AlumnoDTO> readByList(List<Integer> ids)
	{
		List<AlumnoDTO> ret = new LinkedList<>();
		for(Integer id : ids)
			ret.add(readById(id));
		return ret;
	}
}
