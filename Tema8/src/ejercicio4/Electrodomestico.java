package ejercicio4;

public class Electrodomestico {

	/**
	 * Precio base del electrodomestico
	 */
	protected double precioBase;

	/**
	 * Color del electrodomestico
	 */
	protected String color;

	/**
	 * Consumo energetico del electrodomestico
	 */
	protected char consumoElectrico;

	/**
	 * Peso del electrodomestico
	 */
	protected int peso;

	/**
	 * Constructor por defecto de los atributos
	 */
	public Electrodomestico() {
		this.precioBase = 100;
		this.color = "Blanco";
		this.consumoElectrico = 'F';
		this.peso = 5;
	}

	/**
	 * Constructor con precio y peso como unicos parametros
	 * 
	 * @param precioBase Precio base del electrodomestico
	 * @param peso       Peso del electrodomestico
	 */
	public Electrodomestico(double precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = "Blanco";
		this.consumoElectrico = 'F';
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precioBase       Precio base
	 * @param color            Color
	 * @param consumoElectrico Consumo energetico
	 * @param peso             Peso
	 */
	public Electrodomestico(double precioBase, String color, char consumoElectrico, int peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoElectrico = consumoElectrico;
		this.peso = peso;
	}

	/**
	 * Metodos get de cada atributo de la clase
	 */

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoElectrico() {
		return consumoElectrico;
	}

	public int getPeso() {
		return peso;
	}

	/**
	 * Metodo que comprobará el consumo energetico del electrodomestico
	 * 
	 * @param letra Letra del consumo energetico
	 * @return Letra corregida o no del consumo energetico
	 */
	public char comprobarConsumoEnergetico(char letra) {

		// Según la letra pasada por parametros
		switch (letra) {

		// Si la letra es A, B, C, D, E o F
		case 'A', 'B', 'C', 'D', 'E', 'F' -> {
			// Es correcta
		}

		// En caso contrario
		default -> {
			// La letra es incorrecta y la dejamos en por defecto
			letra = 'F';
		}
		}

		// Devolvemos la letra
		return letra;
	}

	/**
	 * Metodo en el que comprobamos si el color es valido
	 * 
	 * @param color Color del electrodomestico
	 * @return El color del electrodomestico
	 */
	public String comprobarColor(String color) {

		// Según el color pasado por parametros
		switch (color) {

		// Si el color es Blanco, Negro, Rojo, Azul o Gris
		case "Blanco", "Negro", "Rojo", "Azul", "Gris" -> {
			// El color es correcto
		}

		// Si no
		default -> {
			// El color es incorrecto y lo dejamos en por defecto
			color = "Blanco";
		}
		}

		// Devolvemos el color del electrodomestico
		return color;
	}

	/**
	 * Metodo en el que añadiremos al precio base cantidad segun el consumo
	 * energetico y el peso del elctrodomestico
	 * 
	 * @return Precio final del electrodomestico
	 */
	public double precioFinal() {

		double precioFinal = precioBase;
		switch (consumoElectrico) {

		case 'A' -> {
			precioFinal += 100;
		}

		case 'B' -> {
			precioFinal += 80;
		}

		case 'C' -> {
			precioFinal += 60;
		}

		case 'D' -> {
			precioFinal += 50;
		}

		case 'E' -> {
			this.precioBase += 30;
		}

		case 'F' -> {
			precioFinal += 10;
		}

		default -> {
			System.err.println("ERROR: Consumo desconocido");
		}
		}

		if (peso > -1 && peso < 20) {

			precioFinal += 10;

		} else if (peso > 19 && peso < 50) {

			precioFinal += 50;

		} else if (peso > 49 && peso < 80) {

			precioFinal += 80;

		} else if (peso > 79) {

			precioFinal += 100;

		}

		return precioFinal;
	}

	/**
	 * Metodo toString de la clase Electrodomestico
	 * 
	 * @return La información sobre el electrodomestico
	 */
	@Override
	public String toString() {
		return "Electrodomestico [Precio Base=" + precioBase + ", Color=" + color + ", Consumo Electrico="
				+ consumoElectrico + ", Peso=" + peso + "]";
	}

}
