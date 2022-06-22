package jana60shop;

import java.text.DecimalFormat;

public class Prodotto {
	DecimalFormat df = new DecimalFormat("#.00€");
	
/*Creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- marca
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri 
metodi di “utilità” per fare in modo che:
- il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva formattato*/
	
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private int iva;
	
	double prezzoFinale;
	
	//costruttore
	public Prodotto(int codice, String nome, String marca, double prezzo, int iva) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
		
	}
	
	//getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}
	
	//metodo iva
	public double calcoloPrezzoIva() {
		double prezzoFinale = prezzo -(prezzo * iva % 100);
	return prezzoFinale;
		
	}
	public String toString() {
		return codice + " " + nome + " " + marca + " " + calcoloPrezzoIva();
	}
	
	
	
}
