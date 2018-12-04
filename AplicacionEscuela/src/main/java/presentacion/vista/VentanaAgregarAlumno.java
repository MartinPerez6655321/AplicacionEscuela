package presentacion.vista;

import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;

public class VentanaAgregarAlumno {

	private JDialog frmAgregarAlumno;
	private JTextField textFieldUsuario;
	private JPasswordField IntopasswordField;
	private JPasswordField RepeatpasswordField;
	private JButton btnAgregarAlumno;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JDateChooser dateCreacion;
	private JTextField textFieldTelefono;
	private JTextField textFieldEmail;
	private JTextField txtFieldDNI;

	public VentanaAgregarAlumno() {
		initialize();
	}
	
	private void initialize() {
		frmAgregarAlumno = new JDialog();
		frmAgregarAlumno.setSize(276, 555);
		frmAgregarAlumno.getContentPane().setBackground(Color.lightGray);
		frmAgregarAlumno.getContentPane().setLayout(null);
		frmAgregarAlumno.setLocationRelativeTo(null);
		frmAgregarAlumno.setModal(true);
		frmAgregarAlumno.setResizable(false);
		frmAgregarAlumno.setTitle("Agregar Alumno");
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldUsuario.setBounds(108, 34, 136, 20);
		frmAgregarAlumno.getContentPane().add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		IntopasswordField = new JPasswordField();
		IntopasswordField.setHorizontalAlignment(SwingConstants.CENTER);
		IntopasswordField.setBounds(108, 84, 136, 20);
		frmAgregarAlumno.getContentPane().add(IntopasswordField);
		
		RepeatpasswordField = new JPasswordField();
		RepeatpasswordField.setHorizontalAlignment(SwingConstants.CENTER);
		RepeatpasswordField.setBounds(108, 134, 136, 20);
		frmAgregarAlumno.getContentPane().add(RepeatpasswordField);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(23, 37, 75, 14);
		frmAgregarAlumno.getContentPane().add(lblUsuario);

		JLabel lblPassword = new JLabel("Contraseña");
		lblPassword.setBounds(23, 87, 75, 14);
		frmAgregarAlumno.getContentPane().add(lblPassword);
		
		JLabel lblRepeatPass = new JLabel("Repita");
		lblRepeatPass.setBounds(23, 128, 75, 14);
		frmAgregarAlumno.getContentPane().add(lblRepeatPass);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(23, 140, 75, 14);
		frmAgregarAlumno.getContentPane().add(lblContrasea);
		
		btnAgregarAlumno = new JButton("Agregar Alumno");
		btnAgregarAlumno.setBounds(23, 492, 221, 23);
		btnAgregarAlumno.setBackground(Color.darkGray);
		btnAgregarAlumno.setForeground(Color.white);
		frmAgregarAlumno.getContentPane().add(btnAgregarAlumno);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNombre.setBounds(108, 184, 136, 20);
		frmAgregarAlumno.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldApellido.setBounds(108, 234, 136, 20);
		frmAgregarAlumno.getContentPane().add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTelefono.setBounds(108, 434, 136, 20);
		frmAgregarAlumno.getContentPane().add(textFieldTelefono);
		textFieldTelefono.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(23, 187, 75, 14);
		frmAgregarAlumno.getContentPane().add(lblNewLabel);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(23, 240, 75, 14);
		frmAgregarAlumno.getContentPane().add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(23, 437, 75, 14);
		frmAgregarAlumno.getContentPane().add(lblTelefono);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldEmail.setBounds(108, 384, 136, 39);
		frmAgregarAlumno.getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JLabel lblResponsable = new JLabel("Responsable");
		lblResponsable.setBounds(23, 387, 75, 14);
		frmAgregarAlumno.getContentPane().add(lblResponsable);
		
		txtFieldDNI = new JTextField();
		txtFieldDNI.setHorizontalAlignment(SwingConstants.CENTER);
		txtFieldDNI.setBounds(108, 284, 136, 20);
		frmAgregarAlumno.getContentPane().add(txtFieldDNI);
		txtFieldDNI.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(23, 287, 75, 14);
		frmAgregarAlumno.getContentPane().add(lblDni);
		
		dateCreacion = new JDateChooser();
		dateCreacion.setBounds(108, 334, 136, 20);
		frmAgregarAlumno.getContentPane().add(dateCreacion);

		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(23, 328, 75, 14);
		frmAgregarAlumno.getContentPane().add(lblFecha);

		JLabel lblNacimiento = new JLabel("de nacimiento");
		lblNacimiento.setBounds(23, 340, 75, 14);
		frmAgregarAlumno.getContentPane().add(lblNacimiento);

	}
	
	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public JTextField getTextFieldApellido() {
		return textFieldApellido;
	}

	public JTextField getTxtFieldDNI() {
		return txtFieldDNI;
	}

	public JDateChooser getDateCreacion() {
		return dateCreacion;
	}

	public JTextField getTextFieldEmail() {
		return textFieldEmail;
	}
	
	public JTextField getTextFieldTelefono() {
		return textFieldTelefono;
	}

	public JTextField getTextFieldUsuario() {
		return textFieldUsuario;
	}

	public JPasswordField getIntopasswordField() {
		return IntopasswordField;
	}

	public JPasswordField getRepeatpasswordField() {
		return RepeatpasswordField;
	}

	public JButton getBtnAgregarInstructor() {
		return btnAgregarAlumno;
	}

	public void show() {
		frmAgregarAlumno.setVisible(true);
	}
	
    public void close()
	{
    	frmAgregarAlumno.dispose();
	}
}