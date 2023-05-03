package ejercicio2;

public class Empleado {
	
	/**
	 * Nombre del empleado
	 */
	private String nombre;

	/**
	 * Constructor vacio
	 */
	public Empleado() {
		super();
	}

	/**
	 * Constructor con parametros
	 * @param nombre	Nombre del empleado
	 */
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * Metodos get y set del nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo toString de la clase Empleado
	 */
	public String toString() {
		return "Empleado "+nombre;
	}
	
	

}
