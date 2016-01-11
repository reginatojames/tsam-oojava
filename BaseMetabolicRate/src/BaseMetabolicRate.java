
public class BaseMetabolicRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona(175, 65, 19, "moderatamente attivo", 'm');
		Salute s = new Salute();
		System.out.println(s.mb(p));
	}

}
