package capitulo07.bloque01.bloque04;

import java.util.Date;

public class Venta {

	private int id;
	private int idCliente;
	private int idConcesionario;
	private int idCoche;
	private Date fecha;
	private String precio;
	
	
	
	public Venta() {
		super();
	}



	public Venta(int id, int idCliente, int idConcesionario, int idCoche, Date fecha, String precio) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idConcesionario = idConcesionario;
		this.idCoche = idCoche;
		this.fecha = fecha;
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Venta [id=" + id + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}



	public int getIdConcesionario() {
		return idConcesionario;
	}



	public void setIdConcesionario(int idConcesionario) {
		this.idConcesionario = idConcesionario;
	}



	public int getIdCoche() {
		return idCoche;
	}



	public void setIdCoche(int idCoche) {
		this.idCoche = idCoche;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public String getPrecio() {
		return precio;
	}



	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	
	
}
