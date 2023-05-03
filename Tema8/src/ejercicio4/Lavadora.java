package ejercicio4;

public class Lavadora extends Electrodomestico {

	/**
	 * Carga que puede almacenar la lavadora
	 */
	private int carga;

	/**
	 * Contructor vacío
	 */
	public Lavadora() {
		super();
	}

	/**
	 * Contructor por defecto
	 * 
	 * @param carga Carga de la lavadora
	 */
	public Lavadora(int carga) {
		this.carga = 5;
	}

	/**
	 * Constructor con el precio base y el peso
	 * 
	 * @param precioBase Precio base de la lavadora
	 * @param peso       Peso de la lavadora
	 */
	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
		this.carga = 5;
	}

	/**
	 * Contructor con todos los parametros
	 * 
	 * @param precioBase       Precio base de la lavadora
	 * @param color            Color de la lavadora
	 * @param consumoElectrico Consumo energetico de la lavadora
	 * @param peso             Peso de la lavadora
	 * @param carga            Carga de la lavadora
	 */
	public Lavadora(double precioBase, String color, char consumoElectrico, int peso, int carga) {
		super(precioBase, color, consumoElectrico, peso);
		this.carga = carga;
	}

	/**
	 * Metodo get de la carga
	 * 
	 * @return Carga que soporta de la lavadora
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * Metodo que aumentará el precio de la lavadora si supera la carga de 30kg
	 * 
	 * @return Precio final de la lavadora
	 */
	public double precioFinal() {

		double precioFinal = super.precioFinal();

		if (carga > 30) {
			precioFinal += 50;
		}

		return precioFinal;
	}

	/**
	 * Metodo toString de la lavadora
	 * 
	 * @return Información sore la lavadora
	 */
	@Override
	public String toString() {
		return "LAVADORA\nCarga=" + carga + "\n" + super.toString();
	}

}
