package ejercicio3;

public class Productos {

	/**
	 * Nombre del producto
	 */
	protected String nombre;

	/**
	 * Precio del producto
	 */
	protected double precio;

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 */
	public Productos(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * Metodos get y set de los atributos de la clase Productos
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Metodo toString de la clase Productos
	 */
	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", precio=" + precio + "]";
	}

	/**
	 * Metodo para calcular el valor de la compra
	 * 
	 * @param cantidad Cantidad de producto
	 * @return Precio a pagar
	 */
	public double calcular(int cantidad) {

		return precio * cantidad;
	}

}
