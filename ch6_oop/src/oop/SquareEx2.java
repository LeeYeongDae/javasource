package oop;

//OOP(Object Oriented Programming) : 객체지향 프로그래밍

import java.util.Arrays;

public class SquareEx2 {
     public static void main(String[] args) {

          Square square = new Square(10);
          System.out.println(square.getArea());

          Square squares[] = new Square[5];
          for (int i = 0; i < squares.length; i++) {
               squares[i] = new Square();
          }
          for (int i = 0; i < squares.length; i++) {
               squares[i].length = (i * 3 + 2);
          }
          System.out.println(Arrays.toString(squares));
          for (int i = 0; i < squares.length; i++) {
               System.out.println(i + 1 + "번째 면적 : " + squares[i].getArea());

          }
     }
}
