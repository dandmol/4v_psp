/**
 * 
 */
package polimorfismo;

/**
 * @author DaniDM
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal zeus = new Perro ("Perro","Zeus");
		Animal dali = new Gato ("Gato","Dalí");
		
		zeus.printMensaje();
		dali.printMensaje();
	}

}
