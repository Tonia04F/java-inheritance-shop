package jana60shop;

public class Smartphone extends Prodotto {
/*- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria*/
	
	private int imei;
	private int memoria;
	
	//costruttore
	public Smartphone(int codice, String nome, String marca, double prezzo, int iva, int imei, int memoria) {
		super(codice, nome, marca, prezzo, iva);
		this.imei = imei;
		this.memoria = memoria;
	}
	
	
}
