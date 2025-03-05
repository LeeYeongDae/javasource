package oop;

public class MiniCalc {

     static int k;
     int a, b;

     static void print() {
          // static 메서드에서 non-static 메서드 호출 불가 -> new 선언 후 실행
          MiniCalc mc = new MiniCalc();
          mc.a = 5;
          k = 6;
     }

     // 동일 클래스 내에선 바로 호출 가능
     int add(int x, int y) {
          return x + y;
     }

     double avg(int x, int y) {
          return (add(x, y)) / 2.0;
     }

     void execute() {
          println("실행 결과 : " + avg(7, 10));
     }

     void println(String msg) {
          System.out.println(msg);
     }

}
