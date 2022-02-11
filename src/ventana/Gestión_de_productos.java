package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Gestión_de_productos extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField Precio;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnPrimera;
	private JRadioButton rdbtnSegunda;
	private JRadioButton rdbtnPremiun;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnPrimera_1_1_1;
	private JRadioButton rdbtnPrimera_1_1;
	private JLabel lblIva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestión_de_productos frame = new Gestión_de_productos();
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
	public Gestión_de_productos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTRADA DE DATOS DE PRODUCTOS");
		lblNewLabel.setBounds(127, 12, 279, 15);
		contentPane.add(lblNewLabel);
		
		nombre = new JTextField();
		nombre.setText("");
		nombre.setBounds(181, 49, 167, 19);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		Precio = new JTextField();
		Precio.setText("");
		Precio.setColumns(10);
		Precio.setBounds(181, 80, 167, 19);
		contentPane.add(Precio);
		
		JLabel lblNombre = new JLabel("Nombre del Producto");
		lblNombre.setBounds(12, 51, 167, 15);
		contentPane.add(lblNombre);
		
		JLabel lblPrecio = new JLabel("Precio del Procducto");
		lblPrecio.setBounds(12, 82, 151, 15);
		contentPane.add(lblPrecio);
		
		JLabel lblDeProductos = new JLabel("Tipos Productos");
		lblDeProductos.setBounds(12, 109, 161, 15);
		contentPane.add(lblDeProductos);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nacional", "Importado", "Anual"}));
		comboBox.setBounds(181, 104, 167, 24);
		contentPane.add(comboBox);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(12, 157, 161, 15);
		contentPane.add(lblCategoria);
		
		rdbtnNewRadioButton = new JRadioButton("Extra-Premiun");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(158, 153, 149, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnPremiun = new JRadioButton("Premiun");
		buttonGroup.add(rdbtnPremiun);
		rdbtnPremiun.setBounds(311, 153, 149, 23);
		contentPane.add(rdbtnPremiun);
		
		rdbtnPrimera = new JRadioButton("Primera");
		buttonGroup.add(rdbtnPrimera);
		rdbtnPrimera.setBounds(158, 180, 149, 23);
		contentPane.add(rdbtnPrimera);
		
		rdbtnSegunda = new JRadioButton("Segunda");
		buttonGroup.add(rdbtnSegunda);
		rdbtnSegunda.setBounds(311, 180, 149, 23);
		contentPane.add(rdbtnSegunda);
		
		lblIva = new JLabel("IVA");
		lblIva.setBounds(12, 225, 52, 15);
		contentPane.add(lblIva);
		
		JRadioButton rdbtnPrimera_1 = new JRadioButton("4%");
		rdbtnPrimera_1.setBounds(68, 221, 77, 23);
		contentPane.add(rdbtnPrimera_1);
		
		rdbtnPrimera_1_1 = new JRadioButton("10%");
		rdbtnPrimera_1_1.setBounds(149, 221, 77, 23);
		contentPane.add(rdbtnPrimera_1_1);
		
		rdbtnPrimera_1_1_1 = new JRadioButton("21%");
		rdbtnPrimera_1_1_1.setBounds(230, 221, 77, 23);
		contentPane.add(rdbtnPrimera_1_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Aplicar Tasa");
		chckbxNewCheckBox.setBounds(333, 221, 129, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Ver datos  Tecleados");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(18, 268, 199, 25);
		contentPane.add(btnNewButton);
		
		JButton btnLimpiarDatos = new JButton("Limpiar Datos");
		btnLimpiarDatos.setBounds(263, 268, 199, 25);
		contentPane.add(btnLimpiarDatos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 312, 450, 101);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
