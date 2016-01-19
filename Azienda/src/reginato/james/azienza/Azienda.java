package reginato.james.azienza;

public class Azienda {
	private String ragoioneSociale;
	private String pIva;
	private Dipendente[] dipendenti;
	
	public int stipendi(){
		int sum = 0;
		for(Dipendente x : dipendenti){
			sum += x.stipendio();
		}
		return sum;
	}

	public String getRagoioneSociale() {
		return ragoioneSociale;
	}

	public void setRagoioneSociale(String ragoioneSociale) {
		this.ragoioneSociale = ragoioneSociale;
	}

	public String getpIva() {
		return pIva;
	}

	public void setpIva(String pIva) {
		this.pIva = pIva;
	}

	public Dipendente[] getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Dipendente[] dipendenti) {
		this.dipendenti = dipendenti;
	}
	
	

}
