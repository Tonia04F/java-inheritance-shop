package jana60shop;

public class Shop {

	public static void main(String[] args) {
		/*Lo shop gestisce diversi tipi di prodotto:


Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i 
vari sotto tipi di prodotto e testate le funzionalità delle vostre classi in una classe Main con metodo main.

*/

		Smartphone samsung = new Smartphone(123, "a12", "samsung", 140.5, 21, 123876, 128);
		System.out.println("Il prodotto acquistato è: " + samsung.toString());
		System.out.println("vuoi cambiare prodotto?");
		samsung.setImei(12345678);
		samsung.setMemoria(64);
		samsung.setNome("a22");
		samsung.setPrezzo(170);
		samsung.calcoloPrezzoIva();
		System.out.println("Hai cambiato il vecchio prodotto con uno nuovo: " + samsung.toString());
		
		Televisore sharp = new Televisore(456, "c21", "sharp", 500.1, 21, 50, true);
		System.out.println("Il prodotto acquistato è: " + sharp.toString());
		
		
		
		Cuffie sony = new Cuffie(789,"ch17", "sony", 150.7, 21, "verde", true);
		System.out.println("Il prodotto acquistato è: " + sony.toString());
		
		
	}

}
