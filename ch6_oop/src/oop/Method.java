package oop;

public class Method {

     int method() {
          int i = 18;
          return i;
     }

     String method2() {
          String str = "Fxxk";
          return str;
     }

     double method3() {
          return 0;
     }

     char method4() {
          return ' ';
     }

     void method5() {
          // return;
     }

     // 매개변수 : 그냥 다 가능ㅋ
     int add(int x, int y) {
          return x + y;
     }

     float add2(int x, float y) {
          return x + y;
     }

     void print(String name, String id) {
          System.out.println(name + ": " + id);
     }

     int[] arr(int[] arr1) {
          return arr1;
     }
}
