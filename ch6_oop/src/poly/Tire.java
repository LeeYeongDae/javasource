package poly;

public class Tire {
     int maxRotation;
     int accumulateRotation;
     String location;

     public Tire(int maxRotation, String location) {
          this.location = location;
          this.maxRotation = maxRotation;
     }

     public boolean roll() {
          ++accumulateRotation;

          if (accumulateRotation < maxRotation) {
               System.out.println(location + "Tire의 수명 : " + (maxRotation - accumulateRotation) + "회");
               return true;
          } else {
               System.out.println("**** " + location + "Tire 펑크 ***");
               return false;
          }
     }
}

class HankookTire extends Tire {

     public HankookTire(int maxRotation, String location) {
          super(maxRotation, location);
     }

     @Override
     public boolean roll() {
          ++accumulateRotation;

          if (accumulateRotation < maxRotation) {
               System.out.println(location + "HankookTire의 수명 : " + (maxRotation - accumulateRotation) + "회");
               return true;
          } else {
               System.out.println("**** " + location + "HankookTire 펑크 ***");
               return false;
          }
     }
}

class KumhoTire extends Tire {

     public KumhoTire(int maxRotation, String location) {
          super(maxRotation, location);
     }

     @Override
     public boolean roll() {
          ++accumulateRotation;

          if (accumulateRotation < maxRotation) {
               System.out.println(location + "KumhoTire의 수명 : " + (maxRotation - accumulateRotation) + "회");
               return true;
          } else {
               System.out.println("**** " + location + "KumhoTire 펑크 ***");
               return false;
          }
     }
}
