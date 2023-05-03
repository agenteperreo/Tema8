package ejercicio2interfaces;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// Creamos un array de 5 objetos Futbolista
		Futbolista[] furbito = new Futbolista[6];

		// Creamos 6 futbolistas
		furbito[0] = new Futbolista(8, "Iniesta", 42, 209);
		furbito[1] = new Futbolista(7, "Cristiano Ronaldo", 38, 501);
		furbito[2] = new Futbolista(10, "Messi", 38, 753);
		furbito[3] = new Futbolista(1, "Iker Casillas", 45, 20);
		furbito[4] = new Futbolista(7, "Mbappe", 27, 964);
		furbito[5] = new Futbolista(5, "Sergio Ramos", 47, 487);

		// Mostramos el array
		for (Futbolista futbolistas : furbito) {
			System.out.println(futbolistas.toString());
		}
		System.out.println();
		System.out.println("ARRAY ORDENADO POR CAMISETA \n");

		// Ordenamos el array con el metodo compareTo por numero de camiseta
		Arrays.sort(furbito);

		// Mostramos los datos del array
		for (Futbolista futbolistas : furbito) {
			System.out.println(futbolistas.toString());
		}
	}
}
