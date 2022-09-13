package ejer01;
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
			
			Trabajador trabajador = new Trabajador("Bill Gates", "Presidente", "Redmond", "", "");;
			Empleado empleado = new Empleado("Larry Ellison", "Presidente", "Redwood", "", "", 100000.0, 1000.0);;
			Consultor consultor = new Consultor("Steve Jobs", "Consultor Jefe", "Cupertino", "", "", 20, 1000.0);
			Informatico geek = new Informatico("DaniD","Profe","4Vientos","9480000000","nSS001001001",50,65.1d,30000);
	
			System.out.println(trabajador);
			System.out.println(empleado);
			System.out.println(consultor);
			System.out.println(geek);
	}

}
