/**
 * 
 */
package abstractos;

/**
 * @author DaniDM
 *
 */
public class Cuadrado extends Figura {
	private int tamanoLado;
	public Cuadrado(int tamanoLado) {
		super(4);
		// TODO Auto-generated constructor stub
		this.tamanoLado = tamanoLado;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return tamanoLado*tamanoLado;
	}

}
