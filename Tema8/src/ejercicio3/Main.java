package ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		// Creamos el objeto
		NoPerecedero np = new NoPerecedero("Bebida", "Monster", 2.23);
		
		// Calculamos el precio pasandole la cantidad que queremos comprar
		double total = np.calcular(25);
		
		// Mostramos el total
		System.out.printf("El total de la compra es de %.2f€", total);

	}

}
