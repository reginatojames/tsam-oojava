package reginato.james.test;

import static org.junit.Assert.*;

import reginato.james.videoteca.BluRay;
import reginato.james.videoteca.DVD;
import reginato.james.videoteca.Film;
import reginato.james.videoteca.VHS;
import reginato.james.videoteca.Videoteca;

public class Test {

	@org.junit.Test
	public void test() {
		Videoteca v = new Videoteca();
		VHS vhs = new VHS("Balto", "J.L: POcahonta", 1456, "coso e cosa", 4);
		DVD d = new DVD("Funny GAmes", "J.L gug", 2011, "coso e cosa", 2);
		BluRay b = new BluRay("Rocco e le sue amiche", "J.L: PORCAhonta", 2016, "coso e cosa", 3);
		
		Film[] f = new Film[] {vhs, d , b};
		
		v.setFilms(f);
		
		assertEquals(5.0, v.preventivo(), 0);
	}

}
