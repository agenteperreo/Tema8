package ejercicio4;

public class Television extends Electrodomestico {

	/**
	 * Resolución de la TV
	 */
	private double resolucion;

	/**
	 * Si contiene tdt o no
	 */
	private boolean tdt;

	/**
	 * Constructor por defecto
	 */
	public Television() {
		this.resolucion = 20;
		this.tdt = false;
	}

	/**
	 * Constructor con el precio base y el peso
	 * 
	 * @param precioBase Precio base de la TV
	 * @param peso       Peso de la TV
	 */
	public Television(double precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.tdt = false;
	}

	/**
	 * Contructor con todos los parametros
	 * 
	 * @param precioBase       Precio base de la TV
	 * @param color            Color de la TV
	 * @param consumoElectrico Consumo energetico de la TV
	 * @param peso             Peso de la TV
	 * @param resolucion       Resolución de la TV
	 * @param tdt              Tdt de la TV
	 */
	public Television(double precioBase, String color, char consumoElectrico, int peso, double resolucion,
			boolean tdt) {
		super(precioBase, color, consumoElectrico, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	/**
	 * Metodos get de los atributos de la clase Television
	 */

	public double getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

	/**
	 * Metodo que aumenta el precio de la TV en función de la resolución y si tiene
	 * tdt o no
	 * 
	 * @return Precio final de la TV
	 */
	public double precioFinal() {

		double precioFinal = super.precioFinal();

		// Si la resolución es mayor que 40 pulgadas, se incrementa el precio en un 30%
		if (this.resolucion > 40) {
			precioFinal = precioFinal + (precioFinal * 0.3);
		}

		// Si tiene TDT, se incrementa el precio en 50€
		if (this.tdt) {
			precioFinal += 50;
		}

		// Precio final
		return precioFinal;
	}

	/**
	 * Metodo toString de la clase television
	 * 
	 * @return Información de la TV
	 */
	@Override
	public String toString() {
		return "TELEVISIÓN\nResolucion=" + resolucion + "\nTDT=" + tdt + super.toString();
	}

}
