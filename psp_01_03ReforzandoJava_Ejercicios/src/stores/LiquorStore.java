/**
 * 
 */
package stores;

/**
 * @author DaniDM
 *
 */
public class LiquorStore extends Store {

	private int tax; //Valor del impuesto
	
	public LiquorStore(double drinkPrice, int tax) {
		super(drinkPrice);
		// TODO Auto-generated constructor stub
		this.tax = tax;
	}
	
	
	
	@Override
	public void payDrinks(int numOfDrinks) {
		// TODO Auto-generated method stub
		double impuesto;
		impuesto = 1+ ((double)this.tax/100);
		super.payDrinks(numOfDrinks);
		this.setCash(this.getCash()*impuesto);
	}


	@Override
	void welcome() {
		// TODO Auto-generated method stub
		System.out.println("Wellcome to our liquor store. If you are younger than 18, go back home!!!");
	}

}
