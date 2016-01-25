package reginato.james.commercialista;

public class Main {

	public static void main(String[] args) {
		Dipendente d = new Dipendente("giacomo", "grando", "gcmgram1996");
		LiberoProfessionista l = new LiberoProfessionista("alto", "basso", "gcmgram1996", "20", 6);
		Imprenditore i = new Imprenditore("jonny", "bravoh", "gcmgram1996", "20", 101, "Pellet Paradise");
		Commercialista c = new Commercialista();
		Cliente[] dil = new Cliente[] { d, i, l };
		c.setClienti(dil);

		System.out.println(c.calcolaParcelle());
	}

}
