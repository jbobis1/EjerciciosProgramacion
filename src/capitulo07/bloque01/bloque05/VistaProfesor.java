package capitulo07.bloque01.bloque05;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaProfesor extends JPanel {

	/**
	 * Create the panel.
	 */
	private JButton borrar ;
	private JButton minimo ;
	private JButton unomenos ;
	private JButton maximo ;
	private JButton unomas ;
	private JButton nuevo ;
	private JButton actualizar ;
	DatosPersonales datosPersonales2 = new DatosPersonales();

	
	public VistaProfesor() {
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		
		minimo = new JButton("");
		minimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostarProfesor(ControladorProfesor.mostarPrimerProfesorProfesor());
			}
		});
		minimo.setIcon(new ImageIcon(VistaProfesor.class.getResource("/capitulo07/bloque01/bloque05/img/gotostart.png")));
		toolBar.add(minimo);
		
		unomenos = new JButton("");
		unomenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostarProfesor(ControladorProfesor.mostarmenosuno(Integer.parseInt(DatosPersonales.jtfId.getText())));

			}
		});
		unomenos.setIcon(new ImageIcon(VistaProfesor.class.getResource("/capitulo07/bloque01/bloque05/img/previous.png")));
		toolBar.add(unomenos);
		
		 unomas = new JButton("");
		 unomas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostarProfesor(ControladorProfesor.mostarmasuno(Integer.parseInt(DatosPersonales.jtfId.getText())));

				
			}
		});
		 unomas.setIcon(new ImageIcon(VistaProfesor.class.getResource("/capitulo07/bloque01/bloque05/img/next.png")));
		toolBar.add(unomas);
		
		maximo = new JButton("");
		maximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				mostarProfesor(ControladorProfesor.mostarUltimoProfesor());
			}
		});
		maximo.setIcon(new ImageIcon(VistaProfesor.class.getResource("/capitulo07/bloque01/bloque05/img/gotoend.png")));
		toolBar.add(maximo);
		
		 nuevo = new JButton("\r\n");
		 nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		 nuevo.setIcon(new ImageIcon(VistaProfesor.class.getResource("/capitulo07/bloque01/bloque05/img/nuevo.png")));
		toolBar.add(nuevo);
		
		actualizar = new JButton("");
		actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				guardar();
			}
		});
		actualizar.setIcon(new ImageIcon(VistaProfesor.class.getResource("/capitulo07/bloque01/bloque05/img/guardar.png")));
		toolBar.add(actualizar);
		
		 borrar = new JButton("");
		 borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				eliminar ();
			}
		});
		 borrar.setIcon(new ImageIcon(VistaProfesor.class.getResource("/capitulo07/bloque01/bloque05/img/eliminar.png")));
		toolBar.add(borrar);
		
	
		add(datosPersonales2, BorderLayout.CENTER);

	}
	private void mostarProfesor(Profesor f) {
		
		if (f != null) {
			DatosPersonales.jtfId.setText("" + f.getId());	
			DatosPersonales.jtfId.setEnabled(false);	
			DatosPersonales.jtfNombre.setText(f.getNombre());	
			DatosPersonales.jtfApellido1.setText(f.getApellido1());	
			DatosPersonales.jtfApellido2.setText(f.getApellido2());
			DatosPersonales.jtfDni.setText(f.getDni());	
			DatosPersonales.jtfDireccion.setText(f.getDireccion());
			DatosPersonales.jtfEmail.setText(f.getEmail());	
			DatosPersonales.jtfTelefono.setText(f.getTelefono());

		}
		
	
		if (ControladorEstudiante.mostarmenosuno(f.getId())==null) {
			minimo.setEnabled(false);
			unomenos.setEnabled(false);
		}
		
		else {
			
			minimo.setEnabled(true);
			unomenos.setEnabled(true);
		
		}
		if (ControladorProfesor.mostarmasuno(f.getId())==null) {
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
		DatosPersonales.jtfId.setText("0");	
		DatosPersonales.jtfNombre.setText("");	
		DatosPersonales.jtfApellido1.setText("");	
		DatosPersonales.jtfApellido2.setText("");
		DatosPersonales.jtfDni.setText("");	
		DatosPersonales.jtfDireccion.setText("");
		DatosPersonales.jtfEmail.setText("");	
		DatosPersonales.jtfTelefono.setText("");
		
		minimo.setEnabled(false);
		unomenos.setEnabled(false);
		
		maximo.setEnabled(true);
		unomas.setEnabled(true);

	}
	
	/**
	 * 
	 */
	public  void  guardar () {
		Profesor f =new Profesor();
		
		f.setId(Integer.parseInt(DatosPersonales.jtfId.getText()));
		f.setNombre((DatosPersonales.jtfNombre.getText()));
		f.setApellido1((DatosPersonales.jtfApellido1.getText()));
		f.setApellido2((DatosPersonales.jtfApellido2.getText()));
		f.setDni((DatosPersonales.jtfDni.getText()));
		f.setDireccion((DatosPersonales.jtfDireccion.getText()));
		f.setEmail((DatosPersonales.jtfEmail.getText()));
		f.setTelefono((DatosPersonales.jtfTelefono.getText()));
		

		
		
		if(ControladorProfesor.guardar(f)==1) {
			mostarProfesor(ControladorProfesor.mostarUltimoProfesor());
			JOptionPane.showMessageDialog(null, "Guardado o Modificado Correcto");	
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Error");
		}
	
	}
	
	/**
	 * 
	 */

	public  void  eliminar () {
		Profesor f =new Profesor();
		f.setId(Integer.parseInt(DatosPersonales.jtfId.getText()));
		f.setNombre((DatosPersonales.jtfNombre.getText()));
		f.setApellido1((DatosPersonales.jtfApellido1.getText()));
		f.setApellido2((DatosPersonales.jtfApellido2.getText()));
		f.setDni((DatosPersonales.jtfDni.getText()));
		f.setDireccion((DatosPersonales.jtfDireccion.getText()));
		f.setEmail((DatosPersonales.jtfEmail.getText()));
		f.setTelefono((DatosPersonales.jtfTelefono.getText()));

		if(ControladorProfesor.eliminar(f)==1) {
			JOptionPane.showMessageDialog(null, "Eliminado");			
		}
		else {
			JOptionPane.showMessageDialog(null, "Error");
		}
		mostarProfesor(ControladorProfesor.mostarUltimoProfesor());	
	}
	
}
