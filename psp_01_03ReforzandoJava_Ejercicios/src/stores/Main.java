/**
 * 
 */
package stores;

/**
 * @author DaniDM
 * UD1 Ejercicio 1
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LiquorStore puertoDeIndias = new LiquorStore(8.95,20);
	
		puertoDeIndias.welcome();
		puertoDeIndias.payDrinks(10);
		System.out.printf("The price is %.2f€",puertoDeIndias.getCash());
		
		// Instancio clase anónima
		Store campoViejo = new Store(8.95) {

			@Override
			void welcome() {
				// TODO Auto-generated method stub
				System.out.printf("Welcome to anonymous store!, Our drink price is %.2f €",this.getDrinkPrice());
				
			}
		};
		System.out.println();
		System.out.println("*** Anonymous class ***");
		campoViejo.welcome();
		campoViejo.payDrinks(10);
		System.out.printf("\nThe price is %.2f €",campoViejo.getCash());
		
	}
}
