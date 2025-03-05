package oop;

public class Triangle {

     int width;
     int height;

     public Triangle() {
     }

     public Triangle(int height, int width) {
          this.height = height;
          this.width = width;
     }

     float getArea() {
          return width * height * 0.5f;
     }

     @Override
     public String toString() {
          return "Triangle [width=" + width + ", height=" + height + "]";
     }
}
