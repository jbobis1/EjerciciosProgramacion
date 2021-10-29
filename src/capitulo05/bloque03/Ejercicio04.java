package capitulo05.bloque03;

public class Ejercicio04 {
	public static void main(String[] args) {
		
		int arreglo[] = new int[10];
		// Inicialización de los valores del array
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int)Math.round(Math.random() * (10 - 0)) + 0;
			   System.out.println(arreglo[i]);
		}
        System.out.println();  
        int i, j, menor, pos, tmp;
      for (i = 0; i < arreglo.length - 1; i++) {  
            menor = arreglo[i];                                       
            pos = i;                           
            for (j = i + 1; j < arreglo.length; j++){ 
                  if (arreglo[j] < menor) {          
                      menor = arreglo[j];            
                      pos = j;
                  }
            }
            if (pos != i){                                            
                tmp = arreglo[i];
                arreglo[i] = arreglo[pos];
                arreglo[pos] = tmp;
            }
      	} System.out.println(arreglo[i]);

	}
}
