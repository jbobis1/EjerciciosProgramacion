package capitulo07.bloque01.bloque05;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class VistaEstudiante extends JPanel {


	private JButton borrar ;
	private JButton minimo ;
	private JButton unomenos ;
	private JButton maximo ;
	private JButton unomas ;
	private JButton nuevo ;
	private JButton actualizar ;
	
	DatosPersonales datosPersonales = new DatosPersonales();

	/**
	 * Create the panel.
	 */
	public VistaEstudiante() {
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		
		minimo = new JButton("");
		minimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostarEstudiante(ControladorEstudiante.mostarPrimerEstudiante());
			}
		});
		minimo.setIcon(new ImageIcon(VistaEstudiante.class.getResource("/capitulo07/bloque01/bloque05/img/gotostart.png")));
		toolBar.add(minimo);
		
		unomenos = new JButton("");
		unomenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarEstudiante(ControladorEstudiante.mostarmenosuno((datosPersonales.getId())));
				
			}
		});
		unomenos.setIcon(new ImageIcon(VistaEstudiante.class.getResource("/capitulo07/bloque01/bloque05/img/previous.png")));
		toolBar.add(unomenos);
		
		unomas = new JButton("");
		unomas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostarEstudiante(ControladorEstudiante.mostarmasuno((datosPersonales.getId())));
				
			}
		});
		unomas.setIcon(new ImageIcon(VistaEstudiante.class.getResource("/capitulo07/bloque01/bloque05/img/next.png")));
		toolBar.add(unomas);
		
		maximo = new JButton("");
		maximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostarEstudiante(ControladorEstudiante.mostarUltimoEstudiante());
			}
		});
		maximo.setIcon(new ImageIcon(VistaEstudiante.class.getResource("/capitulo07/bloque01/bloque05/img/gotoend.png")));
		toolBar.add(maximo);
		
		nuevo = new JButton("");
		nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		nuevo.setIcon(new ImageIcon(VistaEstudiante.class.getResource("/capitulo07/bloque01/bloque05/img/nuevo.png")));
		toolBar.add(nuevo);
		
		actualizar = new JButton("");
		actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				guardar ();
			}
		});
		actualizar.setIcon(new ImageIcon(VistaEstudiante.class.getResource("/capitulo07/bloque01/bloque05/img/guardar.png")));
		toolBar.add(actualizar);
		
		borrar = new JButton("");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar ();
			}
		});
		borrar.setIcon(new ImageIcon(VistaEstudiante.class.getResource("/capitulo07/bloque01/bloque05/img/eliminar.png")));
		toolBar.add(borrar);
		
	
		add(datosPersonales, BorderLayout.CENTER);
	mostarEstudiante(ControladorEstudiante.mostarPrimerEstudiante());
	
	}
	

	/**
	 * 
	 * @param f
	 */
	private void mostarEstudiante(Estudiante f) {
		
		if (f != null) {
	
			datosPersonales.setId(f.getId());
		
			datosPersonales.setNombre(f.getNombre());
			datosPersonales.setApellido(f.getApellido1());
			datosPersonales.setApellido2(f.getApellido2());
			datosPersonales.setDireccion(f.getDireccion());
			datosPersonales.setDni(f.getDni());
			datosPersonales.setEmail(f.getEmail());
			datosPersonales.setTelefono(f.getTelefono());
			
			datosPersonales.setImagen(f.getImagen());
			datosPersonales.getImagen();
		
			datosPersonales.comboBox.setSelectedIndex(f.getTipologiasexo_id()-1);
			
			datosPersonales.setColor(f.getColor());	
			
			
			}
		
	
		if (ControladorEstudiante.mostarmenosuno(f.getId())==null) {
			minimo.setEnabled(false);
			unomenos.setEnabled(false);
		}
		
		else {
			
			minimo.setEnabled(true);
			unomenos.setEnabled(true);
		
		}
		if (ControladorEstudiante.mostarmasuno(f.getId())==null) {
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
		
		datosPersonales.setId(0);	
		datosPersonales.setNombre("");;	
		datosPersonales.setApellido("");
		datosPersonales.setApellido2("");
		
		datosPersonales.setColor("#ffffff");	
		datosPersonales.setImagen(null);
		
		datosPersonales.comboBox.setSelectedIndex(0);

		datosPersonales.setDireccion("");
		datosPersonales.setDni("");
		datosPersonales.setEmail("");
		datosPersonales.setTelefono("");
		


		
		minimo.setEnabled(false);
		unomenos.setEnabled(false);
		
		maximo.setEnabled(true);
		unomas.setEnabled(true);

	}
	
	/**
	 * 
	 */
	public  void  guardar () {
		Estudiante f =new Estudiante();
		
		f.setId((datosPersonales.getId()));
		f.setNombre((datosPersonales.getNombre()));
		f.setApellido1((datosPersonales.getApellido()));
		f.setApellido2((datosPersonales.getApellido2()));
		f.setDni((datosPersonales.getDireccion()));
		f.setDireccion((datosPersonales.getDni()));
		f.setEmail((datosPersonales.getEmail()));
		f.setTelefono((datosPersonales.getTelefono()));
		
		f.setImagen((datosPersonales.getImagen()));
		
		
		f.setTipologiasexo_id(((TipologiaSexo)datosPersonales.comboBox.getSelectedItem()).getId());
	
		f.setColor(datosPersonales.getColor());	
		
		
		if(ControladorEstudiante.guardar(f)==1) {
			mostarEstudiante(ControladorEstudiante.mostarUltimoEstudiante());
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
		Estudiante f =new Estudiante();
		f.setId((datosPersonales.getId()));
		f.setNombre((datosPersonales.getNombre()));
		f.setApellido1((datosPersonales.getApellido()));
		f.setApellido2((datosPersonales.getApellido2()));
		f.setDni((datosPersonales.getDireccion()));
		f.setDireccion((datosPersonales.getDni()));
		f.setEmail((datosPersonales.getEmail()));
		f.setTelefono((datosPersonales.getTelefono()));

		f.setColor(datosPersonales.getColor());	
		
		f.setImagen((datosPersonales.getImagen()));
		
		f.setTipologiasexo_id(((TipologiaSexo)datosPersonales.comboBox.getSelectedItem()).getId());

		if(ControladorEstudiante.eliminar(f)==1) {
			JOptionPane.showMessageDialog(null, "Eliminado");			
		}
		else {
			JOptionPane.showMessageDialog(null, "Error");
		}
		mostarEstudiante(ControladorEstudiante.mostarUltimoEstudiante());	
	}
}
