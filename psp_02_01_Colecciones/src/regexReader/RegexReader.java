/**
 * 
 */
package regexReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.regex.Pattern;

/**
 * @author dduran
 *
 */
public class RegexReader extends BufferedReader{

	private String regexp;

	public RegexReader(Reader in, String regexp) {
		super(in);
		// TODO Auto-generated constructor stub
		this.regexp = regexp;
	}

	@Override
	public String readLine() throws IOException {
		// TODO Auto-generated method stub
		String linea = super.readLine();
		if (Pattern.matches(regexp, linea) == true) {
			return linea;
		} else {
			return "";
		}
	}

	
}
