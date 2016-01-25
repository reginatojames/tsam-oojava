package reginato.james.commercialista;

public class Dipendente extends Cliente{
	
	public Dipendente(String nome, String cognome, String codFiscale) {
		super(nome, cognome, codFiscale);
		// TODO Auto-generated constructor stub
	}

	public double calcolaParcella(){
		double tot = 0;
		
		tot = 50;
		
		return tot;
	}
}
