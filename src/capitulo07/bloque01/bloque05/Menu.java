package capitulo07.bloque01.bloque05;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;




public class Menu extends JMenuBar {

	/**
	 * 
	 */
	public Menu () {
		// Menú Archivo de la aplicación
        JMenu menuArchivo = new JMenu("Gestion");
        menuArchivo.add(crearNuevoMenuItem("Curso", "ruedadentada.png", KeyStroke.getKeyStroke(KeyEvent.VK_A, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())));
  
        this.add(menuArchivo);
        
  
        
	}
	
	
	
	/**
	 * Menú Item para salir de la aplicación
	 * @return
	 */
	private JMenuItem crearNuevoMenuItem (String titulo, String nombreIcono, KeyStroke atajoTeclado) {
        JMenuItem item = new JMenuItem(titulo);
   
        item.setAccelerator(atajoTeclado);
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Han hecho clic en: " + titulo);
            }
        });
        
        return item;
	}
	
	/**
	 * 
	 * @param titulo
	 * @param nombreIcono
	 * @return
	 */
	private JMenuItem crearNuevoCheckBoxMenuItem (String titulo, String nombreIcono) {
        JCheckBoxMenuItem item = new JCheckBoxMenuItem(titulo);
     
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Han hecho clic en el JCheckBox: " + titulo + " - Seleccionado: " + item.isSelected());
            }
        });
        
        return item;
	}

	/**
	 * 
	 * @param titulo
	 * @param nombreIcono
	 * @return
	 */
	private JMenuItem crearNuevoRadioButtonMenuItem (String titulo, String nombreIcono, ButtonGroup buttonGroup) {
        JRadioButtonMenuItem item = new JRadioButtonMenuItem(titulo);
  
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Han hecho clic en el JRadioButton: " + titulo + " - Seleccionado: " + item.isSelected());
            }
        });
        buttonGroup.add(item);
        
        return item;
	}

}
