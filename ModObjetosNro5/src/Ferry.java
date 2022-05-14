
import java.util.Scanner;

/**
 * clase Ferry me permite instanciar el objeto vehiculoperteneciente a las
 * diferentes clases
 * y asi poner a prueba la funcionalidad de sus metodos mediante la herencia
 */

public class Ferry {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int menu1 = 0;

        try {
            do {

                System.out.println("\n Sistema Ferry");
                System.out.println("""

                        Elija el vehiculo:

                         1. Tipo Camion.\n
                         2. Tipo Carro.\n
                         3. Moto.\n
                         4. Bote.\n
                         5. Salir del sistema:""");

                menu1 = Integer.parseInt(s.nextLine());
                switch (menu1) {
                    case 1:
                        Truck camion = new Truck("KDH402", 18, "Terrestre", 8.6);

                        System.out.println("PLACA: " + camion.getIdBadge());
                        System.out.println("CANT/LLANTAS: " + camion.getTires());
                        System.out.println("TIPO: " + camion.getTypeVehicle());
                        System.out.println("CAP/CARGA:  " + camion.getCapacity() + "TON");
                        break;

                    case 2:

                        System.out.println("Por favor seleccione el tipo de Automovil ");

                        System.out.println("-Si el vehículo tiene 5 puertas 1, si tien 3 puertas  digite 0");
                        int cantDoor = Integer.parseInt(s.nextLine());
                        Car carro = new Car("KDH402", 4, "Terrestre", (cantDoor != 0));
                        System.out.println(carro.getCantDoor());
                        System.out.println(carro);

                        break;
                    case 3:
                        Motorcycle mtcycle = new Motorcycle("1g5kl", 3, "Terrestre");
                        mtcycle.status();
                        mtcycle.powerOn();
                        System.out.println(mtcycle);

                        break;
                    case 4:
                        System.out.println("Por favor seleccione el tipo de Automovil ");

                        System.out.println("-digite 1 si es Carguero, Digite 0 si es de pasajeros");
                        int typeBoat = Integer.parseInt(s.nextLine());
                        Boat bote = new Boat("La areina2022", "Acuatico", (typeBoat != 0));
                        System.out.println(bote.isTypeBoat());
                        System.out.println(bote);

                        break;

                }

            } while (menu1 != 5);

        } catch (NumberFormatException e) {
            System.out.println("Error: Verificar el dato ingresado");
        }
    }
}
