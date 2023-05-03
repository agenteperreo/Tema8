package ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	/**
	 * Creamos y abrimos el escaner staci para usarlo en el main
	 */
	static Scanner sc = new Scanner(System.in);

	/**
	 * Metodo main ejecutable del ejercicio 5
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Opción elegida por el usuario
		int opc = 0;

		// ArrayList que almacenará los poligonos creados
		List<Poligono> poligonos = new ArrayList();

		// Mientras la oción no sea 4
		do {

			// Mostramos el menú
			menu();

			// Pedimos que quiere hacer al usuario
			System.out.print("¿Que quieres hacer?: ");
			opc = sc.nextInt();

			// Dependiendo de la opción del usuario
			switch (opc) {

			// Si la opción es 1
			case 1 -> {
				// Llamamos al metodo crearTriangulo pasandole el arrayList por parametros
				crearTriangulo(poligonos);
			}

			// Si la opción es 2
			case 2 -> {
				// Llamamos al metodo creaRectangulo pasando el arrayList por parametros
				crearRectangulo(poligonos);
			}

			// Si la opción es 3
			case 3 -> {
				// Mostramos todos los poligonos almacenados en el arrayList
				System.out.println();
				for (Poligono poligono : poligonos) {
					System.out.println(poligono);
				}
			}

			// Si la opción es 4
			case 4 -> {
				// Mostramos un mensaje de despedida
				System.out.println("Adioooooos");
			}

			// Si la opción no es ninguna de las anterirores
			default -> {
				// Mostramos un mensaje de error
				System.err.println("Opción no valida");
			}
			}

			System.out.println("-------------------------------------------------------");
		} while (opc != 4);
	}

	/**
	 * Metodo que mostrará el menú en el main
	 */
	public static void menu() {
		System.out.println("""
					MENU
				1. Triangulo
				2. Rectangulo
				3. Mostrar poligonos
				4. Salir
				""");
	}

	/**
	 * Metodo que creara y insertará un triangulo en el arrayList de poligonos
	 * @param poligonos	ArrayList de poligonos
	 */
	public static void crearTriangulo(List<Poligono> poligonos) {

		// Declaramos las variables
		double lado1, lado2, lado3; // Dimensiones de los lados del triangulo

		// Pedimos el primer lado del triangulo
		System.out.println("Introduce el primer lado del triángulo");
		lado1 = sc.nextDouble();

		// Pedimos el segundo lado del triangulo
		System.out.println("Introduce el segundo lado del triángulo");
		lado2 = sc.nextDouble();
		
		// Pedimos el tercer lado del triangulo
		System.out.println("Introduce el tercer lado del triángulo");
		lado3 = sc.nextDouble();

		// Creamose el objeto triangulo con los datos necesarios
		Poligono triangulo = new Triangulo(3, lado1, lado2, lado3);

		// Añadimos el objeto al arrayList
		poligonos.add(triangulo);

	}

	/**
	 * Metodo para crear e insertar un rectangulo en el arrayList de poligonos
	 * @param poligonos	ArrayList de poligonos
	 */
	private static void crearRectangulo(List<Poligono> poligonos) {

		// Declaramos las variables
		double base, altura;	// Base y alturá del rectangulo

		// Pedimos la base del rectangulo
		System.out.println("Introduce la base del rectángulo");
		base = sc.nextDouble();

		// Pedimos la altura del rectangulo
		System.out.println("Introduce la altura del rectángulo");
		altura = sc.nextDouble();

		// Creamos el objeto con los datos dados
		Poligono rectangulo = new Rectangulo(4, base, altura);

		// Añadimos el objeto al arrayList de poligonos
		poligonos.add(rectangulo);

	}

}
