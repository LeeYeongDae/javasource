package oop;

public class MyMathEx {

     public static void main(String[] args) {
          MyMath math = new MyMath();

          System.out.println(math.add(15, 24));
          System.out.println(math.add(15, 24.5f));
          int[] a = { 4, 5, 23 };
          System.out.println(math.add(a));
     }
}
