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
		
		minimo = new JButton("<<");
		minimo.setBounds(63, 5, 54, 25);
		minimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarCurso(ControladorCurso.mostarPrimercurso());	
			}
		});
		setLayout(null);
		add(minimo);
		
		unomenos = new JButton("");
		unomenos.setBounds(122, 5, 50, 26);
		unomenos.setIcon(new ImageIcon(Cursos.class.getResource("/capitulo07/bloque01/bloque05/img/gotostart.png")));
		unomenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarCurso(ControladorCurso.mostarmenosuno(Integer.parseInt(id.getText())));
			}
		});
		add(unomenos);
		
		unomas = new JButton("");
		unomas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarCurso(ControladorCurso.mostarmasuno(Integer.parseInt(id.getText())));
			}
		});
		unomas.setBounds(177, 5, 50, 26);
		unomas.setIcon(new ImageIcon(Cursos.class.getResource("/capitulo07/bloque01/bloque05/img/gotoend.png")));
		add(unomas);
		
		maximo = new JButton(">>");
		maximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarCurso(ControladorCurso.mostarUltimocurso());	
			}
		});
		maximo.setBounds(232, 5, 54, 25);
		add(maximo);
		
		nuevo = new JButton("Nuevo");
		nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		nuevo.setBounds(291, 5, 95, 25);
		nuevo.setIcon(new ImageIcon(Cursos.class.getResource("/capitulo07/bloque01/bloque05/img/nuevo.png")));
		add(nuevo);
		
		actualizar = new JButton("Modificar");
		actualizar.setBounds(108, 36, 119, 26);
		actualizar.setIcon(new ImageIcon(Cursos.class.getResource("/capitulo07/bloque01/bloque05/img/ruedadentada.png")));
		actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				guardar();
			}
		});
		add(actualizar);
		
		borrar = new JButton("Eliminar");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 eliminar();
				

			}
		});
		borrar.setBounds(232, 36, 109, 25);
		borrar.setIcon(new ImageIcon(Cursos.class.getResource("/capitulo07/bloque01/bloque05/img/eliminar.png")));
		add(borrar);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(24, 97, 70, 15);
		add(lblId);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setBounds(199, 74, 70, 15);
		add(lblCurso);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(12, 124, 105, 15);
		add(lblDescripcion);
		
		id = new JTextField();
		id.setBounds(155, 95, 156, 19);
		add(id);
		id.setColumns(10);
		
		descripcion = new JTextField();
		descripcion.setBounds(155, 122, 156, 19);
		add(descripcion);
		descripcion.setColumns(10);

	}
	
	/**
	 * 
	 * @param f
	 */
	private void mostarCurso(Coche f) {
	
		if (f != null) {
			id.setText("" + f.getId());	
			descripcion.setText(f.getBastidor());	

		}
		
	
		if (Controlador.mostarmenosuno(f.getId())==null) {
			minimo.setEnabled(false);
			unomenos.setEnabled(false);
		}
		
		else {
			
			minimo.setEnabled(true);
			unomenos.setEnabled(true);
		
		}
		if (Controlador.mostarmasuno(f.getId())==null) {
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


