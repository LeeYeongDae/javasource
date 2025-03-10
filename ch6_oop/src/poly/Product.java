package poly;

public class Product {
     int price;
     int bonusPoint;

     public Product(int price) {
          this.price = price;
          this.bonusPoint = (int) (price * 0.1);
     }

     @Override
     public String toString() {
          return "Product";
     }

}

class Tv2 extends Product {

     public Tv2() {
          super(2000);
     }

     @Override
     public String toString() {
          return "TV";
     }
}

class Computer extends Product {

     public Computer() {
          super(1000);
     }

     @Override
     public String toString() {
          return "Computer";
     }
}

class Audio extends Product {

     public Audio() {
          super(500);
     }

     @Override
     public String toString() {
          return "Audio";
     }
}