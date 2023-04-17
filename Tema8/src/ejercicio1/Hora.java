package ejercicio1;

public class Hora {

	/**
	 * Horas de la hora actual
	 */
	int hora;

	/**
	 * Minutos de la hora actual
	 */
	int minutos;

	/**
	 * Contructor con los 2 atributos
	 * 
	 * @param hora    Horas de la hora actual
	 * @param minutos Minutos de la hora actual
	 */
	public Hora(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}

	/**
	 * Metodo para incrementar los minutos y comprobar la hora
	 */
	public void inc() {

		// Añadimos 1 minuto a la hora
		minutos++;

		// Si los minutos es mayor que 59
		if (minutos > 59) {

			// Le restamos 60 a los minutos
			minutos -= 60;

			// Y añadimos 1 hora
			hora++;
		}

		// Si la hora es mayor que 23
		if (hora > 23) {

			// Le restamos 24 a las horas
			hora -= 24;
		}
	}

	/**
	 * Metodo para cambiar los minutos
	 * 
	 * @param minutos Nuevo valor de los minutos
	 * @return Si era valido el nuevo valor
	 */
	public boolean setMinutos(int minutos) {

		// Creamos la variable boolean para saber si los minutos eran correctos
		boolean valida = true;

		// Si los minutos son mayor que 59 o menor que 0
		if (minutos > 59 || minutos < 0) {

			// El valor no es correcto
			valida = false;

			// Si no
		} else {

			// El nuevo valor de los minutos de la hora es el parametro minutos
			this.minutos = minutos;
		}

		// Devolvemos si se ha podido hacer el cambio
		return valida;

	}

	/**
	 * Metodo para cambiar la hora
	 * 
	 * @param hora Nuevo valor de las horas
	 * @return Si se ha podido hace el cambio
	 */
	public boolean setHora(int hora) {

		//Creamos la variable boolean para saber si las horas eran correctas
		boolean valida = true;

		// Si la hora es mayor que 23 o menor que 0
		if (hora > 23 || hora < 0) {
			
			// El valor no es correcto
			valida = false;
			
			// Si no
		} else {
			
			// El nuevo valor de las horas de la hora es el parametro hora
			this.hora = hora;
		}

		// Devolvemos si se ha podido hacer el cambio
		return valida;
	}

	/**
	 * Metodo para mostrar la hora
	 */
	public String toString() {

		// Devolvemos la hora en un formato correcto
		return this.hora + ":" + this.minutos;
	}

}
