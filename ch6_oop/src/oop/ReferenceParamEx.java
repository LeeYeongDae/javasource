package oop;

//static 메서드 : 클래스 메서드

public class ReferenceParamEx {

     public static void main(String[] args) {
          int[] x = { 10 };
          System.out.println(x[0]);
          change(x); // 주소복사
          System.out.println(x[0]);
          change2(x[0]);

     }

     static void change(int[] x) {
          x[0] = 1000;
          System.out.println(x[0]);
     }

     static void change2(int x) {
          x = 1000;
          System.out.println(x);
     }

}
