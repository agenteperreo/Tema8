package ejercicio4interfaces;

public class Perro extends AnimalDomestico {

	/**
	 * Contructor con parametros heredado de la clase padre
	 * @param nombre
	 * @param raza
	 * @param peso
	 * @param color
	 */
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo que genera un numero aleatorio entra 1 y 10 y segun que numero salga
	 * la mascota hace caso o no 
	 * En este caso es un perro por lo que hay un 90% de
	 * posibilidades de que haga caso
	 * 
	 * @return Si hace caso o no
	 */
	@Override
	public boolean hacerCaso() {

		boolean haceCaso = false;

		int probabilidad = (int) (Math.random() * 10 + 1);

		if (probabilidad == 7) {
			haceCaso = false;
		} else {
			haceCaso = true;
		}

		return haceCaso;
	}

	/**
	 * Metodo heredado de la clase AnimalDomestico y a su vez implementada por la
	 * interfaz Animal que muestra el sonido del perro
	 */
	@Override
	public void hacerRuido() {

		System.out.println("Guau guau");

	}

	/**
	 * MEtodo unico de la clase perro que muestra que se pone feliz porque va a
	 * salir a pasear
	 */
	public void sacarPaseo() {
		System.out.println(super.getNombre() + " se pone feliz porque va a salir de paseo.");
	}

}
