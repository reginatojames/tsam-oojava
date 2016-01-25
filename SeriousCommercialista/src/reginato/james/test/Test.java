package reginato.james.test;

import static org.junit.Assert.*;

import reginato.james.commercialista.Cliente;
import reginato.james.commercialista.Commercialista;
import reginato.james.commercialista.Dipendente;
import reginato.james.commercialista.Imprenditore;
import reginato.james.commercialista.LiberoProfessionista;

public class Test {

	@org.junit.Test
	public void test() {
		Dipendente d = new Dipendente("giacomo", "grando", "gcmgram1996");
		LiberoProfessionista l = new LiberoProfessionista("alto", "basso", "gcmgram1996", "20", 6);
		Imprenditore i = new Imprenditore("jonny", "bravoh", "gcmgram1996", "20", 101, "Pellet Paradise");
		Commercialista c = new Commercialista();
		Cliente[] dil = new Cliente[] { d, i, l };
		c.setClienti(dil);
		
		assertEquals(604.0, c.calcolaParcelle(), 0);
	}

}
