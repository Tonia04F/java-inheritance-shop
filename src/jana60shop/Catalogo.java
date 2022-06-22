package jana60shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
/*BONUS: create una classe Catalogo con metodo main, in cui chiedete all’utente di valorizzare un catalogo di 
prodotti con i dati inseriti tramite scanner. 
Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo un o Smarphone o un Televisore o
 Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.
  Al termine dell’inserimento stampate il catalogo 
  (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)*/
		
		Scanner sc = new Scanner(System.in);
		
		Prodotto[] catalogo = new Prodotto[5];
		
		for(int i = 0 ; i < catalogo.length; i++) {
			
			System.out.println("Che prodotto vuoi aggiungere? Selezione 1 per una nuova tv, 2 per un nuovo smartphone, 3 per nuove cuffie: ");
			String scelta = sc.nextLine();
			
			switch(scelta) {
			case "1": //televisore
				System.out.println("inserisci codice: ");
				int codiceTv = sc.nextInt();
				System.out.println("inserisci nome: ");
				String nomeTv = sc.nextLine();
				System.out.println("inserisci marca: ");
				String marcaTv = sc.nextLine();
				System.out.println("inserisci prezzo: ");
				int prezzoFinaleTv = sc.nextInt();
				System.out.println("inserisci iva: ");
				int iva = sc.nextInt();
				System.out.println("inserisci dimensioni: ");
				int dimensioniTv = sc.nextInt();
				System.out.println("è wireless? ");
				boolean wireless = true;
				Televisore nuovoTelevisore = new Televisore(codiceTv, nomeTv, marcaTv, prezzoFinaleTv, iva, dimensioniTv, wireless);
				System.out.println("Hai aggiunto un nuovo televisore: " + nuovoTelevisore);
				break;
			case "2"://smartphone
				System.out.println("inserisci codice: ");
				int codiceCell = sc.nextInt();
				System.out.println("inserisci nome: ");
				String nomeCell = sc.nextLine();
				System.out.println("inserisci marca: ");
				String marcaCell = sc.nextLine();
				System.out.println("inserisci prezzo: ");
				int prezzoFinaleCell = sc.nextInt();
				System.out.println("inserisci iva: ");
				int ivaCell = sc.nextInt();
				System.out.println("inserisci dimensioni: ");
				int imei = sc.nextInt();
				System.out.println("è wireless? ");
				int memoria = sc.nextInt();
				Smartphone nuovoCellulare = new Smartphone(codiceCell, nomeCell, marcaCell, prezzoFinaleCell, ivaCell, imei, memoria);
				System.out.println("Hai aggiunto un nuovo televisore: " + nuovoCellulare);
				break;
			case "3"://cuffie
				System.out.println("inserisci codice: ");
				int codiceCuffie = sc.nextInt();
				System.out.println("inserisci nome: ");
				String nomeCuffie = sc.nextLine();
				System.out.println("inserisci marca: ");
				String marcaCuffie = sc.nextLine();
				System.out.println("inserisci prezzo: ");
				int prezzoFinaleCuffie = sc.nextInt();
				System.out.println("inserisci iva: ");
				int ivaCuffie = sc.nextInt();
				System.out.println("inserisci dimensioni: ");
				String colore = sc.nextLine();
				System.out.println("è wireless? ");
				boolean wirelessCuffie = true;
				Cuffie nuovoCuffie = new Cuffie(codiceCuffie, nomeCuffie, marcaCuffie, prezzoFinaleCuffie, ivaCuffie, colore, wirelessCuffie);
				System.out.println("Hai aggiunto un nuovo televisore: " + nuovoCuffie);
				break;
			default:
				System.out.println("scelta non valida");
				break;
			}
		}

	}

}
