package ejercicio1;

public class HoraExacta extends Hora {

	/**
	 * Segundos de la hora actual
	 */
	int segundos;

	/**
	 * Constructor heredando los atributos del padre
	 * 
	 * @param hora     Horas de la hora actual
	 * @param minutos  Minutos de la hora actual
	 * @param segundos Segundos de la hora actual
	 */
	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		this.segundos = segundos;
	}

	/**
	 * Metodos para cambiar la cantidad de segundos de la hora
	 * 
	 * @param segundos Nuevo valor de los segundos
	 */
	public void setSegundos(int segundos) {

		// Si los segundos estan entre 59 y 0
		if (segundos < 60 && segundos > -1) {

			// Los segundos es ahora el valor pasado por parametros
			this.segundos = segundos;
		}
	}

	/**
	 * Metodo para incrementar un segundo a la hora y comprobar la hora
	 */
	@Override
	public void inc() {

		// Añadimos un segundo
		segundos++;

		// Si los segundos son mayor que 59
		if (segundos > 59) {

			// Le restamos 60 segundos
			segundos -= 60;

			// Y llamamos al metodo inc() de la clase padre
			super.inc();
		}
	}
	
	@Override
	public String toString() {
		return hora+":"+minutos+":"+segundos;
	}
}
