package ejercicio1interfaces;

public class Socio implements Comparable {

	/**
	 * Id del socio
	 */
	protected int id;

	/**
	 * Nombre del socio
	 */
	protected String nombre;

	/**
	 * Edad del socio
	 */
	protected int edad;

	/**
	 * Contructor con parametros
	 * 
	 * @param id     Id del socio
	 * @param nombre Nombre del socio
	 * @param edad   Edad del socio
	 */
	public Socio(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * Metodo toString de la clase socio
	 */
	@Override
	public String toString() {
		return "Socio numero: " + id + "\nNombre: " + nombre + "\nEdad: " + edad;
	}

	@Override
	public int compareTo(Object o) {
		
		int res = 0;

		Socio elegido = (Socio) o;
		if (this.id > elegido.id) {
			res = 1;
		} else {
			res = -1;
		}

		return res;
	}

}
