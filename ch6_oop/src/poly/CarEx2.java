package poly;

public class CarEx2 {
     public static void main(String[] args) {
          Car2 car2 = new Car2();

          for (int i = 0; i < 5; i++) {
               int err = car2.run();
               switch (err) {
                    case 1:
                         System.out.println(car2.fL.location + " 교체");
                         car2.fL = new HankookTire(15, car2.fL.location);
                         break;
                    case 2:
                         System.out.println(car2.fR.location + " 교체");
                         car2.fR = new KumhoTire(13, car2.fR.location);
                         break;
                    case 3:
                         System.out.println(car2.bL.location + " 교체");
                         car2.bL = new HankookTire(5, car2.bL.location);
                         break;
                    case 4:
                         System.out.println(car2.bR.location + " 교체");
                         car2.bR = new KumhoTire(13, car2.bR.location);
                         break;
                    default:
                         break;
               }
          }
     }
}
