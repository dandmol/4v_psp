package customException;

public class BigRange extends Exception {
	public BigRange (int a, int b) {
		super("BigRange: excepci�n absurda por que hay mucha diferencia entra " + a + " y " + b);
	}

}
