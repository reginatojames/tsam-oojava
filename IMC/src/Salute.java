
public class Salute {
	
	public void imc(Persona p){
		double imc = 0;
		
		imc = p.massa / (p.altezza * p.altezza);
		
		if(imc < 18.5){
			System.out.println("sottopeso");
		}else if(imc >= 18.5 && imc < 25){
			System.out.println("normale");
		}else if(imc >= 25 && imc < 30){
			System.out.println("sovrappeso");
		}else if(imc >= 30){
			System.out.println("sboldro");
		}
	}
}
