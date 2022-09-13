/**
 * 
 */
package abstractos;

/**
 * @author DaniDM
 *
 */
public class Triangulo extends Figura {

	private int base;
	private int altura; 


	/**
	 * @param numLados
	 */
	public Triangulo(int base, int altura) {
		super(3);
		// TODO Auto-generated constructor stub
		this.base = base;
		this.altura = altura;
	}


	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return (base*altura)/2;
	}

}
