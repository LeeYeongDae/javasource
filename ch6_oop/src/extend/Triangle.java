package extend;

public class Triangle extends Shape {
     Vector[] vec;

     public Triangle(Vector[] vec) {
          this.vec = vec;
     }

     void draw() {
          System.out.println("삼각형");
     }
}
