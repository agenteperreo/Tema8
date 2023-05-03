package ejercicio3;

public class Perecedero extends Productos {

	/**
	 * Dias que quedan hasta que caduque el producto
	 */
	protected int diasCaducar;

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre      Nombre del producto
	 * @param precio      Precio del Producto
	 * @param diasCaducar Dias que quedan hasta que caduque el producto
	 */
	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		this.diasCaducar = diasCaducar;
	}

	/**
	 * Metodos get y set de los dias que falta para caducar el producto
	 */

	public int getDiasCaducar() {
		return diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}

	/**
	 * Metodo toString de la calse perecedero
	 */
	@Override
	public String toString() {
		return "Perecedero [diasCaducar=" + diasCaducar + "]";
	}

	/**
	 * Metodo en el que calcularemos la variación del productor segun los dias que
	 * queden para caducar
	 * 
	 * @return precioF Precio final del producto
	 */
	public double calcular(int cantidad) {

		double precioF;

		if (diasCaducar == 1) {
			precioF = super.calcular(cantidad) / 4;
		} else if (diasCaducar == 2) {
			precioF = super.calcular(cantidad) / 3;
		} else if (diasCaducar == 3) {
			precioF = super.calcular(cantidad) / 2;
		} else {
			precioF = super.calcular(cantidad);
		}

		// Precio final del producto
		return precioF;
	}
}
