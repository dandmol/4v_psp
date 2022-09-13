/**
 * 
 */
package interfaces;

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
		Num numerico = new Num(4);
		
		System.out.println("El valor es: " + numerico.getNum());
		numerico.cuadrado();
		System.out.println("El valor es: " + numerico.getNum());
		numerico.cuadrado();
		System.out.println("El valor es: " + numerico.getNum());
		System.out.println("Es par? " + numerico.esPar());
		numerico.cuadrado();
		System.out.println("El valor es: " + numerico.getNum());
		numerico.cuadrado();
		System.out.println("El valor es: " + numerico.getNum());
		numerico.setNum(3);
		System.out.println("Es par? " + numerico.esPar());
		numerico.cuadrado();
		System.out.println("El valor es: " + numerico.getNum());
		System.out.println("Es par? " + numerico.esPar());
		numerico.cuadrado();
		System.out.println("El valor es: " + numerico.getNum());
		System.out.println("Es par? " + numerico.esPar());
		numerico.cuadrado();
		System.out.println("El valor es: " + numerico.getNum());
		numerico.cuadrado();
		
	}

}
