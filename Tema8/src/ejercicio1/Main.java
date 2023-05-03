package ejercicio1;

public class Main {

	public static void main(String[] args) {

		// Creamos el objeto
		HoraExacta he = new HoraExacta(28, 59, 59);

		// Incrementamos la hora 1 segundo
		he.inc();

		// Mostramos la hora nueva
		System.out.println("Son las: "+he);

		// Creamos el objeto h
		Hora h = new Hora(12, 59);

		// Cambiamos la hora
		h.setHora(23);

		// Cambiamos los minutos
		h.setMinutos(60);

		// Añadimos un minuto
		h.inc();

		// Mostramos la hora
		System.out.println("Son las: "+h);
	}

}
