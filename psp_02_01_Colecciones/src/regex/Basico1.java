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
public class Basico1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("hola");
		String input = "la caracola dice hola a la paloma";
		Matcher mat = pat.matcher(input);
		if (mat.find()) {
		    System.out.println("regex encontrada");
		} else {
		    System.err.println("regex NO encontrada");
		}
	}

}
