package capitulo07.bloque01.bloque02;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class VentanaF {
	
	private JFrame frame;
	private JTextField JtfId;
	private JTextField JtfCif;
	private JTextField JtfNombre;
	private JButton borrar ;
	private JButton minimo ;
	private JButton unomenos ;
	private JButton maximo ;
	private JButton unomas ;
	private JButton nuevo ;
	private JButton actualizar ;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaF window = new VentanaF();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaF() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel_3 = new JLabel("Fabricantes");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridwidth = 2;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 0;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Id");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JtfId = new JTextField();
		GridBagConstraints gbc_JtfId = new GridBagConstraints();
		gbc_JtfId.insets = new Insets(0, 0, 5, 0);
		gbc_JtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtfId.gridx = 1;
		gbc_JtfId.gridy = 1;
		frame.getContentPane().add(JtfId, gbc_JtfId);
		JtfId.setColumns(10);
		
		JtfId.setVisible(false);
	
		JLabel lblNewLabel_1 = new JLabel("Cif");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JtfCif = new JTextField();
		GridBagConstraints gbc_JtfCif = new GridBagConstraints();
		gbc_JtfCif.insets = new Insets(0, 0, 5, 0);
		gbc_JtfCif.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtfCif.gridx = 1;
		gbc_JtfCif.gridy = 2;
		frame.getContentPane().add(JtfCif, gbc_JtfCif);
		JtfCif.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JtfNombre = new JTextField();
		GridBagConstraints gbc_JtfNombre = new GridBagConstraints();
		gbc_JtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_JtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_JtfNombre.gridx = 1;
		gbc_JtfNombre.gridy = 3;
		frame.getContentPane().add(JtfNombre, gbc_JtfNombre);
		JtfNombre.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 4;
		frame.getContentPane().add(panel, gbc_panel);
		
		minimo = new JButton("<<");
		minimo.setToolTipText("");
		minimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarPrimerFabricante();
				ComprobarMinimo();
				
			}
		});
		panel.add(minimo);
		
		unomenos = new JButton("<");
		unomenos.setToolTipText("");
		unomenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarmenosuno();	
				ComprobarMinimo();
			
			}
		});
		panel.add(unomenos);

		
		unomas = new JButton(">");
		unomas.setToolTipText("");
		unomas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//	public  void nuevo(); {
				
				mostarmasuno();
				ComprobarMaximo();
				
				
			}
		});
		panel.add(unomas);
		
		maximo = new JButton(">>");
		maximo.setToolTipText("");
		maximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostarUltimoFabricante();
				ComprobarMaximo();
				
			}
		});
		panel.add(maximo);
		
		nuevo = new JButton("Nuevo");
		nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			}
		});
		panel.add(nuevo);
		
		
		actualizar = new JButton("Actualizar");
		actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevo();
			
			}
		});
		panel.add(actualizar);
		 
		borrar = new JButton("Borrar");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar();
			
			}
		});
		panel.add(borrar);
	}
	
	
	/**
	 * 
	 */
	public void mostarPrimerFabricante() {
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from fabricante order by id limit 1");
		   
			// Navegación del objeto ResultSet
			if (rs.next()) { 
			this.JtfId.setText(rs.getString("id"));	
			this.JtfCif.setText(rs.getString("cif"));		
			this.JtfNombre.setText(rs.getString("nombre"));	
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 */
	
	public void mostarUltimoFabricante() {
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from fabricante order by id desc limit 1");
		   
			// Navegación del objeto ResultSet
			if (rs.next()) { 
			this.JtfId.setText(rs.getString("id"));	
			this.JtfCif.setText(rs.getString("cif"));		
			this.JtfNombre.setText(rs.getString("nombre"));	
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	public void mostarmasuno() {
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			
			ResultSet rs = s.executeQuery ("select * from fabricante where id > " + JtfId.getText()  + "  order by id limit 1");
		   
			// Navegación del objeto ResultSet
			if (rs.next()) { 
			this.JtfId.setText(rs.getString("id"));	
			this.JtfCif.setText(rs.getString("cif"));		
			this.JtfNombre.setText(rs.getString("nombre"));	
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	/**
	 * 
	 */
	public void mostarmenosuno() {
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from fabricante where id < " + JtfId.getText() + " order by id desc limit 1");
			

			// Navegación del objeto ResultSet
			if (rs.next()) { 
			this.JtfId.setText(rs.getString("id"));	
			this.JtfCif.setText(rs.getString("cif"));		
			this.JtfNombre.setText(rs.getString("nombre"));	
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	public void ComprobarMinimo() {
		try {
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
	
			ResultSet rs = s.executeQuery ("select * from fabricante order by id  limit 1");

			if (rs.next()) { 
				
			
				
				if(JtfId.getText().equalsIgnoreCase(rs.getString("id"))) {
					
					minimo.setEnabled(false);
					unomenos.setEnabled(false);
					
					}
				
				else {
					minimo.setEnabled(true);
					unomenos.setEnabled(true);
				}
			}
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	
	public void ComprobarMaximo() {
		try {
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			

			ResultSet rs = s.executeQuery ("select * from fabricante order by id desc limit 1");

			if (rs.next()) { 
				
				if(JtfId.getText().equalsIgnoreCase(rs.getString("id"))) {	
					
					maximo.setEnabled(false);
					unomas.setEnabled(false);
				}
				
				else {
					
					maximo.setEnabled(true);
					unomas.setEnabled(true);
				
				}
			}
			
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 */

	public  void nuevo() {
		int id = 0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from fabricante ");
			
			if (rs.next()) { 
			this.JtfId.setText(rs.getString(id));	
			
			}

			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	
	public  void nuevoFabricante () {
		int id = 0;
		String cif = "", nombre = "";
		String nuevoCif = "", nuevoNombre = "";
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from fabricante ");
			this.JtfId.setText(rs.getString(id));	
			
			if (rs.next()) { 
				
			
					if (rs.next()) {
						cif = rs.getString("cif");
						nombre = rs.getString("nombre");
					}
					
					nuevoCif = JOptionPane.showInputDialog("Cif (" + cif + ") (Intro para mantener): ");
					if (!nuevoCif.trim().equals("")) {
						cif = nuevoCif;
					}
					
					nuevoNombre = JOptionPane.showInputDialog("Nombre (" + nombre + ") (Intro para mantener): ");;
					if (!nuevoNombre.trim().equals("")) {
						nombre = nuevoNombre;
					}
					s.executeUpdate(
							"update fabricante set cif='" + cif + "', nombre='" + nombre + "' " +
							"where id=" + id);
			
			}

			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 */
	
	public void eliminar() {
		String nuevaid = JOptionPane.showInputDialog("Introduzca numero Maximo: ");
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			ResultSet rs = s.executeQuery ("delete from fabricante where id=" + nuevaid);
			
			if (rs.next()) { 
			this.JtfId.setText(rs.getString("id"));	
			this.JtfCif.setText(rs.getString("cif"));		
			this.JtfNombre.setText(rs.getString("nombre"));	
			}
			
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
		    JOptionPane.showMessageDialog(JtfId, nuevaid + "no se puede borra la id", "Error", JOptionPane.ERROR_MESSAGE);
			ex.printStackTrace();
		}
	}
}
