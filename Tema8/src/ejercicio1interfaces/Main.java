package ejercicio1interfaces;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Guarda el resultado comparación de prueba
		int res = 0;

		// Creamos dos objetos de prueba iniciales
		Socio s1 = new Socio(1, "Paquito", 43);
		Socio s2 = new Socio(2, "El grillo", 59);

		// Comparamos ambos objetos para asegurarnos de que el código está bien
		// implementado
		res = s1.compareTo(s2);
		System.out.println(res);

		// Creamos un array de 5 objetos 'Socio'
		Socio[] lista = new Socio[5];
		lista[0] = new Socio(22, "Kaki", 19);
		lista[1] = new Socio(39, "Fresco", 20);
		lista[2] = new Socio(5, "Er queso", 32);
		lista[3] = new Socio(7, "Samuel", 15);
		lista[4] = new Socio(12, "Boni", 7);

		// Mostramos la lista de socios sin ordenar
		for (Socio s : lista) {
			System.out.println();
			System.out.println(s.toString());
		}

		// Espacio
		System.out.println();

		// Ordenamos la lista (se va a ordenar según el parámetro que le indiquemos en
		// el compareTo)
		Arrays.sort(lista);

		System.out.println("ARRAY ORDENADO:");

		// Mostramos el array ordenado
		for (Socio s : lista) {
			System.out.println(s.toString());
			System.out.println();
		}

	}

}
