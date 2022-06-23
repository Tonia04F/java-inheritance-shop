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
//creometodo per controllare se le cuffie sono wireless
	public String isWirelessOrCable() {
		if(wireless) {
			return "le cuffie sono wireless";
		}else {
			return "le cuffie on sono wireless sono cablate";
		}
	}


	public String toString() {
		return super.toString() + " " + colore + " " + isWirelessOrCable();
	}
}
