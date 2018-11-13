package persistencia.vista;

import javax.swing.JPanel;

import dto.AlumnoDTO;
import presentacion.components.tabla.TablaGenerica;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class PanelGestionAlumnos extends JPanel
{
	private static final long serialVersionUID = -7863190660839358912L;
	private JButton btnAgregarAlumno;
	private JButton btnCalcularEdad;
	private JButton btnConsultarResponsable;

	private TablaGenerica<AlumnoDTO> table;
	private JButton btnGenerarReporte;
	private JButton btnReporteAnual;
	private JButton btnImprimirReporte;

	public PanelGestionAlumnos()
	{
		setLayout(new BorderLayout(0, 0));
		
		JPanel buttonPane = new JPanel();
		add(buttonPane, BorderLayout.SOUTH);

		btnAgregarAlumno = new JButton("Agregar Alumno");
		buttonPane.add(btnAgregarAlumno);
		
		btnCalcularEdad = new JButton("Calcular Edad");
		buttonPane.add(btnCalcularEdad);
		
		btnConsultarResponsable = new JButton("Consultar Responsables");
		buttonPane.add(btnConsultarResponsable);
		
		btnGenerarReporte = new JButton("Generar reporte");
		buttonPane.add(btnGenerarReporte);
		
		btnReporteAnual = new JButton("Generar reporte anual");
		buttonPane.add(btnReporteAnual);
		
		btnImprimirReporte = new JButton("Imprimir reporte");
		buttonPane.add(btnImprimirReporte);
	}

	public TablaGenerica<AlumnoDTO> getTable() {
		return table;
	}
	
	public void setTable(TablaGenerica<AlumnoDTO> table)
	{
		this.table = table; 
		add(this.table, BorderLayout.CENTER);
	}
	
	public JButton getBtnAgregarAlumno() {
		return btnAgregarAlumno;
	}
	
	public JButton getBtnGestionarPagos()
	{
		return btnCalcularEdad;
	}
	
	public JButton getBtnConsultarInscripciones()
	{
		return btnConsultarResponsable;
	}

	public JButton getBtnGenerarReporte() {
		return btnGenerarReporte;
	}

	public void setBtnGenerarReporte(JButton btnGenerarReporte) {
		this.btnGenerarReporte = btnGenerarReporte;
	}

	public JButton getBtnReporteAnual() {
		return btnReporteAnual;
	}

	public void setBtnReporteAnual(JButton btnReporteAnual) {
		this.btnReporteAnual = btnReporteAnual;
	}

	public JButton getBtnImprimirReporte() {
		return btnImprimirReporte;
	}

	public void setBtnImprimirReporte(JButton btnImprimirReporte) {
		this.btnImprimirReporte = btnImprimirReporte;
	}
}
