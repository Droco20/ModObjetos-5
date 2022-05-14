/**
 * Clase que me permite construir por medio de los atributos propios y heredados
 * de la clase Vehiculo un objetos
 * Motococleta
 */

public class Motorcycle extends Vehicle {

     public Motorcycle(String idBadge, int tires, String typeVehicle) {
          super(idBadge, tires, typeVehicle);
          // TODO Auto-generated constructor stub
     }

     public double weight;
     public String displacement;
     public String model;
     private boolean powerOn = false;

     public double showWeight() {
          return this.weight;
     }

     /** este metodo sirve para encender el vehiculo moto */
     public void powerOn() {
          this.powerOn = true;
          System.out.println("La Motocicleta esta encendida");

     }

     /** este metodo sirve para apagar el vehiculo moto */
     public void powerOf() {
          this.powerOn = false;
          System.out.println("La Motocicleta esta apagada");

     }

     /** este metodo me muestra el estado del vehiculo moto */
     public void status() {
          if (this.powerOn == true)
               System.out.println("La Motocicleta esta en el taller");
          else
               System.out.println("La Motocicleta esta trabajando");

     }

     /** metodos de acceso getters and setters */

     public String getDisplacement() {
          return displacement;
     }

     public void setDisplacement(String displacement) {
          this.displacement = displacement;
     }

     public String getModel() {
          return model;
     }

     public void setModel(String model) {
          this.model = model;
     }

     public boolean isPowerOn() {
          return powerOn;
     }

     public void setPowerOn(boolean powerOn) {
          this.powerOn = powerOn;
     }

}
