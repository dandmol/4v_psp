/**
 * 
 */
package mh;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import mh.jugada;

/**
 * @author DaniDM
 *
 */

// Variables globales
interface GlobalVals{
	int[] numObjetivoInt = new int[4];

}

public class MuertosHeridos implements GlobalVals {
	static int muertos  = 0;
	static int heridos = 0;
	static int intentos = 0;
	static jugada[] historial = new jugada[14];
	static boolean fnDebug = true;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaración de variable
		String numUsuario;
		Scanner introUsuario = new Scanner (System.in);
				
		// Calculo el número objetivo
		calcularNum();
		
		// Empieza la partida
		while (intentos <= 14 && muertos != 4) {
			// Solicito un número al jugador y compruebo su validación para el juego
			imprimirHistorial();
			// Pido número al jugador
			do {
				System.out.print("Introduce un número: ");
				numUsuario = introUsuario.nextLine();
			} while (!validarNum(numUsuario));
			
			// Comprobación del número respecto al buscado
			comprobacion(numUsuario);

			// Registro el intento
			historial[intentos] = new jugada(numUsuario, muertos, heridos);			
			intentos++;
		}
		
		if (muertos == 4) {
			System.out.println("Zorionak txapeldunak");
		} else if (intentos == 14 ) {
			System.out.println("Paket!!!!");
		} else {
			System.out.println("PERO AQUÍ QUE HA PASADO!!!!!");
		}
		
	}
	
	/**
	 * Método para calcular el número a buscar
	 * Este es almacenado en el array global 
	 * INPUT: none
	 * OUTPUT: none
	 * RETURN: none
	 */
	public static void calcularNum () {
		
		// Declaraciones de variables
		// Variable para controlar si se ha repetido el número
		boolean repetido;
		// Variables para los for
		int i,j;
		
		for (i = 0; i < numObjetivoInt.length; i++) {
			// Calculamos el primer valor
			if (i == 0) {
				numObjetivoInt[0] = aleatorio(10);
			} else {
				// Vamos calculando números y vamos controlando si es repetido o no
				do {
					repetido = false;
					numObjetivoInt[i] =  aleatorio(10);
					for (j = 0; j< i; j++) {
						// Flag
						//System.out.println(" i=" + i + "j=" + j + " Comparación: " + numObjetivoInt[i] + " == " + numObjetivoInt[j]);
						// Validación del número
						if (!repetido && numObjetivoInt[i] == numObjetivoInt[j]) {
							//System.out.println("Es repetido");
							repetido = true;
						}
					}
				} while (repetido);
			}
			// Flag
			// System.out.println("Pos" + i +": " + numObjetivoInt[i]);
		}			
	}

	/**
	 * Función para calcular un número aleatorio, de entre 0 y tope
	 * @param tope
	 * @return int
	 */
	public static int aleatorio(int tope) {
		Random r = new Random();
		return r.nextInt(tope - 1);
	}
	
	/**
	 * Función para validar el número introducido por el jugador
	 * @param intro
	 * @return boolean si cumple las condiciones del juego 
	 */
	public static boolean validarNum (String intro) {
		// TODO Validar el número introducido por el jugador		
		boolean valido = true;
		if (intro.length() != 4) { // Se valida la longitud
			System.out.println("Longitud incorrecta");
			System.out.println("El num " + intro + " NO es válido para jugar");

			valido = false;
		} else if (!isNumeric(intro)) { // Se valida que sea numérico
			System.out.println("Lo introducido no es numérico");
			valido = false;
		} else { // Se valida que no tenga repetidos
			for (int i = 0; i < intro.length(); i++) {
				for (int j = 0; j < intro.length(); j++) {
					if ( i != j && intro.charAt(i) == intro.charAt(j) && valido) {
						System.out.println("Contiene números repetidos.");
						valido = false;						
					}
				}
			}
		}

		if (valido && intentos > 0) { // Una vez validado que el formato es correcto, valido si ya ha sido introducido
			for (int i = 0; i < intentos; i++) {
				if (Integer.parseInt(historial[i].getNumero()) == Integer.parseInt(intro) && valido) {
				//if (historial[i].getNumero() == intro) {
					System.out.println("Con este número ya has jugado, revisa tus jugadas");
					valido = false;
				}
			}
		}
		return valido;
	}

	/**
	 * Método que comprueba el número introducido respecto al objetivo
	 * El resultado lo deja en las variables globales muertos y heridos
	 * @param intro el número metido por el jugador
	 */
	public static void comprobacion(String intro) {
		// TODO Comprobar el número introducido respecto al número objetivo
		muertos = 0;
		heridos = 0;
		for (int i = 0; i < numObjetivoInt.length; i++) {
			for (int j = 0; j < intro.length(); j++) {
				if (numObjetivoInt[i] == Character.getNumericValue(intro.charAt(j))) {
					if (i == j) {
						muertos++;
					} else {
						heridos++;
					}
				}
					
			}
		}		
	}

	/**
	 * Imprime el array pasado cómo parámetro
	 * @param array
	 */
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i > 0 && i % 10 == 0) 
				System.out.println("");
		}
		System.out.print("");
	}

	/**
	 * Valida si es numérico
	 * @param str
	 * @return boolean
	 */
	private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }


	private static void imprimirHistorial() {
		clearScreen();
		System.out.println("******************************************");
		System.out.println("***          Muertos y heridos         ***");
		System.out.println("***                                    ***");
		if (fnDebug) {
			System.out.print("*** Número objetivo: ");
			printArray(numObjetivoInt);
			System.out.println("              ***");
		}
		System.out.println("*** testing JAVA                       ***");
		System.out.println("*** by Dani Durán                      ***");
		System.out.println("******************************************");
		System.out.println("Número \tMuertos\tHeridos");
		for (int i = 0; i < intentos; i++) {
			System.out.println(historial[i].getNumero() +"\t" + historial[i].getMuertos() +"\t" +historial[i].getHeridos());
		}

	}
	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
		}
	
}
