/**
 * 
 */
package interfaces;

/**
 * @author DaniDM
 *
 */
public class Num implements Constantes, Valor {

	private int num;
	
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @param num
	 */
	public Num(int num) {
		this.num = num;
	}

	@Override
	public void cuadrado() {
		// TODO Auto-generated method stub
		if (estaEnRango()) {
			this.num = num*num;
		} else {
			System.out.println("Operación no permitida: Fuera de rango");
		}
	}

	@Override
	public boolean esPar() {
		// TODO Auto-generated method stub
		return num%2 == 0;
	}
	
	private boolean estaEnRango() {
		return num > VALOR_MIN && num < VALOR_MAX;
	}

}
