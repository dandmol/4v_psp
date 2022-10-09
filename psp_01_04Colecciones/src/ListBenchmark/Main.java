package ListBenchmark;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> array = new ArrayList<>();
		LinkedList<Double> linked = new LinkedList<>();
		
		// Declaro variables para que no afecte la declaración al tiempo de cada acción
		Instant start, end;
		Duration dur;
		int indice;
		
		// 1. Añadir 100.000 (doble) elementos aleatorios
		// siempre en la posición 0. Comparar tiempos
		System.out.println("1. 100.000 elementos aleatorios");
		start = Instant.now();
		// Some operation
		// Inserción en el ArrayList
		for (int i=0; i<100000; i++) {
			array.add(0,Math.random());
		}
		end = Instant.now();
		dur = Duration.between(start, end);
		System.out.printf("\tArrayList --> Duración %dms \n",dur.toMillis());
		
		start = Instant.now();
		// Some operation
		// Inserción en el LinkedList
		for (int i=0; i<100000; i++) {
			linked.add(0,Math.random());
		}
		end = Instant.now();
		dur = Duration.between(start, end);
		System.out.printf("\tLinkedList --> Duración %dms \n",dur.toMillis());
		
		// 2. Borrar las primeras 50.000 posiciones
		// (que borre siempre la primera)
		System.out.println("2. Eliminar 50.000 posiciones");
		start = Instant.now();
		// Some operation
		// Eliminacón en el ArrayList
		for (int i=0; i<50000; i++) {
			array.remove(0);
		}
		end = Instant.now();
		dur = Duration.between(start, end);
		System.out.printf("\tArrayList --> Duración %dms \n",dur.toMillis());
		
		start = Instant.now();
		// Some operation
		// Eliminación en el LinkedList
		for (int i=0; i<50000; i++) {
			linked.remove(0);
		}
		end = Instant.now();
		dur = Duration.between(start, end);
		System.out.printf("\tLinkedList --> Duración %dms \n",dur.toMillis());
		
		// 3. Añade 50.000 objetos aleatorios en posiciones aleatorias
		System.out.println("3. Añadir 50.000 aleatorios en posiciones aleatorias");
		start = Instant.now();
		// Some operation
		// Inserción en el ArrayList
		for (int i=0; i<50000; i++) {
			indice = (int)(Math.random()*50000);
			array.add(indice,Math.random());
		}
		end = Instant.now();
		dur = Duration.between(start, end);
		System.out.printf("\tArrayList --> Duración %dms \n",dur.toMillis());
		
		start = Instant.now();
		// Some operation
		// Inserción en el LinkedList
		for (int i=0; i<50000; i++) {
			indice = (int)(Math.random()*50000);
			linked.add(indice,Math.random());
		}
		end = Instant.now();
		dur = Duration.between(start, end);
		System.out.printf("\tLinkedList --> Duración %dms \n",dur.toMillis());
		
		
		// 4. Elimina 50.000 objetos aleatorios en posiciones aleatorias
		System.out.println("4. Eliminar 50.000 aleatorios en posiciones aleatorias");
		start = Instant.now();
		// Some operation
		// Inserción en el ArrayList
		for (int i=0; i<50000; i++) {
			indice = (int)(Math.random()*50000);
			array.remove(indice);
		}
		end = Instant.now();
		dur = Duration.between(start, end);
		System.out.printf("\tArrayList --> Duración %dms \n",dur.toMillis());
		
		start = Instant.now();
		// Some operation
		// Inserción en el LinkedList
		for (int i=0; i<50000; i++) {
			indice = (int)(Math.random()*50000);
			linked.remove(indice);
		}
		end = Instant.now();
		dur = Duration.between(start, end);
		System.out.printf("\tLinkedList --> Duración %dms \n",dur.toMillis());
		
		// 5. Borrar items en posiciones pares usando iterador
		System.out.println("5. Borrar items en posiciones pares usando iterador");
		Iterator<Double> arrayIt = array.iterator();
		Iterator<Double> linkedIt = linked.iterator();
		
		int j = 0;
		start = Instant.now();
		// Some operation
		// Recorriendo en el ArrayList
		while (arrayIt.hasNext()) {
			if(j % 2 == 0 && j != 0) arrayIt.remove();
			arrayIt.next();
			j++;
		}
		end = Instant.now();
		dur = Duration.between(start, end);
		System.out.printf("\tArrayList --> Duración %dms \n",dur.toMillis());
			
		j = 0;
		start = Instant.now();
		// Some operation
		// Inserción en el LinkedList
		while(linkedIt.hasNext()) {
			if(j %2 == 0 && j != 0) linkedIt.remove();
			linkedIt.next();
			j++;			
		}
		end = Instant.now();
		dur = Duration.between(start, end);
		System.out.printf("\tLinkedList --> Duración %dms \n",dur.toMillis());
	}

}
