package jana60.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//variabili
		int idStudente;
		double mediaVoti;
		int percAssenze;
		int studentiPromossi = 0;
		
		//array studenti
		Studente[] arrayStudenti = new Studente[3];
		
		//apro scanner
		Scanner scan = new Scanner(System.in);

		//chiedo dati studenti
		for (int i=0; i<arrayStudenti.length;i++) {
			idStudente = i + 1;
			System.out.println("Id studente: " + idStudente);
			
			System.out.print("Inserisci percentuale assenze: ");
			percAssenze = Integer.parseInt(scan.nextLine());
			
			System.out.print("Inserisci media voti: ");
			mediaVoti = Double.parseDouble(scan.nextLine());
			
			//inseristo i dati alla posizione i-esima dell'array
			arrayStudenti[i] = new Studente (idStudente, percAssenze, mediaVoti);		
		}
		
		//stampo a schermo se é promosso o bocciato
		 for (int i = 0; i < arrayStudenti.length; i++) {
			 
			 idStudente = i + 1;
			 
			 if(arrayStudenti[i].promossoOBocciato()) {
				 
				 System.out.println("Lo studente " + idStudente + " é stato promosso");
				 studentiPromossi++;
				 
			 }else {
				 
				 System.out.println("Lo studente " + idStudente + " é stato bocciato");
				 
			 }
		}
		 
		 //stampo a schermo il totale degli studenti promossi
		 System.out.println("Gli studenti promossi in totale sono: " + studentiPromossi);
		 scan.close();
		 }
	}


