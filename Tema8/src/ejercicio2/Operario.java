package ejercicio2;

public class Operario extends Empleado {

	/**
	 * Constructor con el nombre del empleado
	 * 
	 * @param nombre Nombre del empleado
	 */
	public Operario(String nombre) {
		super(nombre);
	}

	/**
	 * Metodo toString de la clase Operario
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Operario ";
	}

}
