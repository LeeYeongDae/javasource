package extend;

public class Circle extends Shape {
     Vector vec;
     int r;

     public Circle() {
     }

     public Circle(Vector vec, int r) {
          this.r = r;
          this.vec = vec;
     }

     void draw() {
          System.out.println("원");
     }
}
