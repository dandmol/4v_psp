/**
 * 
 */
package anonima;

/**
 * @author dduran
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo hi = new Demo() {
			@Override
			public void hola() {
				System.out.println("Hola holita");
			}
		};
		hi.hola();
		
	}

}
