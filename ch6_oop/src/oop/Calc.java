package oop;

public class Calc {

     int add(int x, int y) {
          return x + y;
     }

     int subtract(int x, int y) {
          return x - y;
     }

     int multiply(int x, int y) {
          return x * y;
     }

     float divide(int x, int y) {
          return (float) x / y;
     }

     int last(int x, int y) {
          return x % y;
     }

     long max(long x, long y) {
          return x >= y ? x : y;
     }

     long min(long x, long y) {
          return x <= y ? x : y;
     }

}
