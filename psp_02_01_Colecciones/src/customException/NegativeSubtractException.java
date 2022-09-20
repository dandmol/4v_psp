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
		super("NegativeSubtractException: N1 - N2 da resultado negativo");
	}

}
