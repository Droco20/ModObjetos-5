/**
 * Clase que me permite construir por medio de los atributos propios y heredados
 * de la clase Vehiculo un objetos
 * Carro
 */
public class Car extends Vehicle {

     Boolean cantDoor;

     /**
      * metodo constructor pasa los atributos nescesarios para crear una variante del
      * objeto Vehiculo
      */

     public Car(String idBadge, int tires, String typeVehicle, Boolean cantDoor) {
          super(idBadge, tires, typeVehicle);
          this.cantDoor = cantDoor;
     }

     /** metodos de acceso */

     public Boolean getCantDoor() {
          return cantDoor;
     }

     public void setCantDoor(Boolean cantDoor) {
          this.cantDoor = cantDoor;
     }

     @Override
     public String toString() {
          return " [Automovil tipo: " + (cantDoor == true ? "SEDAN" : "COUPE") + "]";
     }

}
