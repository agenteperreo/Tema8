package ejercicio4;

public class Lavadora extends Electrodomestico{

	private int carga;
	
	
	public Lavadora() {
		super();
	}

	public Lavadora(int carga) {
		this.carga = 5;
	}

	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
		this.carga=5;
	}

	public Lavadora(double precioBase, String color, char consumoElectrico, int peso, int carga) {
		super(precioBase, color, consumoElectrico, peso);
		this.carga=carga;
	}


	public int getCarga() {
		return carga;
	}

	public double precioFinal() {
		
		double precioFinal = super.precioFinal();
		
		if(carga>30) {
			precioFinal+=50;
		}
		
		return precioFinal;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + super.toString() + "]";
	}
	
		
	
	
}
