package capitulo07.bloque01.bloque04;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import capitulo07.bloque01.bloque03.Controlador;
import capitulo07.bloque01.bloque03.Fabricante;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class GestionarVentas extends JPanel {
	private JTextField JtfId;
	private JTextField JtfFecha;
	private JTextField JtfPrecio;
	private JButton borrar ;
	private JButton minimo ;
	private JButton unomenos ;
	private JButton maximo ;
	private JButton unomas ;
	private JButton nuevo ;
	private JButton actualizar ;
	JComboBox<Fabricante> comboBox;

	
	
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
		
		List<Cliente> lista = ContrladorVenta.obtenerTodosLosClientes();
		for (int i = 0; i < lista.size(); i++) {
			comboBox.addItem(lista.get(i));
		}
		
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
		
		JtfPrecio = new JTextField();
		GridBagConstraints gbc_JtfPrecio = new GridBagConstraints();
		gbc_JtfPrecio.insets = new Insets(0, 0, 5, 0);
		gbc_JtfPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtfPrecio.gridx = 1;
		gbc_JtfPrecio.gridy = 6;
		add(JtfPrecio, gbc_JtfPrecio);
		JtfPrecio.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 7;
		add(panel, gbc_panel);
		
		minimo = new JButton("<<");
		minimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarVenta(ContrladorVenta.mostarPrimerFabricante());
			}
		});
		panel.add(minimo);
		
		unomenos = new JButton("<");
		unomenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarVenta(ContrladorVenta.mostarmenosuno(Integer.parseInt(JtfId.getText())));
			}
		});
		panel.add(unomenos);
		
		unomas = new JButton(">");
		unomas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarVenta(ContrladorVenta.mostarmasuno(Integer.parseInt(JtfId.getText())));
			}
		});
		panel.add(unomas);
		
		maximo = new JButton(">>");
		maximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarVenta(ContrladorVenta.mostarUltimoFabricante());
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
		gbc_panel_1.gridy = 8;
		add(panel_1, gbc_panel_1);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		panel_1.add(btnNuevo);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		panel_1.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar();
			}
			
		});
		panel_1.add(btnEliminar);
	}

	private void mostarVenta(Venta f) {
		
		if (f != null) {
			JtfId.setText("" + f.getId());	
			JtfId.setEnabled(false);
			JtfFecha.setText(f.getFecha());		
			JtfPrecio.setText(f.getPrecio());	
		}
		
	
		if (ContrladorVenta.mostarmenosuno(f.getId())==null) {
			minimo.setEnabled(false);
			unomenos.setEnabled(false);
		}
		
		else {
			
			minimo.setEnabled(true);
			unomenos.setEnabled(true);
		
		}
		if (ContrladorVenta.mostarmasuno(f.getId())==null) {
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
		JtfFecha.setText(" " );		
		JtfPrecio.setText("");	
	}
	
	/**
	 * 
	 */
	
	public  void  guardar () {
		Venta f =new Venta();
		f.setId(Integer.parseInt(JtfId.getText()));
		f.setFecha(JtfFecha.getText());
		f.setPrecio((JtfPrecio.getText()));
		if(ContrladorVenta.guardar(f)==1) {
			JOptionPane.showConfirmDialog(null, "Error al guardar");
		}
		else {
			JOptionPane.showConfirmDialog(null, "Guardado correcto");
		}
	
	}
	
	public  void  eliminar () {
		Venta f =new Venta();
		f.setId(Integer.parseInt(JtfId.getText()));
		f.setFecha(JtfFecha.getText());
		f.setPrecio((JtfPrecio.getText()));
		if(ContrladorVenta.eliminar(f)==1) {
			JOptionPane.showConfirmDialog(null, "Error al eliminar");
		}
		else {
			JOptionPane.showConfirmDialog(null, "Se a eliminado");
		}
	}

}
