/**
 * 
 */
package biblioteca;

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
		Publicacion quisqui = new Revista("Cod1","El quisquilloso",2022,12);
		Libro principito = new Libro("Cod2","El principito",1943);
		Libro rr = new Libro("Cod3","Reina roja",2018);
		Revista rev1 = new Revista("Rev1","El jueves",2022,20220914);
		
		System.out.println(principito.getTitulo() + " es prestado");
		principito.prestar();
		rr.prestar();
		System.out.println(rr.getTitulo() + " es prestado y devuelto");
		rr.devolver();
		System.out.println("\n*** Situación e inventario ***");
		System.out.println(quisqui);
		System.out.println(principito);
		System.out.println(rr);
		System.out.println(rev1);
		
	}

}
