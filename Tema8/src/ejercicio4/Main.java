package ejercicio4;

public class Main {

	 /**
     * Método principal del ejercicio 4
     * @param args
     */
    public static void main(String[] args) {

        //Creamos un array de 10 electrodomesticos
        Electrodomestico[] arrayElec = new Electrodomestico[10];

        //Creamos los objetos de las clases Electrodomestico, Lavadora y Television
        Electrodomestico e1 = new Electrodomestico();
        Electrodomestico e2 = new Electrodomestico(200, "rojo", 'E', 30);
        Electrodomestico e3 = new Electrodomestico(300, 40);
        Electrodomestico l1 = new Lavadora();
        Electrodomestico l2 = new Lavadora(300, "azul", 'E', 40, 40);
        Electrodomestico l3 = new Lavadora(560, 100);
        Electrodomestico t1 = new Television();
        Electrodomestico t2 = new Television(400, "negro", 'C', 50, 40, true);
        Electrodomestico t3 = new Television(300, 60);

       //Introducimos los objetos que acabamos de crear en el array
        arrayElec[0] = e1;
        arrayElec[1] = e2;
        arrayElec[2] = e3;
        arrayElec[3] = l1;
        arrayElec[4] = l2;
        arrayElec[5] = l3;
        arrayElec[6] = t1;
        arrayElec[7] = t2;
        arrayElec[8] = t3;

        //Recorremos el array y lo mostramos por pantalla
        for (Electrodomestico elec: arrayElec) {
           if(elec != null){    //Siempre y cuando laa celda del array no sea nula
               System.out.println(elec);
           }
        }

	}

}