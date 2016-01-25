package reginato.james.commercialista;

public class Cliente {
	private String nome;
	private String cognome;
	private String codFiscale;
	
	public Cliente(String nome, String cognome, String codFiscale){
		this.nome = nome;
		this.cognome = cognome;
		this.codFiscale = codFiscale;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodFiscale() {
		return codFiscale;
	}
	public void setCodFiscale(String codFiscale) {
		this.codFiscale = codFiscale;
	}
	
	public double calcolaParcella(){
		return 0;
	}
}
