package oop;

//OOP(Object Oriented Programming) : 객체지향 프로그래밍

import java.util.Arrays;

public class MethodEx {
     public static void main(String[] args) {
          Method method = new Method();

          int result = method.add(14, 25);
          float result2 = method.add2(14, 25.5f);
          System.out.println(result + ", " + result2);

          System.out.println(method.add(99, 1));
          method.print("와타시", "123");

          int[] ar = { 1, 2, 3 };
          int[] arr1 = method.arr(ar);
          System.out.println(Arrays.toString(arr1));
     }
}
