package oop;

//OOP(Object Oriented Programming) : 객체지향 프로그래밍

public class TriangleEx {
     public static void main(String[] args) {

          Triangle tri0 = new Triangle();
          Triangle tri = new Triangle(5, 5);

          System.out.println(tri.getArea());
     }
}
