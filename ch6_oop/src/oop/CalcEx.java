package oop;

//OOP(Object Oriented Programming) : 객체지향 프로그래밍

public class CalcEx {
     public static void main(String[] args) {

          Calc calc = new Calc();
          int plus = calc.add(124, 523);
          int minus = calc.subtract(523, 124);
          int mul = calc.multiply(4, 4);
          float div = calc.divide(999, 125);
          int las = calc.last(1425235, 4);
          System.out.printf("%d %d %d %.3f %d\n", plus, minus, mul, div, las);
          System.out.println(calc.max(10, 8));
          System.out.println(calc.min(10, 8));
     }
}
