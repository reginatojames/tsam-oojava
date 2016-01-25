package reginato.james.videoteca;

public class Main {
	
	public static void main(String[] args) {
		Videoteca v = new Videoteca();
		VHS vhs = new VHS("Balto", "J.L: POcahonta", 1456, "coso e cosa", 4);
		DVD d = new DVD("Funny GAmes", "J.L gug", 2011, "coso e cosa", 2);
		BluRay b = new BluRay("Rocco e le sue amiche", "J.L: PORCAhonta", 2016, "coso e cosa", 3);
		
		Film[] f = new Film[] {vhs, d , b};
		
		v.setFilms(f);
		
		System.out.println(v.preventivo());
	}
}
