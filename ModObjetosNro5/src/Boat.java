/**
 * Clase que me permite construir por medio de los atributos propios y heredados
 * de la clase Vehiculo un objetos
 * Bote
 */
public class Boat extends Vehicle {

     boolean typeBoat;

     /**
      * constructor que me permite instanciar un objeto con atributos heredados y
      * propio
      */

     public Boat(String idBadge, String typeVehicle, boolean typeBoat) {
          super(idBadge, typeVehicle);
          this.typeBoat = typeBoat;
     }

     /** metodo que permite pasar la informacion del atributo tipo bote */

     @Override
     public String toString() {
          return " [Bote typo: " + (typeBoat == true ? "Carguero" : "Pasajeros") + "]";
     }

     /** metodos de acceso */

     public boolean isTypeBoat() {
          return typeBoat;
     }

     public void setTypeBoat(boolean typeBoat) {
          this.typeBoat = typeBoat;
     }

}
