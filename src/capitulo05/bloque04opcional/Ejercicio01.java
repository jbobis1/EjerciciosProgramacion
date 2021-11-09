package capitulo05.bloque04opcional;

public class Ejercicio01 {
    static int[] separaParesImpares(int[] lista){
        
        int i, posicionNuevoIzq=0, posicionNuevoDer=lista.length-1;
        
		int array[] = new int[10];
		System.out.println("Array Aleatorio:");
		// Inicialización de los valores del array
		for (i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random() * (100 - 0)) + 0;
			   System.out.print(array[i]+"-");
		}
        for (i=0;i < lista.length;i++){
            if (lista[i]%2==0){
                array[posicionNuevoIzq]=lista[i];
                posicionNuevoIzq++;
            } else {
            	array[posicionNuevoDer]=lista[i];
                posicionNuevoDer--;
            } 
            System.out.print(lista[i]);
        }
        return array;
        
    }
    


}
