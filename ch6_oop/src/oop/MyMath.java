package oop;

public class MyMath {

     int add(int a, int b) {
          System.out.println("int add(int a, int b)");
          return a + b;
     }

     int add(int a, float b) {
          System.out.println("int add(int a, float b)");
          return (int) (a + b);
     }

     int add(int a[]) {
          System.out.println("int add(int a[])");
          int sum = 0;
          for (int idx = 0; idx < a.length; idx++) {
               sum += a[idx];

          }
          return sum;
     }
}
