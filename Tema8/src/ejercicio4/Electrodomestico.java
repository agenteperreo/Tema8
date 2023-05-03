package ejercicio4;

public class Electrodomestico {

	protected double precioBase;
	protected String color;
	protected char consumoElectrico;
	protected int peso;

	public Electrodomestico() {
		this.precioBase = 100;
		this.color = "Blanco";
		this.consumoElectrico = 'F';
		this.peso = 5;
	}

	public Electrodomestico(double precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = "Blanco";
		this.consumoElectrico = 'F';
	}

	public Electrodomestico(double precioBase, String color, char consumoElectrico, int peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoElectrico = consumoElectrico;
		this.peso = peso;
	}

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

	public char comprobarConsumoEnergetico(char letra) {

		switch (letra) {

		case 'A', 'B', 'C', 'D', 'E', 'F' -> {

		}

		default -> {
			letra = 'F';
		}
		}

		return letra;
	}

	public String comprobarColor(String color) {

		switch (color) {

		case "Blanco", "Negro", "Rojo", "Azul", "Gris" -> {

		}

		default -> {
			color = "Blanco";
		}
		}

		return color;
	}

	public double precioFinal() {

		double precioFinal=precioBase;
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

	@Override
	public String toString() {
		return "Electrodomestico [Precio Base=" + precioBase + ", Color=" + color + ", Consumo Electrico="
				+ consumoElectrico + ", Peso=" + peso + "]";
	}
	
	

}
