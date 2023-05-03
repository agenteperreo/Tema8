package ejercicio2;

public class Oficial extends Operario {

	/**
	 * Constructor con el nombre del empleado
	 * 
	 * @param nombre Nombre del empleado
	 */
	public Oficial(String nombre) {
		super(nombre);
	}

	/**
	 * Metodo toString de la clase Oficial
	 */
	@Override
	public String toString() {
		return super.toString() + "-> Oficial";
	}

}
