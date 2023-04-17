package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HoraExacta he = new HoraExacta(23, 59, 59);
		
		he.inc();
		
		System.out.println(he.toString());
	}

	static public void menu() {
		System.out.println("-------MENU-------");
		System.out.println("-  1.Añadir min  -");
		System.out.println("-  2.Cambiar min -");
		System.out.println("- 3.Cambiar hora -");
		System.out.println("-    4.Mostrar   -");
		System.out.println("-  5.Hora exacta -");
		System.out.println("------------------");
	}

}
