package ejercicio4interfaces;

public class Gato extends AnimalDomestico {

	/**
	 * Contructor con parametros heredado de la clase padre
	 * 
	 * @param nombre
	 * @param raza
	 * @param peso
	 * @param color
	 */
	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	/**
	 * Metodo que genera un numero aleatorio entra 1 y 100 y segun que numeros
	 * salgan la mascota hace caso o no 
	 * En este caso es un gato por lo que hay un 5%
	 * de posibilidades de que haga caso
	 * 
	 * @return Si hace caso o no
	 */
	@Override
	public boolean hacerCaso() {

		boolean haceCaso = false;

		int probabilidad = (int) (Math.random() * 100 + 1);

		if (probabilidad == 28 || probabilidad == 57 || probabilidad == 85 || probabilidad == 12
				|| probabilidad == 48) {
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

		System.out.println("Miau miau");

	}

	/**
	 * Metodo unico de la clase gato que muestra que tose una bola de pelo
	 */
	public void toserBolaPelo() {
		System.out.println(super.getNombre() + " tose una bola de pelo");
	}

}
