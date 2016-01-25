package reginato.james.commercialista;

public class LiberoProfessionista extends Cliente{

	private String piva;
	private int nFatture;
	
	public LiberoProfessionista(String nome, String cognome, String codFiscale, String piva, int nFatture) {
		super(nome, cognome, codFiscale);
		
		this.piva = piva;
		this.nFatture = nFatture;
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
		
		tot = (50) + (0.5 * nFatture);
		
		return tot;
	}
}
