package ejercicio3;

public class NoPerecedero extends Productos {

	/**
	 * Tipo del producto no perecedero
	 */
	protected String tipo;

	/**
	 * Constructor con parametros
	 * 
	 * @param tipo   Tipo de producto no perecedero
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 */
	public NoPerecedero(String tipo, String nombre, double precio) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	/**
	 * Metodos get y set del tipo de producto no perecedero
	 * 
	 * @return
	 */
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Metodo toString de la clase NoPerecedero
	 */
	@Override
	public String toString() {
		return "NoPerecedero [tipo=" + tipo + "]";
	}

	/**
	 * Metodo para calcular el precio final de la compra
	 * 
	 * @return Precio final de la compra
	 */
	@Override
	public double calcular(int cantidad) {

		return super.precio * cantidad;
	}

}
