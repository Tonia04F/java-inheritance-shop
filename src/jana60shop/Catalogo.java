package jana60shop;

import java.util.Scanner;

import java.util.Iterator;

public class Catalogo {

	public static void main(String[] args) {
/*BONUS: create una classe Catalogo con metodo main, in cui chiedete all’utente di valorizzare un catalogo di 
prodotti con i dati inseriti tramite scanner. 
Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo un o Smarphone o un Televisore o
 Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.
  Al termine dell’inserimento stampate il catalogo 
  (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)*/
		
		Scanner sc = new Scanner(System.in);
		
		Prodotto[] catalogo = new Prodotto[3];
		
		for(int i = 0 ; i < catalogo.length; i++) {
			
			System.out.println("Scegli prodotto da inserire? Digita 1 per inserire una tv, 2 per inserire uno smartphone , 3 per inserire cuffie:  ");
			String scelta = sc.nextLine();
			
			//individuo campi comuni per tutti i prodotti
			
			System.out.println("inserisci nome: ");
			String nome = sc.nextLine();
			System.out.println("inserisci marca: ");
			String marca = sc.nextLine();
			System.out.println("inserisci prezzo: ");
			int prezzo = Integer.parseInt(sc.nextLine());
			System.out.println("inserisci iva: ");
			int iva = Integer.parseInt(sc.nextLine());
			
			//nello switch do le tre scelte disponibili e aggiungo ad ogni prodotto gli attributi che non sono condivisi con gli altri
			switch(scelta) {
			case "1": //televisore
				
				System.out.println("dimensioni: ");
				int dimensioni= Integer.parseInt(sc.nextLine());
				System.out.println("smart?: clicca s per dire si n per dire no");
				String isSmart= sc.nextLine();
				//controllo se la tv è smart o no 
				boolean smart = false;
				if(isSmart.equals("s")) {
					smart=true;
				}else {
					smart = false;
				}
				//creo un nuovo tv da mettere nel catalogo
				Televisore newTv= new Televisore(i, nome, marca, prezzo, iva, dimensioni, smart);
				//lo aggiungo al catalogo
				catalogo[i] = newTv;
				break;
			case "2"://smartphone
				
				System.out.println("imei: ");
				int imei= sc.nextInt();
				System.out.println("memoria: ");
				int memoria= sc.nextInt();
				//creo un nuovo smartphone da mettere nel catalogo
				Smartphone newSmartphone= new Smartphone(i, nome, marca, prezzo, iva, imei, memoria);
				//lo aggiungo al catalogo
				catalogo[i] = newSmartphone;
				break;
			case "3"://cuffie
				
				System.out.println("colore: ");
				String colore= sc.nextLine();
				System.out.println("wireless?: (s/n ");
				String isWireless= sc.nextLine();
				//controllo se le cuffie sono wireless
				boolean wireless = false;
				if(isWireless.equals("s")) {
					wireless=true;
				}
				
				Cuffie newCuffie = new Cuffie(i, nome, marca, prezzo, iva, colore, wireless);
				//lo aggiungo al catalogo
				catalogo[i] = newCuffie;
				break;
				
			default:
				
				break;
			}
		}
		System.out.println("Il nuovo catalogo è pronto: ");
		for(int j = 0; j < catalogo.length; j++) {
			System.out.println(catalogo[j]);
		}
sc.close();
	}

}
