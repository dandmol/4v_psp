/**
 * 
 */
package killEnemies;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author DaniDM
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character[] cuadrilla = {new Friend(),new Friend(),new Friend(),new Friend(),new Friend(),new Enemy(),new Enemy(),new Enemy(),new Enemy(),new Enemy()};
		
		// Aleatorizar un array,
		// primero pasarlo a lista,
		// shuffle y volver a array
		List<Character> cuadrillaList = Arrays.asList(cuadrilla);
		Collections.shuffle(cuadrillaList);
		cuadrillaList.toArray(cuadrilla);
		
		for (int i=0; i<cuadrilla.length;i++) {
			if (cuadrilla[i] instanceof Friend) {
				System.out.println("El carácter " + i + " es un amigo!");
			} else if (cuadrilla[i] instanceof Enemy) {
				Enemy chungo = (Enemy)cuadrilla[i];
				System.out.println("El personaje " + i + " es un enemigo! ¡Mátalo!");
				chungo.kill();
			}
		}
		
	}

}
