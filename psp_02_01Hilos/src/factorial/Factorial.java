/**
 * 
 */
package factorial;

/**
 * @author dduran Clase con main recibe un argumento y método factorial que se
 *         le pasa un número (el main le llama pasándole le número pasado como
 *         argumento) y realiza el factorial de ese número, es decir, la
 *         multiplicación desde el 1 hasta dicho número y lo devuelve. Ejemplo:
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
