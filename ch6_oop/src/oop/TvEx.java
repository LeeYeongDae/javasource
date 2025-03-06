package oop;

//Tv 클래스

public class TvEx {
     public static void main(String[] args) {
          Tv tv1 = new Tv();
          tv1.size = 50;

          Tv2 tv2 = new Tv2(60, "Red", false, 60, 12);
          tv2.setSize(50);
          tv2.setPower();

          Tv3 tv3 = new Tv3();
          tv3.setColor("Red");
     }

}
