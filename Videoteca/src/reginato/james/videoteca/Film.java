package reginato.james.videoteca;

public class Film {
	public String titolo;
	public String regista;
	public int annoProd;
	public String attori;
	public int giorni;
	
	public Film(String titolo, String regista, int annoProd, String attori, int giorni){
		this.titolo = titolo;
		this.regista = regista;
		this.annoProd = annoProd;
		this.attori = attori;
		this.giorni = giorni;
	}

	public int getGiorni() {
		return giorni;
	}

	public void setGiorni(int giorni) {
		this.giorni = giorni;
	}
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public int getAnnoProd() {
		return annoProd;
	}

	public void setAnnoProd(int annoProd) {
		this.annoProd = annoProd;
	}

	public String getAttori() {
		return attori;
	}

	public void setAttori(String attori) {
		this.attori = attori;
	}
	
	public double preventivo(){
		
		return 0;
	}
	
}
