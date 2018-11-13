package presentacion.components.tabla;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelHideAndShow extends JPanel
{
	private static final long serialVersionUID = 7247941372861747331L;
	private JButton hideAndShowButton;
	
	public PanelHideAndShow(Component scrollPaneFilter, String constraints)
	{
		setLayout(new BorderLayout());
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		
		hideAndShowButton = new JButton("...");
		hideAndShowButton.setPreferredSize(new Dimension(20, (int) getPreferredSize().getHeight()));
		
		add(hideAndShowButton, constraints);
		add(contentPane, BorderLayout.CENTER);
		contentPane.add(scrollPaneFilter, BorderLayout.CENTER);
		
		hideAndShowButton.addActionListener( e -> contentPane.setVisible(!contentPane.isVisible()));
	}
}