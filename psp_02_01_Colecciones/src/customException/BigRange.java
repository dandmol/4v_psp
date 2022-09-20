package customException;

public class BigRange extends Exception {
	public BigRange (int a, int b) {
		super("BigRange: excepción absurda por que hay mucha diferencia entra " + a + " y " + b);
	}

}
