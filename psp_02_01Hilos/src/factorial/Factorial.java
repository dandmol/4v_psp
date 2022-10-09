/**
 * 
 */
package factorial;

/**
 * @author dduran Clase con main recibe un argumento y m�todo factorial que se
 *         le pasa un n�mero (el main le llama pas�ndole le n�mero pasado como
 *         argumento) y realiza el factorial de ese n�mero, es decir, la
 *         multiplicaci�n desde el 1 hasta dicho n�mero y lo devuelve. Ejemplo:
 *         Factorial de 5 = 1*2*3*4*5
 */
public class Factorial {

	public int factorial(int num) {
		int factorial = 1;
		for (int i = 1; i <= num; i++)
			factorial *= i;
		return factorial;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = new Factorial();
		int num = Integer.parseInt(args[0]);
		System.out.println("El factorial de " + num + " es " + f.factorial(num));

	}

}
