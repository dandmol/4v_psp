/**
 * 
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		Scanner scanner = new Scanner(System.in);
		String a_evaluar ="Hola mundo!!! Pontika es lo más";
		String regex;
		
		while (true) {
			regex=scanner.next();
			if(regex.equals("exit")) break;
			
			Pattern patron = Pattern.compile(regex);
			Matcher m = patron.matcher(a_evaluar);
			
			boolean coincidencia = m.find();
			System.out.println("Hay coincidencia? " + coincidencia);
		}
	}

}
