package jana60.valutazioni;

public class Studente {

	int idStudente;
	int percAssenze;
	double mediaVoti;
	boolean promosso;
	
	Studente(int idStudente, int percAssenze, double mediaVoti) {
		this.idStudente = idStudente;
		this.percAssenze = percAssenze;
		this.mediaVoti = mediaVoti;
	}
	
	boolean promossoOBocciato () { 
		promosso = false;
			
		if (percAssenze < 50 && percAssenze > 25 && mediaVoti > 2) {
			promosso = true;
		} else if (percAssenze < 25 && mediaVoti >= 2) {
			promosso = true;
		}
			return promosso;
	}
}

