package capitulo07.bloque01.bloque04;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GestionarVentas extends JPanel {
	private JTextField JtfId;
	private JTextField JtfFecha;
	private JTextField textPrecio;
	public GestionarVentas() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCoches = new JLabel("Ventas");
		GridBagConstraints gbc_lblCoches = new GridBagConstraints();
		gbc_lblCoches.gridwidth = 2;
		gbc_lblCoches.insets = new Insets(0, 0, 5, 0);
		gbc_lblCoches.gridx = 0;
		gbc_lblCoches.gridy = 0;
		add(lblCoches, gbc_lblCoches);
		
		JLabel lblNewLabel = new JLabel("Id");
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
		
		JLabel lblFrabricante = new JLabel("IdCliente");
		GridBagConstraints gbc_lblFrabricante = new GridBagConstraints();
		gbc_lblFrabricante.anchor = GridBagConstraints.EAST;
		gbc_lblFrabricante.insets = new Insets(0, 0, 5, 5);
		gbc_lblFrabricante.gridx = 0;
		gbc_lblFrabricante.gridy = 2;
		add(lblFrabricante, gbc_lblFrabricante);
		
		JComboBox comboBoxIdCliente = new JComboBox();
		GridBagConstraints gbc_comboBoxIdCliente = new GridBagConstraints();
		gbc_comboBoxIdCliente.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxIdCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxIdCliente.gridx = 1;
		gbc_comboBoxIdCliente.gridy = 2;
		add(comboBoxIdCliente, gbc_comboBoxIdCliente);
		
		JLabel lblBastidor = new JLabel("IdConsesionario");
		GridBagConstraints gbc_lblBastidor = new GridBagConstraints();
		gbc_lblBastidor.anchor = GridBagConstraints.EAST;
		gbc_lblBastidor.insets = new Insets(0, 0, 5, 5);
		gbc_lblBastidor.gridx = 0;
		gbc_lblBastidor.gridy = 3;
		add(lblBastidor, gbc_lblBastidor);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		add(comboBox, gbc_comboBox);
		
		JLabel lblModelo = new JLabel("IdCoche");
		GridBagConstraints gbc_lblModelo = new GridBagConstraints();
		gbc_lblModelo.anchor = GridBagConstraints.EAST;
		gbc_lblModelo.insets = new Insets(0, 0, 5, 5);
		gbc_lblModelo.gridx = 0;
		gbc_lblModelo.gridy = 4;
		add(lblModelo, gbc_lblModelo);
		
		JComboBox comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 4;
		add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblColor = new JLabel("Fecha");
		GridBagConstraints gbc_lblColor = new GridBagConstraints();
		gbc_lblColor.anchor = GridBagConstraints.EAST;
		gbc_lblColor.insets = new Insets(0, 0, 5, 5);
		gbc_lblColor.gridx = 0;
		gbc_lblColor.gridy = 5;
		add(lblColor, gbc_lblColor);
		
		JtfFecha = new JTextField();
		GridBagConstraints gbc_JtfFecha = new GridBagConstraints();
		gbc_JtfFecha.insets = new Insets(0, 0, 5, 0);
		gbc_JtfFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtfFecha.gridx = 1;
		gbc_JtfFecha.gridy = 5;
		add(JtfFecha, gbc_JtfFecha);
		JtfFecha.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Precio");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 6;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textPrecio = new JTextField();
		GridBagConstraints gbc_textPrecio = new GridBagConstraints();
		gbc_textPrecio.insets = new Insets(0, 0, 5, 0);
		gbc_textPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrecio.gridx = 1;
		gbc_textPrecio.gridy = 6;
		add(textPrecio, gbc_textPrecio);
		textPrecio.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 7;
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
		gbc_panel_1.gridy = 8;
		add(panel_1, gbc_panel_1);
		
		JButton btnNuevo = new JButton("Nuevo");
		panel_1.add(btnNuevo);
		
		JButton btnModificar = new JButton("Modificar");
		panel_1.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		panel_1.add(btnEliminar);
	}

}
