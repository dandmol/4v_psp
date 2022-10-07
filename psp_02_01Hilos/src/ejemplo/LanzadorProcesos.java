/**
 * 
 */
package ejemplo;

/**
 * @author dduran
 *
 */
public class LanzadorProcesos {

	public void ejecutar (String ruta) {
		ProcessBuilder pb;
		try {
			pb = new ProcessBuilder(ruta);
			pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "notepad.exe";
		LanzadorProcesos bloc = new LanzadorProcesos();
		bloc.ejecutar(ruta);
		System.out.println("Finalizado");
	}

}
