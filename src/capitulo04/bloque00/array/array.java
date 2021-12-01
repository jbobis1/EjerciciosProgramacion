package capitulo04.bloque00.array;

import java.util.Arrays;

public class array {

	private NumeroEnteros arrayValores[]= new NumeroEnteros[100];

	public array() {
		
		for(int i=0; i< arrayValores.length;i++) {
		arrayValores[i] = new NumeroEnteros( (int)Math.round(Math.random() * (100 - 0)) + 0);
		}
	}

	public array(NumeroEnteros[] arrayValores) {
		this.arrayValores = arrayValores;
	}
	
	public  void mostrar() {
		for (int i = 0; i < arrayValores.length; i++) {
			System.out.println(arrayValores[i].toString());
		}
	}
	
	public void media() {
		arrayValores = new NumeroEnteros[100];
		int media = 0 , suma =0;
		
		for (int i = 0; i < arrayValores.length; i++) {
			suma= suma + arrayValores[i].getValor();
		}
		media = suma /arrayValores.length;
		System.out.println(suma);
		System.out.println(media);
	}


	@Override
	public String toString() {
		return "array [arrayValores=" + Arrays.toString(arrayValores) + "]";
	}

	/**
	 * @return the arrayValores
	 */
	public NumeroEnteros[] getArrayValores() {
		return arrayValores;
	}

	/**
	 * @param arrayValores the arrayValores to set
	 */
	public void setArrayValores(NumeroEnteros[] arrayValores) {
		this.arrayValores = arrayValores;
	}

	
}
