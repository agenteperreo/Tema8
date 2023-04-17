package ejercicio3;

public class Perecedero extends Productos{
	
	protected int diasCaducar;

	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		this.diasCaducar = diasCaducar;
	}

	public int getDiasCaducar() {
		return diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}

	@Override
	public String toString() {
		return "Perecedero [diasCaducar=" + diasCaducar + "]";
	}
	
	public double calcular(int cantidad) {
		
		double precioF;
		
		if(diasCaducar == 1) {
			precioF = super.calcular(cantidad)/4;
		}
	}
}