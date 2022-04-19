package capitulo07.bloque01.bloque05;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cursos extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Cursos() {
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.setBounds(63, 5, 54, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		setLayout(null);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(122, 5, 50, 26);
		btnNewButton_1.setIcon(new ImageIcon(Cursos.class.getResource("/capitulo07/bloque01/bloque05/img/gotostart.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(177, 5, 50, 26);
		btnNewButton_2.setIcon(new ImageIcon(Cursos.class.getResource("/capitulo07/bloque01/bloque05/img/gotoend.png")));
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(">>");
		btnNewButton_3.setBounds(232, 5, 54, 25);
		add(btnNewButton_3);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(291, 5, 95, 25);
		btnNuevo.setIcon(new ImageIcon(Cursos.class.getResource("/capitulo07/bloque01/bloque05/img/nuevo.png")));
		add(btnNuevo);
		
		JButton btnNewButton_4 = new JButton("Modificar");
		btnNewButton_4.setBounds(108, 36, 119, 26);
		btnNewButton_4.setIcon(new ImageIcon(Cursos.class.getResource("/capitulo07/bloque01/bloque05/img/ruedadentada.png")));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnNewButton_4);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(232, 36, 109, 25);
		btnEliminar.setIcon(new ImageIcon(Cursos.class.getResource("/capitulo07/bloque01/bloque05/img/eliminar.png")));
		add(btnEliminar);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(24, 97, 70, 15);
		add(lblId);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setBounds(199, 74, 70, 15);
		add(lblCurso);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(12, 124, 105, 15);
		add(lblDescripcion);
		
		textField = new JTextField();
		textField.setBounds(155, 95, 156, 19);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(155, 122, 156, 19);
		add(textField_1);
		textField_1.setColumns(10);

	}
}
