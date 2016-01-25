package reginato.james.commercialista;

public class Imprenditore extends Cliente{
	
	private String ragioneSocialeSoc;
	private String piva;
	private int nFatture;
	
	public Imprenditore(String nome, String cognome, String codFiscale, String piva, int nFatture, String ragioneSocialeSoc) {
		super(nome, cognome, codFiscale);
		
		this.ragioneSocialeSoc = ragioneSocialeSoc;
		this.piva = piva;
		this.nFatture = nFatture;
	}
	
	public String getRagioneSocialeSoc() {
		return ragioneSocialeSoc;
	}
	public void setRagioneSocialeSoc(String ragioneSocialeSoc) {
		this.ragioneSocialeSoc = ragioneSocialeSoc;
	}
	public String getPiva() {
		return piva;
	}
	public void setPiva(String piva) {
		this.piva = piva;
	}
	public int getnFatture() {
		return nFatture;
	}
	public void setnFatture(int nFatture) {
		this.nFatture = nFatture;
	}
	
	public double calcolaParcella(){
		double tot = 0;
		
		if(nFatture > 100){
			tot = 500 +(nFatture - 100);
		}else{
			tot = 500;
		}
		
		return tot;
	}
}
