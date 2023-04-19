package ejercicio3;

public class NoPerecedero extends Productos{

	protected String tipo;
	
	public NoPerecedero(String tipo, String nombre, double precio) {
		super(nombre, precio);
		this.tipo=tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "NoPerecedero [tipo=" + tipo + "]";
	}
	
	@Override
	public double calcular(int cantidad) {
		
		return super.precio * cantidad;
	}

}
