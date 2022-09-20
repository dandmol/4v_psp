/**
 * 
 */
package listasPR;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author dduran
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> letras = new ArrayList<String>();
		letras.add("aa");
		letras.add("bb");
		letras.add("cc");
		letras.add("dd");
		letras.add(2,"ee");
		
		for (String letra : letras) {
			System.out.println(letra);
		}
		if (letras.contains("bb")) {
			System.out.println("Lo contiene");
		}
		
		Random x = new Random();
		
		System.out.println(x.nextInt(50)+1);
		System.out.println((int)(Math.random()*10));
	}

}
