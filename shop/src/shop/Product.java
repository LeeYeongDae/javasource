package shop;

public abstract class Product {
     private String pname;
     private int price;

     public Product(String pname, int price) {
          this.pname = pname;
          this.price = price;
     }

     public void printInfo() {
          System.out.println("제품명 : " + this.pname);
          System.out.println("가격 : " + this.price);
          this.printExtra();
     }

     public abstract void printExtra();

     public String getPname() {
          return pname;
     }

     public int getPrice() {
          return price;
     }
}

class Tv extends Product {
     private String resolution;

     public Tv(String pname, int price, String resolution) {
          super(pname, price);
          this.resolution = resolution;
     }

     @Override
     public void printExtra() {
          System.out.println("해상도 : " + this.resolution);
     }
}

class CellPhone extends Product {
     private String carrier;

     public CellPhone(String pname, int price, String carrier) {
          super(pname, price);
          this.carrier = carrier;
     }

     @Override
     public void printExtra() {
          System.out.println("통신사 : " + this.carrier);
     }
}
