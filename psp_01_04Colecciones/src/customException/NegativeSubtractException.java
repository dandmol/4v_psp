/**
 * 
 */
package customException;

/**
 * @author dduran
 *
 */
public class NegativeSubtractException extends Exception {
	public NegativeSubtractException(int a, int b) {
		super("NegativeSubtractException: " + a + " - " + b + " da resultado negativo");
	}

}
