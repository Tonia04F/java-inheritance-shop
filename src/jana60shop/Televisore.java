package jana60shop;

public class Televisore extends Prodotto{
/*- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
*/
	private int dimensioni;
	private boolean smart;
	
	
	public Televisore(int codice, String nome, String marca, double prezzo, int iva, int dimensioni, boolean smart) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}
	
	


	public int getDimensioni() {
		return dimensioni;
	}



	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}



	public boolean isSmart() {
		return smart;
	}



	public void setSmart(boolean smart) {
		this.smart = smart;
	}



	public String toString() {
		String toString = super.toString() + " " + dimensioni;
		if(smart) {
			toString += "la tv è smart";
		}else {
			toString += "la tv non è smart";
		}
		return toString;
	}
	
}
