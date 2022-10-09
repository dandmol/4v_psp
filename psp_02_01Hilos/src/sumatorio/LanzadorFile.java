package sumatorio;

import java.io.File;

public class LanzadorFile {
	public void lanzarSumador(Integer n1, Integer n2, String fichero) {
		// Preparamos lo necesario para lanzar
		String clase = "sumatorio.Sumador";
		File directorioSumador = new File(".\\bin\\");

		// Construimos el comando a ejecutar
		ProcessBuilder pb;
		try {
			pb = new ProcessBuilder("java", clase, n1.toString(), n2.toString());
			pb.directory(directorioSumador);
			// Configuramos el error y la salida a fichero
			pb.redirectError(new File(".\\files\\errores.txt"));
			pb.redirectOutput(new File(fichero));
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
		LanzadorFile l = new LanzadorFile();
		// Llamamos al lanzador del sumatorio parsándo los dos int y el fichero de salida, 
		// donde será devuelto el resultado de lanzar el programa Sumador.
		l.lanzarSumador(4, 55,".\\files\\result1.txt");
		l.lanzarSumador(1, 5,".\\files\\result2.txt");
		l.lanzarSumador(10, 100,".\\files\\result3.txt");
		System.out.println("Ok");

	}

}
