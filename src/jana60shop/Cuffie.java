package jana60shop;

public class Cuffie extends Prodotto{
	/*- Cuffie, caratterizzate dal colore e se sono wireless o cablate
*/
	//nuovi parametri
	private String colore;
	private boolean wireless;
	
	//costruttore
	public Cuffie(int codice, String nome, String marca, double prezzo, int iva, String colore, boolean wireless) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
	}
	
	

	public String getColore() {
		return colore;
	}



	public void setColore(String colore) {
		this.colore = colore;
	}



	public boolean isWireless() {
		return wireless;
	}



	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}



	public String toString() {
		String toString = super.toString() + " " + colore;
		if(wireless) {
			toString += " le cuffie sono wireless";
		}else {
			toString += " le cuffie non sono wireless";
		}
		return toString;
	}
}
