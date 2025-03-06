package oop;

//Tv 클래스

public class Tv3 {
     private int size;
     private String color;

     public Tv3() {
     }

     public Tv3(int size, String color) {
          this.color = color;
          this.size = size;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public String getColor() {
          return color;
     }

     public void setSize(int size) {
          this.size = size;
     }

     public int getSize() {
          return size;
     }

     @Override
     public String toString() {
          return "Tv [size=" + size + ", color=" + color + "]";
     }

}
