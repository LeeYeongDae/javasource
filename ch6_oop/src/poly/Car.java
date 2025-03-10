package poly;

public class Car {
     String color;
     int door;

     void drive() {
          System.out.println("Brrrrrrrrrrr");
     }

     void stop() {
          System.out.println("얼음!!!!!!!");
     }

}

class FireEngine extends Car {
     void water() {
          System.out.println("물!!!!!!!!");
     }
}
