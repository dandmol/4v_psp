/**
 * 
 */
package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author dduran
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		//String archivo = "D:\\Users\\dduran\\Documents\\GitHub\\psp4v\\psp_02_01_Colecciones\\src\\files\\prueba.txt";
		String archivo = ".\\src\\files\\prueba.txt";
		
		// Lectura inicial del fichero
		System.out.println("*** Lectura inicial del fichero ***");
		leerFichero(archivo);
		
		// Escritura del fichero sin sobreescribir y pidiendo la nueva línea
		System.out.println("\n*** Escritura del fichero sin sobreescribir ***");
		System.out.println("Introduce lo que quieres añadir al fichero: ");
		Scanner lectura = new Scanner(System.in);
		String newLine = lectura.nextLine();
		escribirFichero(newLine,archivo);
		lectura.close();
		
		// Lectura del fichero despues de la escritura
		System.out.println("\n*** Lectura del fichero después de la escritura***");
		leerFichero(archivo);
		
	}
	
	private static void escribirFichero(String newLine, String archivo) throws IOException  {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(archivo,true);
			pw = new PrintWriter(fw);
			
			newLine="\n" + newLine;
			pw.write(newLine);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pw != null) pw.close();
			if(fw != null) fw.close();
		}
		
	}

	static void leerFichero(String archivo) throws IOException {
		String linea;
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			while((linea=br.readLine()) != null) {
				System.out.println(linea);	
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if(fr != null) fr.close();
			if(br != null) br.close();
			
		}
	}

}
