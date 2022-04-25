package capitulo07.bloque01.bloque05;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class VistaEstudiante extends JPanel {

	/**
	 * Create the panel.
	 */
	public VistaEstudiante() {
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(VistaEstudiante.class.getResource("/capitulo07/bloque01/bloque05/img/gotostart.png")));
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(VistaEstudiante.class.getResource("/capitulo07/bloque01/bloque05/img/previous.png")));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(VistaEstudiante.class.getResource("/capitulo07/bloque01/bloque05/img/next.png")));
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(VistaEstudiante.class.getResource("/capitulo07/bloque01/bloque05/img/gotoend.png")));
		toolBar.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(VistaEstudiante.class.getResource("/capitulo07/bloque01/bloque05/img/nuevo.png")));
		toolBar.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(VistaEstudiante.class.getResource("/capitulo07/bloque01/bloque05/img/guardar.png")));
		toolBar.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon(VistaEstudiante.class.getResource("/capitulo07/bloque01/bloque05/img/eliminar.png")));
		toolBar.add(btnNewButton_6);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);

	}

}
