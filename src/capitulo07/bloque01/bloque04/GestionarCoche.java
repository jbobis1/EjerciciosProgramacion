package capitulo07.bloque01.bloque04;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;


import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class GestionarCoche extends JPanel {
	
	private JTextField JtfId;
	private JTextField JtfBastidor;
	private JTextField JtfModelo;
	private JTextField JtfColor;
	private JButton borrar ;
	private JButton minimo ;
	private JButton unomenos ;
	private JButton maximo ;
	private JButton unomas ;
	private JButton nuevo ;
	private JButton actualizar ;
	
	JComboBox<Fabricante> comboBox;
	
	public GestionarCoche() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCoches = new JLabel("Coches");
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
		
		JLabel lblFrabricante = new JLabel("Frabricante");
		GridBagConstraints gbc_lblFrabricante = new GridBagConstraints();
		gbc_lblFrabricante.anchor = GridBagConstraints.EAST;
		gbc_lblFrabricante.insets = new Insets(0, 0, 5, 5);
		gbc_lblFrabricante.gridx = 0;
		gbc_lblFrabricante.gridy = 2;
		add(lblFrabricante, gbc_lblFrabricante);
		
		comboBox = new JComboBox<Fabricante>();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 2;
		add(comboBox, gbc_comboBox);
		



		
		
		JLabel lblBastidor = new JLabel("Bastidor");
		GridBagConstraints gbc_lblBastidor = new GridBagConstraints();
		gbc_lblBastidor.anchor = GridBagConstraints.EAST;
		gbc_lblBastidor.insets = new Insets(0, 0, 5, 5);
		gbc_lblBastidor.gridx = 0;
		gbc_lblBastidor.gridy = 3;
		add(lblBastidor, gbc_lblBastidor);
		
		JtfBastidor = new JTextField();
		GridBagConstraints gbc_JtfBastidor = new GridBagConstraints();
		gbc_JtfBastidor.insets = new Insets(0, 0, 5, 0);
		gbc_JtfBastidor.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtfBastidor.gridx = 1;
		gbc_JtfBastidor.gridy = 3;
		add(JtfBastidor, gbc_JtfBastidor);
		JtfBastidor.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo");
		GridBagConstraints gbc_lblModelo = new GridBagConstraints();
		gbc_lblModelo.anchor = GridBagConstraints.EAST;
		gbc_lblModelo.insets = new Insets(0, 0, 5, 5);
		gbc_lblModelo.gridx = 0;
		gbc_lblModelo.gridy = 4;
		add(lblModelo, gbc_lblModelo);
		
		JtfModelo = new JTextField();
		GridBagConstraints gbc_JtfModelo = new GridBagConstraints();
		gbc_JtfModelo.insets = new Insets(0, 0, 5, 0);
		gbc_JtfModelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtfModelo.gridx = 1;
		gbc_JtfModelo.gridy = 4;
		add(JtfModelo, gbc_JtfModelo);
		JtfModelo.setColumns(10);
		
		JLabel lblColor = new JLabel("Color");
		GridBagConstraints gbc_lblColor = new GridBagConstraints();
		gbc_lblColor.anchor = GridBagConstraints.EAST;
		gbc_lblColor.insets = new Insets(0, 0, 5, 5);
		gbc_lblColor.gridx = 0;
		gbc_lblColor.gridy = 5;
		add(lblColor, gbc_lblColor);
		
		JtfColor = new JTextField();
		GridBagConstraints gbc_JtfColor = new GridBagConstraints();
		gbc_JtfColor.insets = new Insets(0, 0, 5, 0);
		gbc_JtfColor.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtfColor.gridx = 1;
		gbc_JtfColor.gridy = 5;
		add(JtfColor, gbc_JtfColor);
		JtfColor.setColumns(10);
		
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
				mostarCoche(ControladorCoche.mostarPrimerCoche());	
			}
		});
		panel.add(minimo);
		
		unomenos = new JButton("<");
		unomenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarCoche(ControladorCoche.mostarmenosuno(Integer.parseInt(JtfId.getText())));	
				
			}
		});
		panel.add(unomenos);
		
		unomas = new JButton(">");
		unomas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarCoche(ControladorCoche.mostarmasuno(Integer.parseInt(JtfId.getText())));
			}
		});
		panel.add(unomas);
		
		maximo = new JButton(">>");
		maximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarCoche(ControladorCoche.mostarUltimoCoche());		
			}
		});
		panel.add(maximo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
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
		
		cargarvalores();
		selecionarvalores(getidfabricante());
		getidfabricante() ;
		
	}
	

	/**
	 * 
	 * @param f
	 */
	
	private void cargarvalores() {
		List<Fabricante> lista = ControladorCoche.obtenerTodosLosFabricantes();
		for (int i = 0; i < lista.size(); i++) {
			comboBox.addItem(lista.get(i));
		}
	}
	
	private void selecionarvalores(int idfabricante) {
		for (int i = 0; i < comboBox.getItemCount(); i++) {
		if (((Fabricante) comboBox.getItemAt(i)).getId() == idfabricante ) {
			comboBox.setSelectedIndex(i);
			}
		}	
	}
	
	private int getidfabricante() {
	return ((Fabricante) comboBox.getSelectedItem()).getId();
		
	}
	
	
	
	private void mostarCoche(Coche f) {
	
		
		
		
		if (f != null) {
			JtfId.setText("" + f.getId());	
			JtfId.setEnabled(false);
			comboBox.setSelectedIndex(f.getId());
			JtfBastidor.setText(f.getBastidor());	
			JtfModelo.setText(f.getModelo());	
			JtfColor.setText(f.getColor());	
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
		JtfId.setText("0");	
		comboBox.setSelectedIndex((0));

		JtfBastidor.setText("");
		JtfModelo.setText("");
		JtfColor.setText("");
	}
	
	/**
	 * 
	 */
//	JComboBox comboBox = new JComboBox();
	
	public  void  guardar () {
		Coche f =new Coche();
		f.setId(Integer.parseInt(JtfId.getText()));
		

		f.setIdFabricante(((Fabricante )comboBox.getSelectedItem()).getId());
		
		f.setBastidor((JtfBastidor.getText()));
		
		f.setModelo((JtfModelo.getText()));
		
		if(ControladorCoche.guardar(f)==1) {
			JOptionPane.showConfirmDialog(null, "Error al guardar");
			
		}
		else {
			JOptionPane.showConfirmDialog(null, "Guardado correcto");
		}
	
	}
	
	public  void  eliminar () {
		Coche f =new Coche();
		f.setId(Integer.parseInt(JtfId.getText()));

		f.setIdFabricante(((Fabricante)comboBox.getSelectedItem()).getId());
		
		f.setBastidor((JtfBastidor.getText()));
		f.setModelo((JtfModelo.getText()));
		if(ControladorCoche.eliminar(f)==1) {
			JOptionPane.showConfirmDialog(null, "Error al eliminar");
		}
		else {
			JOptionPane.showConfirmDialog(null, "Se a eliminado");
		}
	}

}
