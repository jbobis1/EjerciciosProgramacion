package capitulo07.bloque01.bloque03;

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
		mostarFabricante(Controlador.mostarPrimerFabricante());		
				
				
			}
		});
		panel.add(minimo);
		
		unomenos = new JButton("<");
		unomenos.setToolTipText("");
		unomenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarFabricante(Controlador.mostarmenosuno(Integer.parseInt(JtfId.getText())));	
				
			
			}
		});
		panel.add(unomenos);

		
		unomas = new JButton(">");
		unomas.setToolTipText("");
		unomas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarFabricante(Controlador.mostarmasuno(Integer.parseInt(JtfId.getText())));	
				
				
			}
		});
		panel.add(unomas);
		
		maximo = new JButton(">>");
		maximo.setToolTipText("");
		maximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarFabricante(Controlador.mostarUltimoFabricante());	
				
				
			}
		});
		panel.add(maximo);
		
		nuevo = new JButton("Nuevo");
		nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			
			}
		});
		panel.add(nuevo);
		
		
		actualizar = new JButton("Actualizar");
		actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar ();
			}
		});
		panel.add(actualizar);
		 
		borrar = new JButton("Borrar");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controlador.eliminar(null);
				
				Fabricante f =new Fabricante();
				f.setId(Integer.parseInt(JtfId.getText()));
				f.setCif((JtfCif.getText()));
				f.setNombre((JtfNombre.getText()));
				if(Controlador.guardar(f)==1) {
					JOptionPane.showConfirmDialog(null, "se a elimionado");
				}
				else {
					JOptionPane.showConfirmDialog(null, "error al eliminar");

				}
			
			}
		});
		panel.add(borrar);
	}
	
	
	
	private void mostarFabricante(Fabricante f) {
		
		if (f != null) {
			JtfId.setText("" + f.getId());	
			JtfId.setEnabled(false);
			JtfCif.setText(f.getCif());		
			JtfNombre.setText(f.getNombre());	
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
	
	
	private void limpiar() {
		JtfId.setText("0");	
		JtfCif.setText(" " );		
		JtfNombre.setText("");	
	}
	
	public  void  guardar () {
		Fabricante f =new Fabricante();
		f.setId(Integer.parseInt(JtfId.getText()));
		f.setCif((JtfCif.getText()));
		f.setNombre((JtfNombre.getText()));
		if(Controlador.guardar(f)==1) {
			JOptionPane.showConfirmDialog(null, " Error al guardar");
		}
		else {
			JOptionPane.showConfirmDialog(null, "Guardado correcto");

		}
	
	}
	
	
}
