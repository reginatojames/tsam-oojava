package reginato.james.videoteca;

public class DVD extends Film{

	public DVD(String titolo, String regista, int annoProd, String attori, int giorni) {
		super(titolo, regista, annoProd, attori, giorni);
	}

	public double preventivo(){
		double tot = 0;
		
		if(giorni > 2){
			tot = 2 * (giorni - 2);
			tot =+ 3;
		}else{
			tot = 1.5 * giorni;
		}
		
		return tot;
	}
}
