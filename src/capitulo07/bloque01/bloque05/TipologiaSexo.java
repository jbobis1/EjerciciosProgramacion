package capitulo07.bloque01.bloque05;

public class TipologiaSexo {

	private int id;
	private String tipologiasexo;
	
	
	
	public TipologiaSexo() {
		super();
	}



	public TipologiaSexo(int id, String tipologiasexo) {
		super();
		this.id = id;
		this.tipologiasexo = tipologiasexo;
	}



	@Override
	public String toString() {
		return "" + tipologiasexo + "";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTipologiasexo() {
		return tipologiasexo;
	}



	public void setTipologiasexo(String tipologiasexo) {
		this.tipologiasexo = tipologiasexo;
	}
	
	
	

	
	
	
}
