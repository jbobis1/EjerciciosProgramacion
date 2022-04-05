package capitulo07.bloque01.bloque04;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class GestionarCliente extends JPanel {

	private JTextField JtfId;
	private JTextField JtfNombre;
	private JTextField JtfApellidos;
	private JTextField jtfLocalidad;
	private JTextField textField;
	private JTextField textField_1;
	public GestionarCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCoches = new JLabel("Clientes");
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
		
		JLabel lblFrabricante = new JLabel("Nombre");
		GridBagConstraints gbc_lblFrabricante = new GridBagConstraints();
		gbc_lblFrabricante.anchor = GridBagConstraints.EAST;
		gbc_lblFrabricante.insets = new Insets(0, 0, 5, 5);
		gbc_lblFrabricante.gridx = 0;
		gbc_lblFrabricante.gridy = 2;
		add(lblFrabricante, gbc_lblFrabricante);
		
		JtfNombre = new JTextField();
		GridBagConstraints gbc_JtfNombre = new GridBagConstraints();
		gbc_JtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_JtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtfNombre.gridx = 1;
		gbc_JtfNombre.gridy = 2;
		add(JtfNombre, gbc_JtfNombre);
		JtfNombre.setColumns(10);
		
		JLabel lblBastidor = new JLabel("Apellidos");
		GridBagConstraints gbc_lblBastidor = new GridBagConstraints();
		gbc_lblBastidor.anchor = GridBagConstraints.EAST;
		gbc_lblBastidor.insets = new Insets(0, 0, 5, 5);
		gbc_lblBastidor.gridx = 0;
		gbc_lblBastidor.gridy = 3;
		add(lblBastidor, gbc_lblBastidor);
		
		JtfApellidos = new JTextField();
		GridBagConstraints gbc_JtfApellidos = new GridBagConstraints();
		gbc_JtfApellidos.insets = new Insets(0, 0, 5, 0);
		gbc_JtfApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtfApellidos.gridx = 1;
		gbc_JtfApellidos.gridy = 3;
		add(JtfApellidos, gbc_JtfApellidos);
		JtfApellidos.setColumns(10);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("DNI");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 5;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 5;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("FechaNac");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 6;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 6;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxActivo = new JCheckBox("Activo");
		GridBagConstraints gbc_chckbxActivo = new GridBagConstraints();
		gbc_chckbxActivo.gridwidth = 2;
		gbc_chckbxActivo.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxActivo.gridx = 0;
		gbc_chckbxActivo.gridy = 7;
		add(chckbxActivo, gbc_chckbxActivo);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 8;
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
		gbc_panel_1.gridy = 9;
		add(panel_1, gbc_panel_1);
		
		JButton btnNuevo = new JButton("Nuevo");
		panel_1.add(btnNuevo);
		
		JButton btnModificar = new JButton("Modificar");
		panel_1.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		panel_1.add(btnEliminar);
	}
}
