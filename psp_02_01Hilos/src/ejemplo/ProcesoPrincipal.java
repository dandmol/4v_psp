/**
 * 
 */
package ejemplo;

/**
 * @author dduran
 *
 */
public class ProcesoPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//String[] infoProceso = {"java","ejemplo.ProcesoSecundario"};
			String[] infoProceso = {"Notepad.exe","notas.txt"};
			Process proceso = Runtime.getRuntime().exec(infoProceso);
			int valorRetorno = proceso.waitFor();
			if (valorRetorno ==0) {
				System.out.println("El proceso se ha completado satisfactoriamente");
			} else {
				System.out.println("El proceso ha fallado. Código de error: " + valorRetorno);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
