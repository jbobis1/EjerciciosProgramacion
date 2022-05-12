package capitulo07.bloque01.bloque05;

import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.File;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;


import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class DatosPersonales extends JPanel {

	private JTextField jtfId;
	private JTextField jtfNombre;
	private JTextField jtfApellido1;
	private JTextField jtfApellido2;
	private JTextField jtfDni;
	private JTextField jtfDireccion;
	private JTextField jtfEmail;
	private JTextField jtfTelefono;
	JColorChooser jColorChooser;
	JPanel jpPanelParaColorear = new JPanel();
	
	
	private JLabel lblSexo;

	JComboBox<TipologiaSexo> comboBox;
	private JPanel panel;
	private JButton btnNewButton;
	byte[] imagenEnArrayDeBytes;
	private JScrollPane scrollPane;
	private JButton Actualizar;
	private JLabel lblNewLabel_8;
	private JTextField jtfColor;
	private JButton btnNewButton_1;
	/**
	 * Create the panel.
	 */
	public DatosPersonales() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("id");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 5);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 0;
		add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 1;
		add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido1");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfApellido1 = new JTextField();
		GridBagConstraints gbc_jtfApellido1 = new GridBagConstraints();
		gbc_jtfApellido1.insets = new Insets(0, 0, 5, 5);
		gbc_jtfApellido1.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellido1.gridx = 1;
		gbc_jtfApellido1.gridy = 2;
		add(jtfApellido1, gbc_jtfApellido1);
		jtfApellido1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido2");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfApellido2 = new JTextField();
		GridBagConstraints gbc_jtfApellido2 = new GridBagConstraints();
		gbc_jtfApellido2.insets = new Insets(0, 0, 5, 5);
		gbc_jtfApellido2.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellido2.gridx = 1;
		gbc_jtfApellido2.gridy = 3;
		add(jtfApellido2, gbc_jtfApellido2);
		jtfApellido2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Dni");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfDni = new JTextField();
		GridBagConstraints gbc_jtfDni = new GridBagConstraints();
		gbc_jtfDni.insets = new Insets(0, 0, 5, 5);
		gbc_jtfDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDni.gridx = 1;
		gbc_jtfDni.gridy = 4;
		add(jtfDni, gbc_jtfDni);
		jtfDni.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Direccion");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfDireccion = new JTextField();
		GridBagConstraints gbc_jtfDireccion = new GridBagConstraints();
		gbc_jtfDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_jtfDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDireccion.gridx = 1;
		gbc_jtfDireccion.gridy = 5;
		add(jtfDireccion, gbc_jtfDireccion);
		jtfDireccion.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("email");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		jtfEmail = new JTextField();
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 5);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 1;
		gbc_jtfEmail.gridy = 6;
		add(jtfEmail, gbc_jtfEmail);
		jtfEmail.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Telefono");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 7;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		jtfTelefono = new JTextField();
		GridBagConstraints gbc_jtfTelefono = new GridBagConstraints();
		gbc_jtfTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_jtfTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfTelefono.gridx = 1;
		gbc_jtfTelefono.gridy = 7;
		add(jtfTelefono, gbc_jtfTelefono);
		jtfTelefono.setColumns(10);
		
		lblSexo = new JLabel("sexo");
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSexo.anchor = GridBagConstraints.EAST;
		gbc_lblSexo.gridx = 0;
		gbc_lblSexo.gridy = 8;
		add(lblSexo, gbc_lblSexo);
		
		comboBox = new JComboBox<TipologiaSexo>();
		
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 8;
		add(comboBox, gbc_comboBox);
		
		btnNewButton = new JButton("Insertar Foto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionarFicheroImagen ();
			}
		});
		
		lblNewLabel_8 = new JLabel(" Color Preferido");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 9;
		add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		jtfColor = new JTextField();
		jtfColor.setText("");
		

	
		
		GridBagConstraints gbc_jtfColor = new GridBagConstraints();
		gbc_jtfColor.insets = new Insets(0, 0, 5, 5);
		gbc_jtfColor.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfColor.gridx = 1;
		gbc_jtfColor.gridy = 9;
		add(jtfColor, gbc_jtfColor);
		jtfColor.setColumns(10);
		this.add(this.jpPanelParaColorear, gbc_jtfColor);
		
		btnNewButton_1 = new JButton("Cambiar Color");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				seleccionaColor ();
				
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 9;
		add(btnNewButton_1, gbc_btnNewButton_1);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 10;
		add(btnNewButton, gbc_btnNewButton);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 10;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 0;
		panel.add(scrollPane, gbc_scrollPane_1);
		

	JPopupMenu popup = getPopUpMenu();
		
		
		
		
		scrollPane.setComponentPopupMenu(popup);
		
		// Evento para mostrar el men� en las coordenadas que correspondan
		this.addMouseListener(new MouseAdapter() {
 
            @Override
            public void mousePressed(MouseEvent e) {
                showPopup(e);
            }
 
            @Override
            public void mouseReleased(MouseEvent e) {
                showPopup(e);
            }
 
            
            /**
             * M�todo llamado cuando se detecta el evento de rat�n, mostrar� el men�
             * @param e
             */
            private void showPopup(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popup.show(e.getComponent(),
                            e.getX(), e.getY());
                    
                	JPopupMenu menu = new JPopupMenu();
                	if (imagenEnArrayDeBytes != null && imagenEnArrayDeBytes.length > 0) {
                		ImageIcon icono = new ImageIcon(imagenEnArrayDeBytes);
                		
                		
                		menu.add("Dimensiones: " + icono.getIconWidth() + icono.getIconHeight() );
                		
                		menu.addSeparator();
                		menu.add(crearNuevoMenuItem("Cambiar imagen", "next.png"));
                	//	seleccionarFicheroImagen ();

                		}
                    
                }
            }
        });
		
		
		
		Actualizar = new JButton("Actualizar");
		Actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				actualizarImagenEnTabla();
			}
		});
		GridBagConstraints gbc_Actualizar = new GridBagConstraints();
		gbc_Actualizar.gridx = 2;
		gbc_Actualizar.gridy = 10;
		add(Actualizar, gbc_Actualizar);
		
		
		cargarvalores();
		selecionarvalores(getidsexo());

	}
	
	
	/**
	 * 
	 */
	
	public void cargarvalores() {
		List<TipologiaSexo> lista = ControladorTipogiaSexo.obtenerTodossexo();
		for (int i = 0; i < lista.size(); i++) {
			comboBox.addItem(lista.get(i));
		}
	}
	
	/**
	 * 
	 * @param idsexo
	 */
	public void selecionarvalores(int idsexo) {
		for (int i = 0; i < comboBox.getItemCount(); i++) {
		if (((TipologiaSexo) comboBox.getItemAt(i)).getId() == idsexo ) {
			comboBox.setSelectedIndex(i);
			}
		}	
	}
	
	/**
	 * 
	 * @return
	 */
	public int getidsexo() {
	return ((TipologiaSexo) comboBox.getSelectedItem()).getId();
		
	}
	
	/**
	 * 
	 * @param id
	 */
	public void setId (int id) {
		this.jtfId.setText("" + id);
	}

	public int getId () {
		return Integer.parseInt(this.jtfId.getText());
	}
	
	

	/**
	 * @return the jtfId
	 */


	/**
	 * 
	 * @param newNombre
	 */
	public void setNombre (String Nombre) {
		this.jtfNombre.setText(Nombre);
	}

	public String getNombre () {
		return this.jtfNombre.getText();
	}
	
	/**
	 * 
	 * @param Apellido
	 */
	public void setApellido (String apellido) {
		this.jtfApellido1.setText(apellido);
	}

	public String getApellido () {
		return this.jtfApellido1.getText();
	}
	
	
	/**
	 * 
	 * @param apellido2
	 */
	public void setApellido2 (String apellido2) {
		this.jtfApellido2.setText(apellido2);
	}

	public String getApellido2 () {
		return this.jtfApellido2.getText();
	}

	
	/**
	 * 
	 * @param Dni
	 */
	public void setDni (String Dni) {
		this.jtfDni.setText(Dni);
	}

	public String getDni () {
		
		return this.jtfDni.getText();
	}
	
	/**
	 * 
	 * @param Direccion
	 */
	public void setDireccion (String Direccion) {
		this.jtfDireccion.setText(Direccion);
	}

	public String getDireccion () {
		return this.jtfDireccion.getText();
	}
	
	/**
	 * 
	 * @param Email
	 */
	public void setEmail (String Email) {
		this.jtfEmail.setText(Email);
	}

	public String getEmail() {
		return this.jtfEmail.getText();
	}
	
	public void setTelefono (String Telefono) {
		this.jtfTelefono.setText(Telefono);
	}

	public String getTelefono() {
		return this.jtfTelefono.getText();
	}
	
	
	private void seleccionarFicheroImagen() {
		JFileChooser jfileChooser = new JFileChooser();
		
		// Configurando el componente
		
		// Tipo de selección que se hace en el diálogo
		jfileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // Sólo selecciona ficheros

		// Filtro del tipo de ficheros que puede abrir
		jfileChooser.setFileFilter(new FileFilter() {
			
			@Override
			public String getDescription() {
				return "Archivos de imagen *.jpg *.png *.gif";
			}
			
			@Override
			public boolean accept(File f) {
				if (f.isDirectory() || (f.isFile() &&
						(f.getAbsolutePath().endsWith(".jpg") || 
								f.getAbsolutePath().endsWith(".jpeg")|| 
								f.getAbsolutePath().endsWith(".png")|| 
								f.getAbsolutePath().endsWith(".gif"))))
					return true;
				return false;
			}
		});
		
		// Abro el diálogo para la elección del usuario
		int seleccionUsuario = jfileChooser.showOpenDialog(null);
		
		if (seleccionUsuario == JFileChooser.APPROVE_OPTION) {
			File fichero = jfileChooser.getSelectedFile();
			
			if (fichero.isFile()) {
				try {
					this.imagenEnArrayDeBytes = Files.readAllBytes(fichero.toPath());
					setImagen(imagenEnArrayDeBytes);
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
		
	
	/**
	 * 
	 */
	public void mostrarimagen () {
		if (imagenEnArrayDeBytes != null && imagenEnArrayDeBytes.length > 0) {
			ImageIcon icono = new ImageIcon(imagenEnArrayDeBytes);
			JLabel lblIcono = new JLabel(icono);
			scrollPane.setViewportView(lblIcono);
		}
		else {
			JLabel lblIcono = new JLabel("Sin imagen");
			scrollPane.setViewportView(lblIcono);
		}

	}
	
	
	/**
	 * 
	 */
	private void actualizarImagenEnTabla() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centroeducativo?serverTimezone=UTC","java", "Abcdefgh.1");
		   
			PreparedStatement ps = (PreparedStatement) conexion.
					prepareStatement("UPDATE centroeducativo.estudiante set imagen=? where id=?");
			
			ps.setBytes(1, imagenEnArrayDeBytes);
			ps.setInt(2, 1);
		   
			int registrosAfectados = ps.executeUpdate();
			if (registrosAfectados > 0) {
				JOptionPane.showMessageDialog(null, "Inserción correcta en la tabla");
			}
			
			// Cierre de los elementos
			ps.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}


	/**
	 * @return the imagenEnArrayDeBytes
	 */
	public byte[] getImagen() {
		return imagenEnArrayDeBytes;
	}


	/**
	 * @param imagenEnArrayDeBytes the imagenEnArrayDeBytes to set
	 */
	public void setImagen(byte[] imagenEnArrayDeBytes) {
		this.imagenEnArrayDeBytes = imagenEnArrayDeBytes;
	}
	
	public void seleccionaColor () {
		Color color = jColorChooser.showDialog(null, "Seleccione un Color", Color.gray);
		// Si el us	JPopupMenu menu = new JPopupMenu();uario pulsa sobre aceptar, el color elegido no será nulo
		if (color != null) {
			String strColor = "#"+Integer.toHexString(color.getRGB()).substring(2);
			this.jtfColor.setText(strColor);
			this.jpPanelParaColorear.setBackground(color);
		}
	}

	public String getColor() {
		return this.jtfColor.getText();
	}


	public void setColor(String color) {
		this.jtfColor.setText(color);
		this.setBackground(Color.decode(color));
		
	
	}
	
	/**
	 * 
	 * @return
	 */
	private JPopupMenu getPopUpMenu () {
		JPopupMenu menu = new JPopupMenu();
//	
//		if (imagenEnArrayDeBytes != null && imagenEnArrayDeBytes.length > 0) {
//		ImageIcon icono = new ImageIcon(imagenEnArrayDeBytes);
//		
//		
//		menu.add("Dimensiones: " + icono.getIconWidth() + icono.getIconHeight() );
//		
//		menu.addSeparator();
//		menu.add(crearNuevoMenuItem("Cambiar imagen", "next.png"));
//	//	seleccionarFicheroImagen ();
//
//		}
		return menu;
}
	
	
	
	/**
	 * Menú Item para salir de la aplicación
	 * @return
	 */
	private JMenuItem crearNuevoMenuItem (String titulo, String nombreIcono) {
        JMenuItem item = new JMenuItem(titulo);
        //item.setIcon(CacheImagenes.getCacheImagenes().getIcono(nombreIcono));
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            	seleccionarFicheroImagen ();
            }
        });
        
        return item;
	}
	

	
}
