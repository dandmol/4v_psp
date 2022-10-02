/**
 * 
 */
package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author dduran
 *
 */
public class Basico2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "la (\\w+) dice hola a la (\\w+)";
		Pattern pat = Pattern.compile(regex);
		String input = "la caracola dice hola a la paloma";
		Matcher mat = pat.matcher(input);
		if (mat.find()) {
			System.out.println("regex encontrada");
			System.out.println("Sujeto activo :" + mat.group(1));
			System.out.println("Sujeto pasivo :" + mat.group(2));
		} else {
			System.err.println("regex NO encontrada");
		}
	}

}
