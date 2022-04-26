package capitulo07.bloque01.bloque05;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;

public class VistaMateria extends JPanel {
	private JTextField jtfId;
	private JTextField jtfNombre;
	private JTextField jtfAcro;
	private JButton borrar ;
	private JButton minimo ;
	private JButton unomenos ;
	private JButton maximo ;
	private JButton unomas ;
	private JButton nuevo ;
	private JButton actualizar ;


	
	JComboBox<Curso> comboBox;
	private JLabel lblGestionMateria;
	private JPanel panel;
	
	/**
	 * Create the panel.
	 */
	public VistaMateria() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0,  Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		minimo = new JButton("");
		panel.add(minimo);
		minimo.setIcon(new ImageIcon(VistaMateria.class.getResource("/capitulo07/bloque01/bloque05/img/gotostart.png")));
		
		unomenos = new JButton("");
		panel.add(unomenos);
		unomenos.setIcon(new ImageIcon(VistaMateria.class.getResource("/capitulo07/bloque01/bloque05/img/previous.png")));
		
		 unomas = new JButton("");
		 panel.add(unomas);
		 unomas.setIcon(new ImageIcon(VistaMateria.class.getResource("/capitulo07/bloque01/bloque05/img/next.png")));
		 
		 maximo = new JButton("");
		 panel.add(maximo);
		 maximo.setIcon(new ImageIcon(VistaMateria.class.getResource("/capitulo07/bloque01/bloque05/img/gotoend.png")));
		 
		  nuevo = new JButton("");
		  panel.add(nuevo);
		  nuevo.setIcon(new ImageIcon(VistaMateria.class.getResource("/capitulo07/bloque01/bloque05/img/nuevo.png")));
		  
		  actualizar = new JButton("");
		  panel.add(actualizar);
		  actualizar.setIcon(new ImageIcon(VistaMateria.class.getResource("/capitulo07/bloque01/bloque05/img/guardar.png")));
		  
		   borrar = new JButton("");
		   panel.add(borrar);
		   borrar.setIcon(new ImageIcon(VistaMateria.class.getResource("/capitulo07/bloque01/bloque05/img/eliminar.png")));
		   borrar.addActionListener(new ActionListener() {
		   	public void actionPerformed(ActionEvent e) {
		   		eliminar();
		   	}
		   });
		  actualizar.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		
		  		guardar();
		  	}
		  });
		  nuevo.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		limpiar();
		  	}
		  });
		 maximo.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		mostarMateria(ControladorMateria.mostarUltimoMateria());	
		 	}
		 });
		 unomas.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		mostarMateria(ControladorMateria.mostarmasuno(Integer.parseInt(jtfId.getText())));
		 	}
		 });
		unomenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostarMateria(ControladorMateria.mostarmenosuno(Integer.parseInt(jtfId.getText())));
			}
		});
		minimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarMateria(ControladorMateria.mostarPrimerMateria());
			}
		});
		
		lblGestionMateria = new JLabel("Gestion Materia");
		GridBagConstraints gbc_lblGestionMateria = new GridBagConstraints();
		gbc_lblGestionMateria.gridwidth = 2;
		gbc_lblGestionMateria.insets = new Insets(0, 0, 5, 5);
		gbc_lblGestionMateria.gridx = 0;
		gbc_lblGestionMateria.gridy = 1;
		add(lblGestionMateria, gbc_lblGestionMateria);
		
		JLabel lblNewLabel = new JLabel("Id");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		jtfId = new JTextField();
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 5);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 2;
		add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 3;
		add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Acronimo");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 4;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfAcro = new JTextField();
		GridBagConstraints gbc_jtfAcro = new GridBagConstraints();
		gbc_jtfAcro.insets = new Insets(0, 0, 5, 5);
		gbc_jtfAcro.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfAcro.gridx = 1;
		gbc_jtfAcro.gridy = 4;
		add(jtfAcro, gbc_jtfAcro);
		jtfAcro.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("IdCurso");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 5;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		comboBox = new JComboBox<Curso>();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 5;
		add(comboBox, gbc_comboBox);

		cargarvalores();
		selecionarvalores(getidCurso());
		getidCurso();
		
		mostarMateria(ControladorMateria.mostarPrimerMateria());
	}
	
	/**
	 * 
	 */
	
	private void cargarvalores() {
		List<Curso> lista = ControladorMateria.obtenerTodosLosCurso();
		for (int i = 0; i < lista.size(); i++) {
			comboBox.addItem(lista.get(i));
		}
	}
	
	/**
	 * 
	 * @param idCurso
	 */
	private void selecionarvalores(int idCurso) {
		for (int i = 0; i < comboBox.getItemCount(); i++) {
		if (((Curso) comboBox.getItemAt(i)).getId() == idCurso ) {
			comboBox.setSelectedIndex(i);
			}
		}	
	}
	
	/**
	 * 
	 * @return
	 */
	private int getidCurso() {
	return ((Curso) comboBox.getSelectedItem()).getId();
		
	}
	
	/**
	 * 
	 * @param f
	 */
	private void mostarMateria(Materia f) {
		
		if (f != null) {
			jtfId.setText("" + f.getId());	
			jtfId.setEnabled(false);
				
			comboBox.setSelectedIndex(f.getCurso_id()-1);
			jtfNombre.setText(f.getNombre());	
			jtfAcro.setText(f.getAcronimo());
	

		}
		
	
		if (ControladorMateria.mostarmenosuno(f.getId())==null) {
			minimo.setEnabled(false);
			unomenos.setEnabled(false);
		}
		
		else {
			
			minimo.setEnabled(true);
			unomenos.setEnabled(true);
		
		}
		if (ControladorMateria.mostarmasuno(f.getId())==null) {
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
		jtfId.setText("0" );
		comboBox.setSelectedIndex((0));
		jtfNombre.setText("");	
		jtfAcro.setText("");
		
		
//		minimo.setEnabled(false);
//		unomenos.setEnabled(false);
//		
//		maximo.setEnabled(true);
//		unomas.setEnabled(true);

	}
	
	/**
	 * 
	 */
	public  void  guardar () {
		Materia f =new Materia();
		
		f.setId(Integer.parseInt(jtfId.getText()));
		
		f.setCurso_id(((Curso )comboBox.getSelectedItem()).getId());
		
		f.setNombre((jtfNombre.getText()));
		
		f.setAcronimo((jtfAcro.getText()));
		
		if(ControladorMateria.guardar(f)==1) {
			mostarMateria(ControladorMateria.mostarUltimoMateria());
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
		Materia f =new Materia();
		
		f.setId(Integer.parseInt(jtfId.getText()));
		
		f.setCurso_id(((Curso )comboBox.getSelectedItem()).getId());
		
		f.setNombre((jtfNombre.getText()));
		
		f.setAcronimo((jtfAcro.getText()));
		if(ControladorMateria.eliminar(f)==1) {
			JOptionPane.showMessageDialog(null, "Eliminado");			
			}
			else {
				JOptionPane.showMessageDialog(null, "Error");
			}
		mostarMateria(ControladorMateria.mostarUltimoMateria());
	}
	
}
