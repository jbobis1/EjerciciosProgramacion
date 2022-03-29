package capitulo07.bloque01.bloque02;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
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
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
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
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.setToolTipText("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarPrimerFabricante();
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarmenosuno() ;
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(">");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarmasuno();
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(">>");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostarUltimoFabricante();
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Nuevo");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			}
		});
		panel.add(btnNewButton_4);
		
		
		JButton btnNewButton_5 = new JButton("Actualizar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			}
		});
		panel.add(btnNewButton_5);
		
		
		JButton btnNewButton_6 = new JButton("Borrar");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			}
		});
		panel.add(btnNewButton_6);
	}
	
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
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		
	}
	
	
	
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
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public void mostarmasuno() {
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			
			ResultSet rs = s.executeQuery ("select * from fabricante where id < " + JtfId.getText()  + "  order by id limit 1");
		   
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
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public void mostarmenosuno() {
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from fabricante where id > " + JtfId.getText() + " order by id desc limit 1");
			
		   
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
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	
	public static void eliminarFabricante() {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		
		System.out.println("Introduce id del fabricante para su eliminación: ");
		id = sc.nextInt();

		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			int registrosAfectados = s.executeUpdate(
					"delete from fabricante where id=" + id);
			System.out.println(registrosAfectados + " registros eliminados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void nuevoFabricante () {
//		Scanner sc = new Scanner(System.in);
//		String cif, nombre;
//		int nuevoIdDisponible;
//		
//		System.out.println("Creación de un nuevo fabricante:");
//		System.out.println("Dame el cif:");
//		cif = sc.next();
//		System.out.println("Dame el nombre:");
//		nombre = sc.next();
//		
//		try {
//			Statement s = ConnectionManager.getConexion().createStatement();
//			nuevoIdDisponible = maxIdEnTabla("fabricante");
//			if (nuevoIdDisponible != -1) {
//				int registrosAfectados = s.executeUpdate(
//						"insert into fabricante values (" + nuevoIdDisponible + ",'" + cif + "', '" + nombre + "')");
//				System.out.println(registrosAfectados + " registros insertados ");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	

}
