package poly;

public class CarEx3 {
     public static void main(String[] args) {
          Tire fL = new HankookTire(6, "앞 왼쪽");
          Tire fR = new HankookTire(2, "앞 오른쪽");
          Tire bL = new KumhoTire(3, "뒤 왼쪽");
          Tire bR = new KumhoTire(4, "뒤 오른쪽");

          Car3 car3 = new Car3(fL, fR, bL, bR);

          System.out.println(car3.fL.accumulateRotation); // java.lang.NullPointerException
     }
}
