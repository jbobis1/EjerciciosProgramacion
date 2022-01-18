package capitulo04.bloque002.ejercicio01.ventanacanva;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase que sobrescribe un objeto de tipo Canvas. Lo utilizaremos para poder pintar sobre él todo lo que queramos
 * @author Usuario
 *
 */
public class MiCanvas extends Canvas {
	/**
	 * Sobrescritura del méotod paint(), aquí tengo el control sobre aquello que se va a pintar en pantalla.
	 */
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(200,300,150,150);
		
		g.setColor(Color.RED);
		g.fillRect(200,20,200,100);
	
		g.setColor(Color.BLUE);
		 int [] vx2 = {500, 550, 450};
	     int [] vy2 = {270, 320, 320};
        g.fillPolygon (vx2, vy2, 3);
          
	}
}
