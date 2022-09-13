/**
 * 
 */
package biblioteca;

/**
 * @author DaniDM
 *
 */
public class MainPolimorfismo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publicacion[] listado = new Publicacion[4];
		
		listado[0] = new Revista("Cod1","El quisquilloso",2022,12);
		listado[1] = new Libro("Cod2","El principito",1943);
		listado[2] = new Libro("Cod3","Reina roja",2018);
		listado[3] = new Revista("Rev1","El jueves",2022,20220914);
		
		System.out.println("*** Acciones ***");
		System.out.println(listado[1].getTitulo() + " es prestado");
		Libro principito = (Libro)listado[1];
		principito.prestar();
		
		Libro rr = (Libro)listado[2];
		rr.prestar();
		System.out.println(listado[2].getTitulo() + " es prestado y devuelto");
		rr.devolver();
		
		System.out.println("\n*** Situación de biblioteca ***");
		for (int i=0; i<listado.length;i++) {
			if (listado[i] instanceof Libro) {
				Libro libro = (Libro)listado[i];
				System.out.println(libro);
			} else if (listado[i] instanceof Revista) {
				Revista rev = (Revista)listado[i];
				System.out.println(rev);
			}
		}
	}

}
