package ejercicio4;

public class Lavadora extends Electrodomestico{

	private int carga=5;

	public Lavadora() {
		super();
	}

	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
	}

	public Lavadora(int carga, double precioBase, String color, char consumoElectrico, int peso) {
		super(precioBase, color, consumoElectrico, peso);
		this.carga=carga;
	}

	
	
	
	
}
