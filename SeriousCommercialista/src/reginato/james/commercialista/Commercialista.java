package reginato.james.commercialista;

public class Commercialista {
	
	Cliente[] clienti;
	
	public Cliente[] getClienti() {
		return clienti;
	}

	public void setClienti(Cliente[] clienti) {
		this.clienti = clienti;
	}
	
	public double calcolaParcelle(){
		double tot = 0;
		
		for(Cliente dil : clienti){
			tot += dil.calcolaParcella();
		}
		
		return tot;
	}
}
