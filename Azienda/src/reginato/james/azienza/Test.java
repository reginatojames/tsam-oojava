package reginato.james.azienza;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Azienda microsoft = new Azienda();
		microsoft.setpIva("0000000001");
		microsoft.setRagoioneSociale("Microsoft snc");
		
		ContrattoLavoro contratto = new ContrattoLavoro();
		contratto.setPagaBase(600*100);
		contratto.setTipo("Apprendista");
		
		Dipendente bill = new Dipendente();
		bill.setCognome("Gates");
		bill.setNome("Bill");
		bill.setContratto(contratto);
		
		Dipendente steve = new Dipendente();
		steve.setCognome("Jobs");
		steve.setNome("Steve");
		steve.setContratto(contratto);
		
		Dipendente[] dips = new Dipendente[]{bill, steve};
		
		microsoft.setDipendenti(dips);
		
		System.out.println(microsoft.stipendi());
	}

}
