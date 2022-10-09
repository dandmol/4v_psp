/**
 * 
 */
package factorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 * @author dduran Crear lanzador: Donde en el main llamará al método
 *         lanzadorFactorial al cuál se le pasa el número del que queremos
 *         obtener el facotirial y este lanzadorFActorial llama con proceso
 *         nuevo a la clase factorial pasando como argumento el número. Recoge e
 *         imprime el resultado.
 */
public class Lanzador {
	public void lanzarFactorial(Integer num) {
		ProcessBuilder pb;
		String clase = "factorial.Factorial";
		File directorioClass = new File(".\\bin\\");
		try {
			pb = new ProcessBuilder ("java",clase,num.toString());
			pb.directory(directorioClass);
			Process p = pb.start();
			System.out.println("--> Proceso con PID: " + p.pid());
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lanzador l = new Lanzador();
		System.out.println("Lanzo 3 cálculos de factorial, en 3 procesos independientes.");
		System.out.println("Cada uno tendrá su proceso (con su propio PID).");
		l.lanzarFactorial(4);
		l.lanzarFactorial(5);
		l.lanzarFactorial(10);
		System.out.println("Ha llegado aquí!!! GUAAAAUUUUU!!!");
	}

}
