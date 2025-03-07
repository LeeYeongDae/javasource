package extend;

public class Vector {
     int x, y;

     public Vector() {
          this(0, 0);
     }

     public Vector(int x, int y) {
          this.x = x;
          this.y = y;
     }

     String getXY() {
          return "(" + x + ", " + y + ")";
     }
}
