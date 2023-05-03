package ejercicio5;

public abstract class Poligono {

	/**
	 * Numero de lados del poligono
	 */
	protected int numeroLados;

	/**
	 * Contructor con parametros
	 * 
	 * @param numeroLados Numero de lados del poligono
	 */
	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	/**
	 * Metodo get de los lados del poligono
	 * 
	 * @return Lados del poligono
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * Metodo abstracto en el que se calculará el area del poligono dependiendo de
	 * sus lados
	 */
	public abstract double area();

	/**
	 * Metodo toString de la clase Poligono
	 * 
	 * @return Información sobre el poligono
	 */
	@Override
	public String toString() {
		return "Numero de lados del poligono: " + numeroLados;
	}

}
