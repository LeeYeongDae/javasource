package poly;

public class Car2 {
     Tire fL = new HankookTire(6, "앞 왼쪽");
     Tire fR = new HankookTire(2, "앞 오른쪽");
     Tire bL = new KumhoTire(3, "뒤 왼쪽");
     Tire bR = new KumhoTire(4, "뒤 오른쪽");

     public int run() {
          System.out.println("[자동차가 주행중입니다.]");
          if (!fL.roll()) {
               stop();
               return 1;
          }
          if (!fR.roll()) {
               stop();
               return 2;
          }
          if (!bL.roll()) {
               stop();
               return 3;
          }
          if (!bR.roll()) {
               stop();
               return 4;
          }
          return 0;
     }

     void stop() {
          System.out.println("[자동차가 멈췄습니다.]");
     }
}
