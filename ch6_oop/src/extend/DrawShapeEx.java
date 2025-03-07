package extend;

public class DrawShapeEx {
     public static void main(String[] args) {
          Vector[] vec = new Vector[3];
          vec[0] = new Vector(100, 100);
          vec[1] = new Vector(140, 50);
          vec[2] = new Vector(200, 100);

          Triangle tri = new Triangle(vec);
          tri.draw();

          Circle cir = new Circle(new Vector(150, 150), 50);
          cir.draw();
     }
}
