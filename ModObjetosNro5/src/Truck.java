/**
 * Clase que me permite construir por medio de los atributos propios y heredados
 * de la clase Vehiculo un objetos
 * Camion
 */

public class Truck extends Vehicle {

     private double capacity;

     /**
      * constructor que me permite instanciar un objeto con atributos heredados y
      * propio
      */

     public Truck(String idBadge, int tires, String typeVehicle, double capacity) {
          super(idBadge, tires, typeVehicle);
          this.capacity = capacity;
     }

     /** metodos de acceso */

     public double getCapacity() {
          return capacity;
     }

     public void setCapacity(double capacity) {
          this.capacity = capacity;
     }

}
