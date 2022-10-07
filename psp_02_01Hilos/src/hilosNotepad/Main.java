/**
 * 
 */
package hilosNotepad;

/**
 * @author dduran
 *
 */
public class Main {
	public void lanzarNotepad(String fichero) {
		ProcessBuilder pb;
		try {
			if (fichero == "")
				pb = new ProcessBuilder("notepad.exe");
			else
				pb = new ProcessBuilder("notepad.exe", fichero);
			pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void lanzarCalc() {
		ProcessBuilder pb;
		try {
			pb = new ProcessBuilder("calc.exe");
			pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main bloc = new Main();
		bloc.lanzarNotepad("");
		bloc.lanzarNotepad("");
		bloc.lanzarNotepad("kk.txt");
		for (int i = 0; i < 10; i++)
			bloc.lanzarCalc();
		System.out.println("Fin del main!!! Donde están los notepads?");
	}

}
