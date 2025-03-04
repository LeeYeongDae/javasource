package oop;

//OOP(Object Oriented Programming) : 객체지향 프로그래밍

public class ClassEx1 {
     public static void main(String[] args) {
          Tv tv = new Tv();

          System.out.println(tv);

          tv.setColor("Black");
          tv.setPower();
          tv.channelUp();
          tv.volume = 22;
          System.out.println("TV 색상 : " + tv.getColor());
     }
}
