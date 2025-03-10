package poly;

public class CarEx {
     public static void main(String[] args) {
          Car car = new FireEngine();

          car.drive();
          car.stop();

          // FireEngine fe = (FireEngine) car;
          // fe.water();

          ((FireEngine) car).water();

          if (car instanceof FireEngine) {
               System.out.println("FireEngine");
          }
          if (car instanceof Car) {
               System.out.println("Car");
          }

          Car car2 = new Car();
          if (car2 instanceof FireEngine) {
               System.out.println("FireEngine"); // X
          }
          if (car2 instanceof Car) {
               System.out.println("Car");
          }
     }
}
