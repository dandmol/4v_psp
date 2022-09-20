/**
 * 
 */
package iterador;

import java.util.ArrayList;
import java.util.Iterator;

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
		ArrayList<String> koloreak = new ArrayList<>();
		
		koloreak.add("Urdina");
		koloreak.add("Txuria");
		koloreak.add("Beltza");
		koloreak.add("Gorria");
		koloreak.add("Laranja");
		koloreak.add("Oria");
		koloreak.add("Arrosa");
		
		Iterator<String> kolor = koloreak.iterator();
		
		while(kolor.hasNext()) {
			System.out.println(kolor.next());
		}
		
	}

}
