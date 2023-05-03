package ejercicio2;

public class Main {

	public static void main(String[] args) {

		// Creamos un empleado, un directivo, un operario, un oficial y un tecnico
		Empleado E1 = new Empleado("Rafa");
		Directivo D1 = new Directivo("Mario");
		Operario OP1 = new Operario("Alfonso");
		Oficial OF1 = new Oficial("Luis");
		Tecnico T1 = new Tecnico("Pablo");

		// Mostramos todos los empleado
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);

	}

}
