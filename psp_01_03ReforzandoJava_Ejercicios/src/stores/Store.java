/**
 * 
 */
package stores;

/**
 * @author DaniDM
 *
 */
public abstract class Store {
	private double cash;
	private double drinkPrice;
	
	/**
	 * @param drinkPrice
	 */
	public Store(double drinkPrice) {
		this.drinkPrice = drinkPrice;
		this.cash = 0d;
	}
	
	/**
	 * @return the cash
	 */
	public double getCash() {
		return cash;
	}

	/**
	 * @param cash the cash to set
	 */
	public void setCash(double cash) {
		this.cash = cash;
	}

	/**
	 * @return the drinkPrice
	 */
	public double getDrinkPrice() {
		return drinkPrice;
	}

	/**
	 * @param drinkPrice the drinkPrice to set
	 */
	public void setDrinkPrice(double drinkPrice) {
		this.drinkPrice = drinkPrice;
	}

	public void payDrinks (int numOfDrinks) {
		this.cash = drinkPrice * numOfDrinks;
	}
	
	abstract void welcome();
	
}
