package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



/**
 * Gestisce gli stipendi dei propri dipendenti.
 *
 */
public class Azienda {

	private String ragioneSociale;
	private HashMap<Integer, Dipendente> dipendenti = new HashMap<Integer, Dipendente>();
	Integer key = 0;
	private int ripEvitate = 0;

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	/**
	 * Calcola lo stipendio di tutti i dipendenti univoci (ovvero NON
	 * vengono considerati gli stipendi di eventuali dipendenti duplicati). 
	 * @return il totale dello stipendi da pagare
	 */
	public int totaleStipendi() {
		// TODO: da implementare
		int tot = 0;
		
		for(Dipendente d : dipendenti.values()){
			tot += d.calcolaStipendio();
		}
		
		return tot;
	}
	
	/**
	 * Inserisce un nuovo dipendente, verificando che
	 * non sia già stato inserito.
	 * @param d dipendente
	 */
	public void addDipendente(Dipendente d) {
		// TODO: da implementare
		Integer key = d.getCF().hashCode();
		if(dipendenti.containsKey(key)==false){
			dipendenti.put(key, d);
			key++;
			//System.out.println(key);
		}else{
			ripEvitate++;
		}
		
	}
	
	/**
	 * Restituisce il numero di volte che all'atto dell'inserimento di
	 * un dipendente, il dipendente era già stato inserito. 
	 * @return
	 */
	public int dipendentiDuplicati() {
		// TODO: da implementare
		return ripEvitate;
	}
	
	/**
	 * Dato un dipendente, restituisce il numero di volte che lo stesso
	 * dipendente è stato inserito tramite le funzione addDipendente.
	 * Nel caso che un dato dipendente sia stato inserito una sola volta,
	 * restituisce il valore 1. 
	 * @param d dipendente da verificare
	 * @return numero di ripetizioni.
	 */
	public int numeroRipetizioni(Dipendente d) {
		// TODO: da implementare
		return 0;
	}

}
