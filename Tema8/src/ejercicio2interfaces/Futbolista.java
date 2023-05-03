package ejercicio2interfaces;

public class Futbolista implements Comparable {

	/**
	 * Numero de la camiseta
	 */
	protected int numCamiseta = 0;

	/**
	 * Nombre del futbolista
	 */
	protected String nombre = "";

	/**
	 * Edad del futbolista
	 */
	protected int edad = 12;

	/**
	 * Numero de goles
	 */
	protected int numGoles = 0;

	/**
	 * Constructor de futbolista, asigna a los objetos que lo llaman los valores
	 * pertinentes
	 * 
	 * @param numCam   Número de camiseta
	 * @param nombre   Nombre del jugador
	 * @param edad     Edad del jugador
	 * @param numGoles Número de goles del jugador
	 */
	public Futbolista(int numCam, String nombre, int edad, int numGoles) {
		if (numCam > 0 && numCam < 100) {
			this.numCamiseta = numCam;
		}
		this.nombre = nombre;
		if (edad >= 18) {
			this.edad = edad;
		}
		if (numGoles > 0) {
			this.numGoles = numGoles;
		}
	}

	/**
	 * Método equals, devuelve true en caso de que el atributo elegido sea igual al
	 * atributo del objeto al que se compara, y false en caso contrario
	 */
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;

		Futbolista el_panda = (Futbolista) obj;
		if (this.numCamiseta == el_panda.numCamiseta && this.nombre.equalsIgnoreCase(el_panda.nombre))
			iguales = true;

		return iguales;
	}

	/**
	 * Método compareTo, compara dos objetos en base a un atributo, y devuelve un
	 * entero positivo o negativo en función del resultado
	 */
	@Override
	public int compareTo(Object o) {
		int res = 0;
		Futbolista joaquin = (Futbolista) o;

		if (this.numCamiseta > joaquin.numCamiseta) {
			res = 1;
		} else if (this.numCamiseta < joaquin.numCamiseta) {
			res = -1;
		} else {
			if (this.nombre.compareToIgnoreCase(joaquin.nombre) > 0) {
				res = 1;
			} else {
				res = -1;
			}
		}

		return res;
	}

	/**
	 * Metodo toString de la clase futbolista
	 */
	@Override
	public String toString() {
		return "FUTBOLISTA\nNumero de Camiseta: " + numCamiseta + "\nNombre: " + nombre + "\nEdad: " + edad
				+ "\nNumero de goles: " + numGoles;
	}

}
