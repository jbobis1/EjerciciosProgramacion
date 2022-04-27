package capitulo07.bloque01.bloque05;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.List;
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
				
				mostarProfesor(ControladorProfesor.mostarmenosuno(datosPersonales2.getId()));

			}
		});
		unomenos.setIcon(new ImageIcon(VistaProfesor.class.getResource("/capitulo07/bloque01/bloque05/img/previous.png")));
		toolBar.add(unomenos);
		
		 unomas = new JButton("");
		 unomas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostarProfesor(ControladorProfesor.mostarmasuno(datosPersonales2.getId()));

				
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
		
		mostarProfesor(ControladorProfesor.mostarPrimerProfesorProfesor());
		
		cargarvalores();
		selecionarvalores(getidsexo()) ;
	}
	
	
	private void cargarvalores() {
		List<TipologiaSexo> lista = ControladorEstudiante.obtenerTodosLosCurso();
		for (int i = 0; i < lista.size(); i++) {
			datosPersonales2.comboBox.addItem(lista.get(i));
		}
	}
	
	/**
	 * 
	 * @param idCurso
	 */
	private void selecionarvalores(int idsexo) {
		for (int i = 0; i < datosPersonales2.comboBox.getItemCount(); i++) {
		if (((TipologiaSexo) datosPersonales2.comboBox.getItemAt(i)).getId() == idsexo ) {
			datosPersonales2.comboBox.setSelectedIndex(i);
			}
		}	
	}
	
	
	private int getidsexo() {
	return ((TipologiaSexo) datosPersonales2.comboBox.getSelectedItem()).getId();
		
	}
	/**
	 * 
	 * @param f
	 */
	private void mostarProfesor(Profesor f) {
		
		if (f != null) {
			datosPersonales2.setId(f.getId());	
			datosPersonales2.setNombre(f.getNombre());
			datosPersonales2.setApellido(f.getApellido1());
			datosPersonales2.setApellido2(f.getApellido2());
			
			datosPersonales2.setDireccion(f.getDireccion());
			datosPersonales2.setDni(f.getDni());
			datosPersonales2.setEmail(f.getEmail());
			datosPersonales2.setTelefono(f.getTelefono());

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
		datosPersonales2.setId(0);	
		datosPersonales2.setNombre("");;	
		datosPersonales2.setApellido("");
		datosPersonales2.setApellido2("");
		datosPersonales2.setDireccion("");
		datosPersonales2.setDni("");
		datosPersonales2.setEmail("");
		datosPersonales2.setTelefono("");
		
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
		
		f.setId((datosPersonales2.getId()));
		f.setNombre((datosPersonales2.getNombre()));
		f.setApellido1((datosPersonales2.getApellido()));
		f.setApellido2((datosPersonales2.getApellido2()));
		f.setDni((datosPersonales2.getDireccion()));
		f.setDireccion((datosPersonales2.getDni()));
		f.setEmail((datosPersonales2.getEmail()));
		f.setTelefono((datosPersonales2.getTelefono()));;
		

		
		
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
		f.setId((datosPersonales2.getId()));
		f.setNombre((datosPersonales2.getNombre()));
		f.setApellido1((datosPersonales2.getApellido()));
		f.setApellido2((datosPersonales2.getApellido2()));
		f.setDni((datosPersonales2.getDireccion()));
		f.setDireccion((datosPersonales2.getDni()));
		f.setEmail((datosPersonales2.getEmail()));
		f.setTelefono((datosPersonales2.getTelefono()));


		if(ControladorProfesor.eliminar(f)==1) {
			JOptionPane.showMessageDialog(null, "Eliminado");			
		}
		else {
			JOptionPane.showMessageDialog(null, "Error");
		}
		mostarProfesor(ControladorProfesor.mostarUltimoProfesor());	
	}
	
}
