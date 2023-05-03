package ejercicio4interfaces;

public abstract class AnimalDomestico implements Animal {

	/**
	 * Nombre de la mascota
	 */
	protected String nombre;

	/**
	 * Raza de la mascota
	 */
	protected String raza;

	/**
	 * Peso de la mascota
	 */
	protected double peso;

	/**
	 * Color del pelo de la mascota
	 */
	protected String color;

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre Nombre
	 * @param raza   Raza
	 * @param peso   Peso
	 * @param color  Color
	 */
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
	}

	/**
	 * Metodos get y set de cada atributo
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Metodo para vacunar a la mascota
	 */
	public void vacunar() {
		System.out.println("Animal vacunado contra to");
	}

	/**
	 * Metodo abstracto que se definirá en las clases hijas
	 * 
	 * @return Si hace caso o no
	 */
	public abstract boolean hacerCaso();

	/**
	 * Metodo del sonido de la mascota comiendo implementado de la interfaz Animal
	 */
	@Override
	public void comer() {
		System.out.println("Ñam ñam ñam");
	}

	/**
	 * Metodo del sonido de la mascota durmiendo implementado de la interfaz Animal
	 */
	@Override
	public void dormir() {

		System.out.println("Zzzzzz");
	}

	/**
	 * Metodo abstracto implementado por la interfaz Animal que se definirá en las
	 * clases hijas
	 */
	@Override
	public abstract void hacerRuido();

}
