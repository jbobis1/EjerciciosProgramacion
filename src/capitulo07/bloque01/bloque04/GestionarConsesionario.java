package capitulo07.bloque01.bloque04;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import capitulo07.bloque01.bloque03.Controlador;
import capitulo07.bloque01.bloque03.Fabricante;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionarConsesionario extends JPanel {
	private JTextField JtfId;
	private JTextField JtfCif;
	private JTextField JtfNombre;
	private JTextField jtfLocalidad;
	private JButton borrar ;
	private JButton minimo ;
	private JButton unomenos ;
	private JButton maximo ;
	private JButton unomas ;
	private JButton nuevo ;
	private JButton actualizar ;
	
	
	
	public GestionarConsesionario() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCoches = new JLabel("Consesionario");
		GridBagConstraints gbc_lblCoches = new GridBagConstraints();
		gbc_lblCoches.gridwidth = 2;
		gbc_lblCoches.insets = new Insets(0, 0, 5, 0);
		gbc_lblCoches.gridx = 0;
		gbc_lblCoches.gridy = 0;
		add(lblCoches, gbc_lblCoches);
		
		JLabel lblNewLabel = new JLabel("id");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JtfId = new JTextField();
		GridBagConstraints gbc_JtfId = new GridBagConstraints();
		gbc_JtfId.insets = new Insets(0, 0, 5, 0);
		gbc_JtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtfId.gridx = 1;
		gbc_JtfId.gridy = 1;
		add(JtfId, gbc_JtfId);
		JtfId.setColumns(10);
		
		JLabel lblFrabricante = new JLabel("Cif");
		GridBagConstraints gbc_lblFrabricante = new GridBagConstraints();
		gbc_lblFrabricante.anchor = GridBagConstraints.EAST;
		gbc_lblFrabricante.insets = new Insets(0, 0, 5, 5);
		gbc_lblFrabricante.gridx = 0;
		gbc_lblFrabricante.gridy = 2;
		add(lblFrabricante, gbc_lblFrabricante);
		
		JtfCif = new JTextField();
		GridBagConstraints gbc_JtfCif = new GridBagConstraints();
		gbc_JtfCif.insets = new Insets(0, 0, 5, 0);
		gbc_JtfCif.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtfCif.gridx = 1;
		gbc_JtfCif.gridy = 2;
		add(JtfCif, gbc_JtfCif);
		JtfCif.setColumns(10);
		
		JLabel lblBastidor = new JLabel("Nombre");
		GridBagConstraints gbc_lblBastidor = new GridBagConstraints();
		gbc_lblBastidor.anchor = GridBagConstraints.EAST;
		gbc_lblBastidor.insets = new Insets(0, 0, 5, 5);
		gbc_lblBastidor.gridx = 0;
		gbc_lblBastidor.gridy = 3;
		add(lblBastidor, gbc_lblBastidor);
		
		JtfNombre = new JTextField();
		GridBagConstraints gbc_JtfNombre = new GridBagConstraints();
		gbc_JtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_JtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtfNombre.gridx = 1;
		gbc_JtfNombre.gridy = 3;
		add(JtfNombre, gbc_JtfNombre);
		JtfNombre.setColumns(10);
		
		JLabel lblModelo = new JLabel("Localidad");
		GridBagConstraints gbc_lblModelo = new GridBagConstraints();
		gbc_lblModelo.anchor = GridBagConstraints.EAST;
		gbc_lblModelo.insets = new Insets(0, 0, 5, 5);
		gbc_lblModelo.gridx = 0;
		gbc_lblModelo.gridy = 4;
		add(lblModelo, gbc_lblModelo);
		
		jtfLocalidad = new JTextField();
		GridBagConstraints gbc_jtfLocalidad = new GridBagConstraints();
		gbc_jtfLocalidad.insets = new Insets(0, 0, 5, 0);
		gbc_jtfLocalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLocalidad.gridx = 1;
		gbc_jtfLocalidad.gridy = 4;
		add(jtfLocalidad, gbc_jtfLocalidad);
		jtfLocalidad.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 6;
		add(panel, gbc_panel);
		
		minimo = new JButton("<<");
		minimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarConsesionario(ControladorConsesinario.mostarPrimerFabricante());	

			}
	

		});
		panel.add(minimo);
		
		unomenos = new JButton("<");
		unomenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarConsesionario(ControladorConsesinario.mostarmenosuno(Integer.parseInt(JtfId.getText())));
			}
		});
		panel.add(unomenos);
		
		unomas = new JButton(">");
		unomas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarConsesionario(ControladorConsesinario.mostarmasuno(Integer.parseInt(JtfId.getText())));
			}
		});
		panel.add(unomas);
		
		maximo = new JButton(">>");
		maximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarConsesionario(ControladorConsesinario.mostarUltimoFabricante());	
			}
		});
		panel.add(maximo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 7;
		add(panel_1, gbc_panel_1);
		
		nuevo = new JButton("Nuevo");
		nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limpiar();
			}
			
		});
		panel_1.add(nuevo);
		
		actualizar = new JButton("Modificar");
		actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
				
			}
		});
		panel_1.add(actualizar);
		
		 borrar = new JButton("Eliminar");
		 borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 eliminar ();
			}
		});
		panel_1.add(borrar);
		
	}
	
	
	private void mostarConsesionario(Consesionario f) {
		
		if (f != null) {
			JtfId.setText("" + f.getId());	
			JtfId.setEnabled(false);
			JtfCif.setText(f.getCif());		
			JtfNombre.setText(f.getNombre());	
			jtfLocalidad.setText(f.getLocalidad());
		}
		
	
		if (ControladorConsesinario.mostarmenosuno(f.getId())==null) {
			minimo.setEnabled(false);
			unomenos.setEnabled(false);
		}
		
		else {
			
			minimo.setEnabled(true);
			unomenos.setEnabled(true);
		
		}
		if (ControladorConsesinario.mostarmasuno(f.getId())==null) {
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
		JtfId.setText("0");	
		JtfCif.setText(" " );		
		JtfNombre.setText("");	
		jtfLocalidad.setText("");	
	}
	
	/**
	 * 
	 */
	
	public  void  guardar () {
		Consesionario f =new Consesionario();
		f.setId(Integer.parseInt(JtfId.getText()));
		f.setCif((JtfCif.getText()));
		f.setNombre((JtfNombre.getText()));
		f.setLocalidad((jtfLocalidad.getText()));
		if(ControladorConsesinario.guardarConsesionario(f)==1) {
			JOptionPane.showConfirmDialog(null, "Error al guardar");
		}
		else {
			JOptionPane.showConfirmDialog(null, "Guardado correcto");
		}
	
	}
	
	public  void  eliminar () {
		Consesionario f =new Consesionario();
		f.setId(Integer.parseInt(JtfId.getText()));
		f.setCif((JtfCif.getText()));
		f.setNombre((JtfNombre.getText()));
		f.setLocalidad(jtfLocalidad.getText());
		if(ControladorConsesinario.eliminarConsesionario(f)==1) {
			JOptionPane.showConfirmDialog(null, "Error al eliminar");
		}
		else {
			JOptionPane.showConfirmDialog(null, "Se a eliminado");
		}
	}
}
