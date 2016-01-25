package reginato.james.videoteca;

public class VHS extends Film{

	public VHS(String titolo, String regista, int annoProd, String attori, int giorni) {
		super(titolo, regista, annoProd, attori, giorni);
	}
	
	public double preventivo(){
		double tot = 0;
		
		if(giorni > 1){
			tot = 2 * (giorni-1);
			tot =+ 1;
		}else{
			tot = 1;
		}
		
		return tot;
	}
}
