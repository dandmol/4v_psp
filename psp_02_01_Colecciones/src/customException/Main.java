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
	
	public static boolean bigRange (int n1, int n2) throws BigRange {
		if ((n1 - n2) > 100 || (n2 - n1) > 100) throw new BigRange(n1,n2);
		return true;
	}
	/**
	 * @param args
	 * @throws NegativeSubtractException 
	 * @throws BigRange 
	 */
	public static void main(String[] args) throws NegativeSubtractException, BigRange {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			int x = 10;
			int y = 11;
			if (bigRange(x,y)) {
				System.out.println("BigRange OK");
				result = positiveSubtract(x,y);
				System.out.println(result);
			}
			
		} catch (NegativeSubtractException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (BigRange e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Esto siempre se va a ejecutar");
		}
		
	}

}
