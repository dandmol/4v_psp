/**
 * 
 */
package sumatorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author dduran
 *
 */
public class Lanzador {
	public void lanzarSumador(Integer n1, Integer n2)  {
		// Preparamos lo necesario para lanzar
		String clase="sumatorio.Sumador";
		File directorioSumador = new File("D:\\Users\\dduran\\Documents\\eclipse-workspace\\psp_02_01Hilos\\bin\\");
		
		// Construimos el comando a ejecutar
		ProcessBuilder pb; 
		try {
		pb = new ProcessBuilder("java",clase,n1.toString(),n2.toString());
			pb.directory(directorioSumador);
			Process ps = pb.start();
	
			// Captura de la salida de la ejecución
			BufferedReader reader = new BufferedReader(new InputStreamReader(ps.getInputStream()));
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
		l.lanzarSumador(4, 55);
		l.lanzarSumador(1, 5);
		l.lanzarSumador(10, 100);
		System.out.println("Ha llegado aquí!!! GUAAAAUUUUU!!!");

	}

}
