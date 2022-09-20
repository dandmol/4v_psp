/**
 * 
 */
package customException;

/**
 * @author dduran
 *
 */
public class Main {
	public static int positiveSubtract(int n1, int n2) throws NegativeSubtractException {
		if (n1 < n2) throw new NegativeSubtractException(n1,n2);
		return n1 - n2;
	}
	/**
	 * @param args
	 * @throws NegativeSubtractException 
	 */
	public static void main(String[] args) throws NegativeSubtractException {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			result = positiveSubtract(14,12);
			System.out.println(result);
		} catch (NegativeSubtractException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
