package capitulo07.bloque01.bloque05;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import capitulo07.bloque01.bloque04.Coche;
import capitulo07.bloque01.bloque04.Controlador;
import capitulo07.bloque01.bloque04.ControladorCoche;
import capitulo07.bloque01.bloque04.Fabricante;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Cursos extends JPanel {
	private JTextField id;
	private JTextField descripcion;
	private JButton borrar ;
	private JButton minimo ;
	private JButton unomenos ;
	private JButton maximo ;
	private JButton unomas ;
	private JButton nuevo ;
	private JButton actualizar ;

	/**
	 * Create the panel.
	 */
	public Cursos() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{82, 9, 50, 50, 54, 95, 0};
		gridBagLayout.rowHeights = new int[]{26, 26, 15, 19, 19, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		unomenos = new JButton("");
		unomenos.setIcon(new ImageIcon(Cursos.class.getResource("/capitulo07/bloque01/bloque05/img/gotostart.png")));
		unomenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarCurso(ControladorCurso.mostarmenosuno(Integer.parseInt(id.getText())));
			}
		});
		
		minimo = new JButton("<<");
		minimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarCurso(ControladorCurso.mostarPrimercurso());	
			}
		});
		GridBagConstraints gbc_minimo = new GridBagConstraints();
		gbc_minimo.anchor = GridBagConstraints.NORTHEAST;
		gbc_minimo.insets = new Insets(0, 0, 5, 5);
		gbc_minimo.gridwidth = 2;
		gbc_minimo.gridx = 0;
		gbc_minimo.gridy = 0;
		add(minimo, gbc_minimo);
		GridBagConstraints gbc_unomenos = new GridBagConstraints();
		gbc_unomenos.anchor = GridBagConstraints.NORTHWEST;
		gbc_unomenos.insets = new Insets(0, 0, 5, 5);
		gbc_unomenos.gridx = 2;
		gbc_unomenos.gridy = 0;
		add(unomenos, gbc_unomenos);
		
		maximo = new JButton(">>");
		maximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarCurso(ControladorCurso.mostarUltimocurso());	
			}
		});
		
		unomas = new JButton("");
		unomas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarCurso(ControladorCurso.mostarmasuno(Integer.parseInt(id.getText())));
			}
		});
		unomas.setIcon(new ImageIcon(Cursos.class.getResource("/capitulo07/bloque01/bloque05/img/gotoend.png")));
		GridBagConstraints gbc_unomas = new GridBagConstraints();
		gbc_unomas.anchor = GridBagConstraints.NORTHWEST;
		gbc_unomas.insets = new Insets(0, 0, 5, 5);
		gbc_unomas.gridx = 3;
		gbc_unomas.gridy = 0;
		add(unomas, gbc_unomas);
		GridBagConstraints gbc_maximo = new GridBagConstraints();
		gbc_maximo.anchor = GridBagConstraints.NORTHWEST;
		gbc_maximo.insets = new Insets(0, 0, 5, 5);
		gbc_maximo.gridx = 4;
		gbc_maximo.gridy = 0;
		add(maximo, gbc_maximo);
		
		borrar = new JButton("Eliminar");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 eliminar();
				

			}
		});
		
		actualizar = new JButton("Modificar");
		actualizar.setIcon(new ImageIcon(Cursos.class.getResource("/capitulo07/bloque01/bloque05/img/ruedadentada.png")));
		actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				guardar();
			}
		});
		
		nuevo = new JButton("Nuevo");
		nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		nuevo.setIcon(new ImageIcon(Cursos.class.getResource("/capitulo07/bloque01/bloque05/img/nuevo.png")));
		GridBagConstraints gbc_nuevo = new GridBagConstraints();
		gbc_nuevo.anchor = GridBagConstraints.NORTHWEST;
		gbc_nuevo.insets = new Insets(0, 0, 5, 0);
		gbc_nuevo.gridx = 5;
		gbc_nuevo.gridy = 0;
		add(nuevo, gbc_nuevo);
		GridBagConstraints gbc_actualizar = new GridBagConstraints();
		gbc_actualizar.anchor = GridBagConstraints.NORTHWEST;
		gbc_actualizar.insets = new Insets(0, 0, 5, 5);
		gbc_actualizar.gridwidth = 3;
		gbc_actualizar.gridx = 1;
		gbc_actualizar.gridy = 1;
		add(actualizar, gbc_actualizar);
		borrar.setIcon(new ImageIcon(Cursos.class.getResource("/capitulo07/bloque01/bloque05/img/eliminar.png")));
		GridBagConstraints gbc_borrar = new GridBagConstraints();
		gbc_borrar.anchor = GridBagConstraints.NORTHWEST;
		gbc_borrar.insets = new Insets(0, 0, 5, 0);
		gbc_borrar.gridwidth = 2;
		gbc_borrar.gridx = 4;
		gbc_borrar.gridy = 1;
		add(borrar, gbc_borrar);
		
		JLabel lblCurso = new JLabel("Curso");
		GridBagConstraints gbc_lblCurso = new GridBagConstraints();
		gbc_lblCurso.anchor = GridBagConstraints.NORTH;
		gbc_lblCurso.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurso.gridwidth = 2;
		gbc_lblCurso.gridx = 3;
		gbc_lblCurso.gridy = 2;
		add(lblCurso, gbc_lblCurso);
		
		JLabel lblId = new JLabel("Id");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 3;
		add(lblId, gbc_lblId);
		
		id = new JTextField();
		GridBagConstraints gbc_id = new GridBagConstraints();
		gbc_id.anchor = GridBagConstraints.NORTH;
		gbc_id.insets = new Insets(0, 0, 5, 0);
		gbc_id.gridwidth = 4;
		gbc_id.gridx = 2;
		gbc_id.gridy = 3;
		add(id, gbc_id);
		id.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDescripcion.insets = new Insets(0, 0, 0, 5);
		gbc_lblDescripcion.gridwidth = 2;
		gbc_lblDescripcion.gridx = 0;
		gbc_lblDescripcion.gridy = 4;
		add(lblDescripcion, gbc_lblDescripcion);
		
		descripcion = new JTextField();
		GridBagConstraints gbc_descripcion = new GridBagConstraints();
		gbc_descripcion.anchor = GridBagConstraints.NORTH;
		gbc_descripcion.gridwidth = 4;
		gbc_descripcion.gridx = 2;
		gbc_descripcion.gridy = 4;
		add(descripcion, gbc_descripcion);
		descripcion.setColumns(10);

	}
	
	/**
	 * 
	 * @param f
	 */
	private void mostarCurso(Curso f) {
	
		if (f != null) {
			id.setText("" + f.getId());	
			descripcion.setText(f.getDescripcion());	

		}
		
	
		if (ControladorCurso.mostarmenosuno(f.getId())==null) {
			minimo.setEnabled(false);
			unomenos.setEnabled(false);
		}
		
		else {
			
			minimo.setEnabled(true);
			unomenos.setEnabled(true);
		
		}
		if (ControladorCurso.mostarmasuno(f.getId())==null) {
			maximo.setEnabled(false);
			unomas.setEnabled(false);
		}
		
		else {
			
			maximo.setEnabled(true);
			unomas.setEnabled(true);
		
		}
		
	}
	
	/**
	 * 
	 */
	private void limpiar() {
		id.setText("");	
		descripcion.setText("");	

	}
	
	public  void  guardar () {
		Curso f =new Curso();
		
		f.setId(Integer.parseInt(id.getText()));

		
		f.setDescripcion((descripcion.getText()));
		

		
		
		if(ControladorCurso.guardar(f)==1) {
			JOptionPane.showConfirmDialog(null, "Error al guardar");
			
		}
		else {
			JOptionPane.showConfirmDialog(null, "Guardado correcto");
		}
	
	}
	
	public  void  eliminar () {
		Curso f =new Curso();
		f.setId(Integer.parseInt(id.getText()));

		
		f.setDescripcion((descripcion.getText()));

		if(ControladorCurso.eliminar(f)==1) {
			JOptionPane.showConfirmDialog(null, "Error al eliminar");
		}
		else {
			JOptionPane.showConfirmDialog(null, "Se a eliminado");
		}
	}
	
}

