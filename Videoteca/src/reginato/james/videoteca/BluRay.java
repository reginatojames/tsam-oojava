package reginato.james.videoteca;

public class BluRay extends Film {

	public BluRay(String titolo, String regista, int annoProd, String attori, int giorni) {
		super(titolo, regista, annoProd, attori, giorni);
	}

	public double preventivo() {
		double tot = 0;
		double penale = 0;
		int i = 0;

		if (giorni > 1) {
			giorni--;
			while (i >= giorni) {
				penale = +1 + ((1 / 100) * 10);
			}
			tot = penale +1;
		} else {
			tot = 1;
		}

		return tot;
	}
}
