package ejercicio4;

public class Electrodomestico {

	protected double precioBase;
	protected String color;
	protected char consumoElectrico;
	protected int peso;
	
	public Electrodomestico() {
		this.precioBase=100;
		this.color="Blanco";
		this.consumoElectrico='F';
		this.peso=5;
	}
	
	
	public Electrodomestico(double precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color="Blanco";
		this.consumoElectrico='F';
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
		
		switch(letra) {
		
		case 'A', 'B', 'C', 'D', 'E', 'F' -> {
			
		}
		
		default -> {
			letra='F';
		}
		}
		
		return letra;
	}
	
	
}
