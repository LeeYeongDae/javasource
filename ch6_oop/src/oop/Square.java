package oop;

public class Square {

     int length;

     public Square() {
     }

     public Square(int length) {
          this.length = length;
     }

     int getArea() {
          return length * length;
     }

     @Override
     public String toString() {
          return "Square [length=" + length + "]";
     }

}
