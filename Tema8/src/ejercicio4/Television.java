package ejercicio4;

public class Television extends Electrodomestico{

	private double resolucion;
	private boolean tdt;

	public Television() {
		this.resolucion = 20;
		this.tdt = false;
	}
	
	public Television(double precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion=20;
		this.tdt=false;
	}

	public Television( double precioBase, String color, char consumoElectrico, int peso, double resolucion, boolean tdt	) {
		super(precioBase, color, consumoElectrico, peso);
		this.resolucion=resolucion;
		this.tdt=tdt;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}
	
	public double precioFinal() {
		
		double precioFinal = super.precioFinal();
		
		//Si la resolución es mayor que 40 pulgadas, se incrementa el precio en un 30%
        if (this.resolucion > 40) {
            precioFinal = precioFinal + (precioFinal * 0.3);
        }

        //Si tiene TDT, se incrementa el precio en 50€
        if (this.tdt) {
            precioFinal += 50;
        }

        return precioFinal;
	}

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", tdt=" + tdt +  super.toString() + "]";
	}
	
	
}
