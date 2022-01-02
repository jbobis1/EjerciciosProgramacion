package capitulo04.bloque02;

import javax.swing.JOptionPane;

public class Menu {
	private Lista arrayPersonas[] = new Lista[3];
	
	public void inicializaPersonas (){
		System.out.println("Menu:");
		System.out.println("0.- Salir");
		System.out.println("1.- Crear Numero aleatorios");	
		System.out.println("2.- calcular la media suma, media y menor ");
		System.out.println("3.- Agregar valores");	
		System.out.println("4.- Eliminar elemento ");
		System.out.println("5.- Imprimir lista ");
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		
		switch(opcion) {
		case 0:
			System.out.printf("Fin");
			break;
				
		case 1:
			for (int i = 0; i < arrayPersonas.length; i++)  {
				int numero = (int)Math.round(Math.random() * (100 - 1)) + 1;
				
				}
			for (int i = 0; i < arrayPersonas.length; i++)  {
			
				 Lista[] numero;
				arrayPersonas[i]=  numero[i];
				System.out.println(arrayPersonas[i]);
				}
		case 2:{
			int suma=0,media=0, mayor=0, menor=0, contador=0, numero=0;
			for (int i = 0; i < arrayPersonas.length; i++) {
				suma+=i;
				contador++;
			}
			System.out.println(suma);
			
			media=suma/contador;
			System.out.println(media);
			
			mayor = numero;
			menor = numero;		
			for (int i = 0; i < arrayPersonas.length -1; i++) {
				 numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
				 
					if (numero >= mayor) {
						mayor = numero;		
					}	
		
					else{
						menor = numero;
					}		
			}
			System.out.println( "El numero Mayor es: " + mayor + " El numero Menor es: " + menor );

		}
			
		case 3:
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			int minimo = Integer.parseInt(JOptionPane.showInputDialog("minimo: "));
			int maximo = Integer.parseInt(JOptionPane.showInputDialog("maximo: "));
			
			for (int i = 0; i < numero; i++) {
			  numero = (int)Math.round(Math.random() * (maximo - minimo)) + minimo;
				System.out.println(numero);
			}
		
		case 4:
			int numerominimo = Integer.parseInt(JOptionPane.showInputDialog("minimo: "));
			int numeromaximo = Integer.parseInt(JOptionPane.showInputDialog("maximo: "));
			
			 
			for (int i = 0; i < arrayPersonas.length; i++) {
			
				if (arrayPersonas < numerominimo || arrayPersonas > numeromaximo) {
					System.out.println(arrayPersonas[i]);
				}
			}	

		case 5:
				
			for (int i = 0; i < arrayPersonas.length; i++) {
				System.out.println(arrayPersonas[i]);
			}
			
		default:
			System.out.printf("ERROR " );
			
		}
	}
}

