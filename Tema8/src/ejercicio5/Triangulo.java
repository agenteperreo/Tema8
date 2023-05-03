package ejercicio5;

public class Triangulo extends Poligono {

	/**
	 * Dimensión del primer lado del triangulo
	 */
	private double lado1;

	/**
	 * Dimensión del segundo lado del triangulo
	 */
	private double lado2;

	/**
	 * Dimensión del tercer lado del triangulo
	 */
	private double lado3;

	/**
	 * Constructor vacio
	 * 
	 * @param numeroLados Atributo numero de lados del poligono heredado de la clase
	 *                    padre
	 */
	public Triangulo(int numeroLados) {
		super(numeroLados);
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param numeroLados Numero de lado del poligono
	 * @param lado1       Primer lado del triangulo
	 * @param lado2       Segundo lado del Triangulo
	 * @param lado3       Tercer lado del triangulo
	 */
	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		super(numeroLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	/**
	 * Metodos getters y setter de cada uno de los lados del triangulo
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

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	/**
	 * Metodo que calculará el area del triangulo mediante la formula de Heron
	 * 
	 * @return Area del triangulo
	 */
	@Override
	public double area() {

		// Calculamos el area del triangulo
		double area = (lado1 + lado2 + lado3) / 2;

		// Devolvemos el resultado del calculo
		return area;
	}

	/**
	 * Metodo toString de la clase Triangulo
	 * 
	 * @return Información del triangulo
	 */
	@Override
	public String toString() {
		return "TRIANGULO\nLado 1: " + lado1 + "\nLado 2: " + lado2 + "\nLado 3: " + lado3 + "\nArea: " + area() + "\n";
	}

}
