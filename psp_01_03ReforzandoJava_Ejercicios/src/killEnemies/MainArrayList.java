/**
 * 
 */
package killEnemies;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author dduran
 *
 */
public class MainArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaro el ArrayList
		ArrayList<Character> cuadrilla = new ArrayList<Character>();
		
		// Relleno añado 5 amigos y 5 enemigos
		for(int i=0; i<5; i++) {
			cuadrilla.add(new Friend());
			cuadrilla.add(new Enemy());
		}
		
		// Barajeo los elementos del ArrayList
		Collections.shuffle(cuadrilla);
		
		// Recorro el ArrayList comprobando y haciendo lo que toca con cada uno de ellos
		// en caso de enemigo, casteo
		//for (Character pertsonaia : cuadrilla) {
		for(int x = 0; x < cuadrilla.size(); x++ ) {
			if (cuadrilla.get(x) instanceof Friend) {
				System.out.println("El carácter "+ x + " es un amigo!");
			} else if (cuadrilla.get(x) instanceof Enemy) {
				Enemy chungo = (Enemy)cuadrilla.get(x);
				System.out.println("El personaje "+ x + " es un enemigo! ¡Mátalo!");
				chungo.kill();
			}
		}
			
	}

}
