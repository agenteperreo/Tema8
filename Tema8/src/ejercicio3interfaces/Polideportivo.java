package ejercicio3interfaces;

import ejercicio3interfaces.Interfaces.edificio;
import ejercicio3interfaces.Interfaces.instalacion;

public class Polideportivo implements edificio, instalacion{

	/**
	 * Dirección del polideportivo
	 */
	protected String direccion;

	/**
	 * Nombre del polideportivo
	 */
	protected String nombre;

	/**
	 * Codigo postal del polideportivo
	 */
	protected int cp;
	
	/**
	 * Superficie del polideportivo
	 */
	protected double superficie;

	/**
	 * Constructor con parametros
	 * 
	 * @param direccion Direccion del polideportivo
	 * @param nombre    Nombre del polideportivo
	 * @param cp        Codigo postal del polideportivo
	 */
	public Polideportivo(String direccion, String nombre, int cp, double superficie) {
		super();
		this.direccion = direccion;
		this.nombre = nombre;
		this.cp = cp;
		this.superficie=superficie;
	}

	/**
	 * Metodos getters y setters de los atributos del polideportivo
	 */
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	/**
	 * Metodo get y set de la superficie del polideportivo
	 */
	@Override
	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	@Override
	public int getTipo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
}
