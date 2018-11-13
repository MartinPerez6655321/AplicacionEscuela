package connections;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder; 

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

class ConfiguradorBD extends JDialog
{
	private static final long serialVersionUID = -1915289007066938600L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsuario;
	private JPasswordField pwdContrasea;
	private JTextField txtNombredebd;
	private boolean pressedOk;
	private JTextField txtPuerto;
	private JTextField txtIp;
	
	public ConfiguradorBD()
	{
		setTitle("Propiedades de la BD");
		setBounds(100, 100, 303, 385);
		getContentPane().setLayout(new BorderLayout());
		
		setModal(true);
		
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setBounds(12, 104, 124, 16);
		contentPanel.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a: ");
		lblContrasea.setBounds(12, 133, 124, 16);
		contentPanel.add(lblContrasea);
		
		JLabel lblNombreDeBase = new JLabel("Nombre de base: ");
		lblNombreDeBase.setBounds(12, 159, 124, 16);
		contentPanel.add(lblNombreDeBase);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(148, 101, 125, 22);
		contentPanel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		pwdContrasea = new JPasswordField();
		pwdContrasea.setBounds(148, 130, 125, 19);
		contentPanel.add(pwdContrasea);
		
		txtNombredebd = new JTextField();
		txtNombredebd.setBounds(148, 156, 125, 22);
		contentPanel.add(txtNombredebd);
		txtNombredebd.setColumns(10);
		
		JLabel lblPuerto = new JLabel("Puerto:");
		lblPuerto.setBounds(12, 75, 56, 16);
		contentPanel.add(lblPuerto);
		
		txtPuerto = new JTextField();
		txtPuerto.setBounds(148, 72, 125, 22);
		contentPanel.add(txtPuerto);
		txtPuerto.setColumns(10);
		
		JLabel lblIp = new JLabel("IP:");
		lblIp.setBounds(12, 46, 56, 16);
		contentPanel.add(lblIp);
		
		txtIp = new JTextField();
		txtIp.setBounds(148, 43, 125, 22);
		contentPanel.add(txtIp);
		txtIp.setColumns(10);
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				buttonPane.add(okButton);
				okButton.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e)
					{
						pressedOk = true;
						setVisible(false);
					}
				});
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e)
					{
						pressedOk = false;
						setVisible(false);
					}
				});
				buttonPane.add(cancelButton);
			}
		}
	}

	public boolean pressedOk()
	{
		return pressedOk;
	}

	public Properties getProperties()
	{
		Properties ret = new Properties();

		ret.put("db_ip", txtIp.getText());
		ret.put("db_puerto", txtPuerto.getText());
		ret.put("db_nombre", txtNombredebd.getText());
		ret.put("db_usuario", txtUsuario.getText());
		ret.put("db_password", new String(pwdContrasea.getPassword()));
		
		return ret;
	}

	public void setCurrentProps(Properties dbProperties)
	{
		txtIp.setText(dbProperties.getProperty("db_ip"));
		txtPuerto.setText(dbProperties.getProperty("db_puerto"));
		txtNombredebd.setText(dbProperties.getProperty("db_nombre"));
		txtUsuario.setText(dbProperties.getProperty("db_usuario"));
		pwdContrasea.setText(dbProperties.getProperty("db_password"));
	}
}
