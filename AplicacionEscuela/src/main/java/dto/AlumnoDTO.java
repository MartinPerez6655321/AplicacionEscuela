package dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AlumnoDTO
{

	private Integer id;
	private String dni;
	private Date fechaNacimiento;
	private String nombre;
	private String apellido;
	private String responsable;
	private String curso;
	private String telefono;

	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public boolean equals(Object o)
	{
		if(!(o instanceof AlumnoDTO))
			return false;
		if(getId()==null)
			return false;
		return getId().equals(((AlumnoDTO)o).getId());
	}
	
	@Override
	public String toString()
	{
		String ret = "";
		ret = ret + getDni();
		ret = ret + ", " + getNombre();
		ret = ret + ", " + getApellido();
		ret = ret + ", " + getFechaNacimiento();
		ret = ret + ", " + getResponsable();

		return ret;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFechaNacimiento() {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String fechaNac  = df.format(fechaNacimiento);
		return fechaNac;
	}

	public Date getFechaNacimientoExacta() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
}
