/**
 * 
 */
package mh;

/**
 * @author DaniDM
 *
 */
public class jugada {
	private String numero;
	private int muertos;
	private int heridos;
	
	/**
	 * @param numero
	 * @param muertos
	 * @param heridos
	 */
	public jugada(String numero, int muertos, int heridos) {
		this.numero = numero;
		this.muertos = muertos;
		this.heridos = heridos;
	}
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * @return the muertos
	 */
	public int getMuertos() {
		return muertos;
	}
	/**
	 * @param muertos the muertos to set
	 */
	public void setMuertos(int muertos) {
		this.muertos = muertos;
	}
	/**
	 * @return the heridos
	 */
	public int getHeridos() {
		return heridos;
	}
	/**
	 * @param heridos the heridos to set
	 */
	public void setHeridos(int heridos) {
		this.heridos = heridos;
	}
	
	
}
