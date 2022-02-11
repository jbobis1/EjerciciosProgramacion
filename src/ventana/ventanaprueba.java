package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;

public class ventanaprueba extends JFrame {

	private JPanel contentPane;
	private JTextField codigo;
	private JTextField nombre;
	private JTextField localidad;
	private JComboBox comboBox;
	private JTextArea textArea_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnMujer;
	private JRadioButton rdbtnNewRadioButton;
	private JCheckBox chckbxAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaprueba frame = new ventanaprueba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventanaprueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS DEPARTAMENTO");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(134, 12, 302, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblCodigoDepartamento = new JLabel("Codigo departamento");
		lblCodigoDepartamento.setBounds(11, 65, 173, 15);
		contentPane.add(lblCodigoDepartamento);
		
		JLabel lblNombreDepartamento = new JLabel("Nombre Departamento");
		lblNombreDepartamento.setBounds(11, 92, 172, 15);
		contentPane.add(lblNombreDepartamento);
		
		JLabel lblLocalidadDepartamento = new JLabel("Localidad Departamento");
		lblLocalidadDepartamento.setBounds(11, 119, 189, 15);
		contentPane.add(lblLocalidadDepartamento);
		
		codigo = new JTextField();
		codigo.setBounds(246, 63, 114, 19);
		contentPane.add(codigo);
		codigo.setColumns(10);
		
		nombre = new JTextField();
		nombre.setBounds(241, 90, 162, 19);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		localidad = new JTextField();
		localidad.setBounds(241, 117, 162, 19);
		contentPane.add(localidad);
		localidad.setColumns(10);
		
		JButton btnInsertarDatos = new JButton("Insertar Datos");
		btnInsertarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTÓN INSERTAR DATOS.");	
				
				
				textArea_4.setText(""); //limpio 
				textArea_4.setText("Primera línea."); 
				textArea_4.append("\nSegunda línea"); 
				textArea_4.append("\nTercera línea"); 
				
				
				ButtonModel Hombre=rdbtnNewRadioButton.getModel();     
				ButtonModel Mujer= rdbtnMujer.getModel(); 
				
				if(buttonGroup.getSelection()!=null)     {
					if (buttonGroup.getSelection().equals(Mujer))           
					System.out.println("Has pulsado Mujer. "); 
					if (buttonGroup.getSelection().equals(Hombre))             
					System.out.println("Has pulsado Hombre. "); 
					
				}
				
				
				
				if (chckbxAceptar.isSelected())  
					
				{ System.out.println("Check pulsado. " + chckbxAceptar.getText());  } 
				
				
				}
			
			
			
			
		});
		btnInsertarDatos.setBackground(Color.BLUE);
		btnInsertarDatos.setForeground(Color.WHITE);
		btnInsertarDatos.setBounds(21, 180, 163, 25);
		contentPane.add(btnInsertarDatos);
		
		

		
		JButton btnLimpiarDatos = new JButton("Limpiar datos");
		btnLimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTÓN LIMPIAR DATOS.");
			}
		});
		btnLimpiarDatos.setBackground(Color.BLUE);
		btnLimpiarDatos.setForeground(Color.WHITE);
		btnLimpiarDatos.setBounds(246, 184, 166, 25);
		contentPane.add(btnLimpiarDatos);
		

		
		System.out.println("Código tecleado en Código: "+
		codigo.getText()); System.out.println("Código tecleado en Nombre: "
		+ ""+ nombre.getText()); System.out.println("Código tecleado en Dpto: "
		+ ""+ localidad.getText()); 

		
		codigo.setText(""); 
		nombre.setText(""); 
		localidad.setText("");
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"España", "Francia", "Italia ", "Holanda"}));
		comboBox.setBounds(246, 148, 162, 24);
		contentPane.add(comboBox);
		
		JLabel lblSeleccionarPais = new JLabel("Seleccionar Pais");
		lblSeleccionarPais.setBounds(11, 153, 189, 15);
		contentPane.add(lblSeleccionarPais);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(168, 248, 1, 15);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(168, 217, 1, 15);
		contentPane.add(textArea_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(144, 217, 3, 3);
		contentPane.add(scrollPane);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(181, 285, 1, 15);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(168, 267, 1, 15);
		contentPane.add(textArea_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(246, 311, 3, 3);
		contentPane.add(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(224, 348, 3, 3);
		contentPane.add(scrollPane_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(21, 229, 422, 172);
		contentPane.add(scrollPane_3);
		
		textArea_4 = new JTextArea();
		scrollPane_3.setViewportView(textArea_4);
		
		System.out.println("Posición: "+ comboBox.getSelectedIndex()); 
		
		System.out.println ("Contenido:" + comboBox.getSelectedItem());
		
		
		
		rdbtnNewRadioButton = new JRadioButton("Hombre");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(467, 75, 114, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(474, 52, 189, 15);
		contentPane.add(lblSexo);
		
		rdbtnMujer = new JRadioButton("Mujer");
		buttonGroup.add(rdbtnMujer);
		rdbtnMujer.setBounds(467, 115, 114, 23);
		contentPane.add(rdbtnMujer);
		
		chckbxAceptar = new JCheckBox("Aceptar");
		chckbxAceptar.setBounds(467, 378, 129, 23);
		contentPane.add(chckbxAceptar);


		}
	}

