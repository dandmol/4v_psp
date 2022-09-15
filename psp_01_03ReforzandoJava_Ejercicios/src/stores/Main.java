/**
 * 
 */
package stores;

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
		LiquorStore puertoDeIndias = new LiquorStore(8.95,20);
		
		puertoDeIndias.payDrinks(10);
		System.out.printf("Wellcome to anonumous store!, Our drink price is %.2f€",puertoDeIndias.getCash());
	}
}
