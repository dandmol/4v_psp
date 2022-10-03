package regex;
import java.util.regex.Pattern;

/**
 * 
 */

/**
 * @author dduran
 *
 */
public class regex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regexp = "\\d{1,2}/\\d{1,2}/(\\d{4}|\\d{2})";
				
		System.out.println(Pattern.matches(regexp, "11/12/2014"));
		System.out.println(Pattern.matches(regexp, "1/12/2014"));
		System.out.println(Pattern.matches(regexp, "11/2/2014"));
		System.out.println(Pattern.matches(regexp, "11/2/214"));
		System.out.println(Pattern.matches(regexp, "11/12/14"));  // El año no tiene cuatro cifras
		System.out.println(Pattern.matches(regexp, "11//2014"));  // el mes no tiene una o dos cifras
		System.out.println(Pattern.matches(regexp, "11/12/2014perico"));  // Sobra "perico"
	}

}
