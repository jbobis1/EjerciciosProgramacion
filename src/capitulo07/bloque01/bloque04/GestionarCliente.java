package capitulo07.bloque01.bloque04;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import capitulo07.bloque01.bloque03.Controlador;
import capitulo07.bloque01.bloque03.Fabricante;

import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class GestionarCliente extends JPanel {

	private JTextField JtfId;
	private JTextField JtfNombre;
	private JTextField JtfApellidos;
	private JTextField jtfLocalidad;
	private JTextField JtfDni;
	private JTextField JtfFec;
	private JButton borrar ;
	private JButton minimo ;
	private JButton unomenos ;
	private JButton maximo ;
	private JButton unomas ;
	private JButton nuevo ;
	private JButton actualizar ;
	private JCheckBox chckbxActivo;
	
	
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
		
		JtfDni = new JTextField();
		GridBagConstraints gbc_JtfDni = new GridBagConstraints();
		gbc_JtfDni.insets = new Insets(0, 0, 5, 0);
		gbc_JtfDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtfDni.gridx = 1;
		gbc_JtfDni.gridy = 5;
		add(JtfDni, gbc_JtfDni);
		JtfDni.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("FechaNac");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 6;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JtfFec = new JTextField();
		GridBagConstraints gbc_JtfFec = new GridBagConstraints();
		gbc_JtfFec.insets = new Insets(0, 0, 5, 0);
		gbc_JtfFec.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtfFec.gridx = 1;
		gbc_JtfFec.gridy = 6;
		add(JtfFec, gbc_JtfFec);
		JtfFec.setColumns(10);
		
		chckbxActivo = new JCheckBox("Activo");
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
		
		minimo = new JButton("<<");
		minimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarCliente(ControladorCliente.mostarPrimerCliente());		

			}
		});
		panel.add(minimo);
		
		unomenos = new JButton("<");
		unomenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarCliente(ControladorCliente.mostarmenosuno(Integer.parseInt(JtfId.getText())));
			}
		});
		panel.add(unomenos);
		
		unomas = new JButton(">");
		unomas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarCliente(ControladorCliente.mostarmasuno(Integer.parseInt(JtfId.getText())));
			}
		});
		panel.add(unomas);
		
		maximo = new JButton(">>");
		maximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarCliente(ControladorCliente.mostarUltimoCliente());	
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
		gbc_panel_1.gridy = 9;
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
				eliminar();
			}
		});
		panel_1.add(borrar);
	}
	
	private void mostarCliente(Cliente f) {
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		if (f != null) {
			JtfId.setText("" + f.getId());	
			JtfId.setEnabled(false);
			JtfNombre.setText(f.getNombre());		
			JtfApellidos.setText(f.getApellidos());	
			jtfLocalidad.setText(f.getLocalidad());	
			JtfDni.setText(f.getDni());	
			
			JtfFec.setText(sdf.format(f.getFecha()));
	
			chckbxActivo.setSelected(f.isActivo());
			
			
			
			
		}
		
	
		if (ControladorCliente.mostarmenosuno(f.getId())==null) {
			minimo.setEnabled(false);
			unomenos.setEnabled(false);
		}
		
		else {		
			
			minimo.setEnabled(true);
			unomenos.setEnabled(true);
		
		}
		if (ControladorCliente.mostarmasuno(f.getId())==null) {
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
		JtfNombre.setText(" " );		
		JtfApellidos.setText("");	
		jtfLocalidad.setText("");
		JtfDni.setText("");
		JtfFec.setText("");
		chckbxActivo.setSelected(false);

		
		
	}
	
	/**
	 * 
	 */

	public  void  guardar () {
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");

		Cliente f =new Cliente();
		f.setId(Integer.parseInt(JtfId.getText()));
		f.setNombre((JtfNombre.getText()));
		f.setApellidos((JtfApellidos.getText()));
		f.setLocalidad((jtfLocalidad.getText()));
		f.setDni((JtfDni.getText()));
		
		try {
			f.setFecha(sdf.parse(JtfFec.getText()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	//	f.isActivo(chckbxActivo.setSelected());
		
//		f.setFecha((JtfFec.getText()));
//		f.setActivo((Jtf.getText()));
		
		if(ControladorCliente.guardar(f)==1) {
			JOptionPane.showConfirmDialog(null, "Error al guardar");
		}
		else {
			JOptionPane.showConfirmDialog(null, "Guardado correcto");
		}
	
	}
	
	public  void  eliminar () {
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");

		Cliente f =new Cliente();
		f.setId(Integer.parseInt(JtfId.getText()));
		f.setNombre((JtfNombre.getText()));
		f.setApellidos((JtfApellidos.getText()));
		f.setLocalidad((jtfLocalidad.getText()));
		f.setDni((JtfDni.getText()));
		
		
		try {
			f.setFecha(sdf.parse(JtfFec.getText()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		f.setFecha((JtfFec.getText()));
//		f.setActivo((Jtf.getText()));
		
		if(ControladorCliente.eliminar(f)==1) {
			JOptionPane.showConfirmDialog(null, "Error al eliminar");
		}
		else {
			JOptionPane.showConfirmDialog(null, "Se a eliminado");
		}
	}

}
