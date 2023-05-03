package ejercicio2;

public class Directivo extends Empleado{

	/**
	 * Constructor con el nombre del empleado
	 * @param nombre	Nombre del empleado
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	/**
	 * Metodo toString de la clase Directivo
	 */
	@Override
	public String toString() {
		return super.toString()+" -> Directivo ";
	}
	
	
}
