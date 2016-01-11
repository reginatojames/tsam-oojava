
public class Salute {


	public double mb(Persona p) {
		double mbb = 0;
		double increment = 0;

		if (p.sesso == 'm') {
			mbb = 655 + (13.8 * p.peso) + (1.8 * p.altezza) - (4.7 * p.eta);
		}else{
			mbb = 655 + (9.6 * p.peso) + (1.8 * p.altezza) - (4.7 * p.eta);
		}
		
		if(p.attivitaFisica.equals("sedentario")){
			increment = (mbb / 100) * 20;
			mbb += increment;
		}else if(p.attivitaFisica.equals("moderatamente attivo")){
			increment = (mbb / 100) * 30;
			mbb += increment;
		}else if(p.attivitaFisica.equals("attivo")){
			increment = (mbb / 100) * 40;
			mbb += increment;
		}else if(p.attivitaFisica.equals("molto attivo")){
			increment = (mbb / 100) * 50;
			mbb += increment;
		}
		
		return mbb;
	}
}
