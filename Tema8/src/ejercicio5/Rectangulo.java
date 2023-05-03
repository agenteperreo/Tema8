package ejercicio5;

public class Rectangulo extends Poligono {

	/**
	 * Primer lado del rectangulo
	 */
	private double lado1;
	
	/**
	 * Segundo lado del rectangulo
	 */
	private double lado2;

	/**
	 * Constructor vacio
	 * 
	 * @param numeroLados Atributo numero de lados del poligono heredado de la clase
	 *                    padre
	 */
	public Rectangulo(int numeroLados) {
		super(numeroLados);
	}
	/**
	 * Constructor con todos los parametros
	 * 
	 * @param numeroLados Numero de lado del poligono
	 * @param lado1       Primer lado del rectangulo
	 * @param lado2       Segundo lado del rectangulo
	 */
	public Rectangulo(int numeroLados, double lado1, double lado2) {
		super(numeroLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	/**
	 * Metodos getters y setters de cada lado del rectangulo
	 */

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * Metodo que calculará el area del rectangulo
	 * 
	 * @return Area del rectangulo
	 */
	@Override
	public double area() {

		// Calculamos el area del rectangulo
		double area = lado1 * lado2;

		// Devolvemos el resultado del calculo
		return area;
	}

	/**
	 * Metodo toString de la clase Rectangulo
	 * 
	 * @return Información del rectangulo
	 */
	@Override
	public String toString() {
		return "RECTANGULO\nBase: " + lado1 + "\nAltura: " + lado2 + "\nArea: " + area() + "\n";
	}

}
