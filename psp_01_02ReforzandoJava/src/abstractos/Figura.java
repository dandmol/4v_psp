package abstractos;

public abstract class Figura {
	private int numLados;

	/**
	 * @param numLados
	 */
	public Figura(int numLados) {
		this.numLados = numLados;
	}
	
	public abstract float getArea();

	@Override
	public String toString() {
		return "Figura: tiene " + numLados + " lados, y su área es de " + getArea();
	}
	
	
}
