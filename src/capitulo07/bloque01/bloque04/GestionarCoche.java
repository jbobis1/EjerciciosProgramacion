package capitulo07.bloque01.bloque04;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class GestionarCoche extends JPanel {
	private JTextField JtfId;
	private JTextField JtfBastidor;
	private JTextField Modelo;
	private JTextField JtfColor;
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
		
		JComboBox comboBox = new JComboBox();
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
		
		Modelo = new JTextField();
		GridBagConstraints gbc_Modelo = new GridBagConstraints();
		gbc_Modelo.insets = new Insets(0, 0, 5, 0);
		gbc_Modelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_Modelo.gridx = 1;
		gbc_Modelo.gridy = 4;
		add(Modelo, gbc_Modelo);
		Modelo.setColumns(10);
		
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
		
		JButton button = new JButton("<<");
		panel.add(button);
		
		JButton button_1 = new JButton("<");
		panel.add(button_1);
		
		JButton button_2 = new JButton(">");
		panel.add(button_2);
		
		JButton button_3 = new JButton(">");
		panel.add(button_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 7;
		add(panel_1, gbc_panel_1);
		
		JButton btnNuevo = new JButton("Nuevo");
		panel_1.add(btnNuevo);
		
		JButton btnModificar = new JButton("Modificar");
		panel_1.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		panel_1.add(btnEliminar);
	}
}
