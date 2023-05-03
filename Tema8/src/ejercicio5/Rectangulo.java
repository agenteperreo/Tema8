package ejercicio5;

public class Rectangulo extends Poligono{

	private double lado1;
	private double lado2;
	

	public Rectangulo(int numeroLados) {
		super(numeroLados);
	}

	public Rectangulo(int numeroLados, double lado1, double lado2) {
		super(numeroLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public double area() {

		double area=lado1*lado2;
		return area;
	}

	
}
