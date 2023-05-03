package ejercicio3interfaces;

import ejercicio3interfaces.Interfaces.edificio;

public class EdificioOficinas implements edificio {

	/**
	 * Numero de oficinas
	 */
	protected int numOfi;

	/**
	 * Dirección del edificio
	 */
	protected String direccion;

	/**
	 * Tamaño medio de las oficinas
	 */
	protected static final double TAMAÑO = 8.3;

	/**
	 * Constructor con el numero de oficinas solo
	 * 
	 * @param numOfi Numero de oficinas del edificio
	 */
	public EdificioOficinas(int numOfi, String direccion) {
		super();
		this.numOfi = numOfi;
		this.direccion = direccion;
	}

	/**
	 * Metodo get del numero de oficinas del edificio
	 * 
	 * @return numero de oficinas
	 */
	public int getNumOfi() {
		return numOfi;
	}

	/**
	 * Metodos get y set de la direcció del edificio
	 */
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Metodo implementado de la interfaz edificio para calcular la superficie del
	 * edificio de oficinas
	 * 
	 * @return superficie total del edificio
	 */
	@Override
	public double getSuperficie() {

		double superficie = TAMAÑO * numOfi;

		return superficie;

	}

	/**
	 * Metodo toString de la clase EdificioOficinas
	 */
	@Override
	public String toString() {
		return "Dirección: " + direccion + "\nNumero de oficinas: " + numOfi + "\nSuperficie total del edificio: "
				+ getSuperficie();
	}

}
