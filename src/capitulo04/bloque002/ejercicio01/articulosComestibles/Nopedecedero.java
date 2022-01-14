package capitulo04.bloque002.ejercicio01.articulosComestibles;

public class Nopedecedero extends Articulo{

	public Nopedecedero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nopedecedero(String codigo, String nombre, int precio) {
		super(codigo, nombre, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Nopedecedero [toString()=" + super.toString() + ", getCodigo()=" + getCodigo() + ", getNombre()="
				+ getNombre() + ", getPrecio()=" + getPrecio() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
