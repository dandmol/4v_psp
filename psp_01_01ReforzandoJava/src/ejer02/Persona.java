/**
 * 
 */
package ejer02;

/**
 * @author DaniDM
 *
 */
public abstract class Persona {
	private String nombre;

	public Persona(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int correr ();

	@Override
	public String toString() {
		return "El humanoide " + nombre + " corre a " + correr() + " km/h";
	}
	
	
	
}
