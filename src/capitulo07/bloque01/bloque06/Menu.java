package capitulo07.bloque01.bloque06;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
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

        menuArchivo.add(crearNuevoMenuItem("Materia", "ruedadentada.png", KeyStroke.getKeyStroke(KeyEvent.VK_A, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())));

        menuArchivo.add(crearNuevoMenuItem("Estudiante", "ruedadentada.png", KeyStroke.getKeyStroke(KeyEvent.VK_A, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())));

        menuArchivo.add(crearNuevoMenuItem("Profesor", "ruedadentada.png", KeyStroke.getKeyStroke(KeyEvent.VK_A, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())));

        this.add(menuArchivo);
        
	}
	
	
	/**
	 * Menú Item para salir de la aplicación
	 * @return
	 */
	private JMenuItem crearNuevoMenuItem (String titulo, String nombreIcono, KeyStroke atajoTeclado) {
        JMenuItem item = new JMenuItem(titulo);
        
        String Materia = "Materia";
        String Curso = "Curso";
        String Estudiante = "Estudiante";
        String Profesor = "Profesor";
   
        item.setAccelerator(atajoTeclado);
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Han hecho clic en: " + titulo);
                
                
    				JDialog dialogo = new JDialog();
    				// El usuario no puede redimensionar el diálogo
    				dialogo.setResizable(true);
    				// título del díalogo
    				dialogo.setTitle("Centro Educativo");
    				
    				// Introducimos el panel creado sobre el diálogo
    				
    				
    				if (titulo==Materia) {
    				dialogo.setContentPane(new VistaMateria());
    					}
    				
    				if (titulo==Curso) {
        				dialogo.setContentPane(new VistaCursos());
        					}
        				
    				if (titulo==Estudiante) {
        				dialogo.setContentPane(new VistaEstudiante());
        					}
        				
    				if (titulo==Profesor) {
        				dialogo.setContentPane(new VistaProfesor());
        					}
        				
    			
    				// Empaquetar el di�logo hace que todos los componentes ocupen el espacio que deben y el lugar adecuado
    				dialogo.pack();
    				// El usuario no puede hacer clic sobre la ventana padre, si el Di�logo es modal
    				dialogo.setModal(true);
    				// Centro el di�logo en pantalla
    				dialogo.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width)/2 - dialogo.getWidth()/2, 
    						(Toolkit.getDefaultToolkit().getScreenSize().height)/2 - dialogo.getHeight()/2);
    				// Muestro el di�logo en pantalla
    				dialogo.setVisible(true);
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




}
