package capitulo04.bloque00;

public class GesionarCromo {
 private String  nombre;
 private int altura,peso;
 private float puntos;
 
	public GesionarCromo( String  nombre,int altura, int peso,float puntos){
		  this.nombre=nombre;
		  this.altura=altura;
		  this.peso=peso;
		  this.puntos=puntos;
	}
	
	@Override
	public String toString() {
		return "GesionarCromo [nombre=" + nombre + ", altura=" + altura + ", peso=" + peso + ", puntos=" + puntos + "]";
	}
	




	public String getnombres () {
		return this.nombre;
	}

	public void setnombre (String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getrelacionAspecto () {
		return this.altura;
	}

	public void setrelacionAspecto (int altura) {
		this.altura = altura;
	}
	
	public int getpeso () {
		return this.peso;
	}

	public void setpeso (int peso) {
		this.peso = peso;
	}
	public float getpuntos () {
		return this.puntos;
	}

	public void setpuntos (float puntos) {
		this.puntos = puntos;
	}
	
}