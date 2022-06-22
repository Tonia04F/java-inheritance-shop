package jana60shop;

public class Shop {

	public static void main(String[] args) {
		/*Lo shop gestisce diversi tipi di prodotto:


Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i 
vari sotto tipi di prodotto e testate le funzionalità delle vostre classi in una classe Main con metodo main.

BONUS: create una classe Catalogo con metodo main, in cui chiedete all’utente di valorizzare un catalogo di 
prodotti con i dati inseriti tramite scanner. Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo un o Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno. Al termine dell’inserimento stampate il catalogo (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)*/ 

		Smartphone samsung = new Smartphone(123, "a12", "samsung", 140.5, 21, 12344566, 128);
		samsung.getCodice();
		samsung.getMarca();
		samsung.getNome();
		System.out.println("Il prodotto acquistato è: " + samsung.toString());
		samsung.calcoloPrezzoIva(140.5, 21);
		System.out.println("vuoi cambiare prodotto?");
		samsung.setImei(12345678);
		samsung.setMemoria(64);
		samsung.setNome("a22");
		samsung.setPrezzo(170);
		samsung.calcoloPrezzoIva(170, 21);
		System.out.println("Hai cambiato il vecchio prodotto con uno nuovo: " + samsung.toString());
		
		Televisore sharp = new Televisore(456, "c21", "sharp", 500.1, 21, 50, true);
		
		Cuffie sony = new Cuffie(789,"ch17", "sony", 150.7, 21, "verde", true);
		
	}

}
