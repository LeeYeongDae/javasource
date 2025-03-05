package oop;

//OOP(Object Oriented Programming) : 객체지향 프로그래밍

import java.util.Arrays;

public class SquareEx {
     public static void main(String[] args) {

          Square square = new Square(10);
          System.out.println(square.getArea());

          Square squares[] = new Square[5];
          squares[0] = new Square(5);
          squares[1] = new Square(23);
          squares[2] = new Square(6);
          squares[3] = new Square(8);
          squares[4] = new Square(12);
          System.out.println(Arrays.toString(squares));
          for (int i = 0; i < squares.length; i++) {
               System.out.println(i + 1 + "번째 면적 : " + squares[i].getArea());

          }
     }
}
