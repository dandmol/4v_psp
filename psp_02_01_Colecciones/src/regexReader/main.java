/**
 * 
 */
package regexReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author dduran
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regexp = ".*\\d{1,2}/\\d{1,2}/(\\d{4}|\\d{2}).*";
		String archivo = "D:\\Users\\dduran\\Documents\\GitHub\\psp4v\\psp_02_01_Colecciones\\src\\regexReader\\fichero.txt";
		
		String linea;
		RegexReader rr = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(archivo);
			rr = new RegexReader(fr,regexp);
			
			while(rr.ready()) {
				linea = rr.readLine();
				if (linea != "" ) System.out.println(linea);	
			}
			
			rr.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*finally {		
			if(fr != null) fr.close();
			if(rr != null) rr.close();
		}*/


	}

}
