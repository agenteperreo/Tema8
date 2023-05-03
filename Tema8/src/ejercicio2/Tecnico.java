package ejercicio2;

public class Tecnico extends Operario {

	/**
	 * Constructor con el nombre del empleado
	 * 
	 * @param nombre Nombre del empleado
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	/**
	 * Metodo toString de la clase Tecnico
	 */
	@Override
	public String toString() {
		return super.toString() + "-> Tecnico";
	}

}
