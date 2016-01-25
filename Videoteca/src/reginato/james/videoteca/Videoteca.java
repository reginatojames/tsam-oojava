package reginato.james.videoteca;

public class Videoteca {

	private Film[] films;
	
	public Film[] getFilms() {
		return films;
	}

	public void setFilms(Film[] films) {
		this.films = films;
	}

	public double preventivo() {
		double tot = 0;

		for (Film x : films) {
			tot += x.preventivo();
		}

		return tot;
	}
}
