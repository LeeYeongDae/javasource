package oop;

//Product 클래스

import java.time.LocalDate;

public class Product {
     // 멤버 변수, 멤버 메소드, 생성자
     String name;
     String id;
     int price;
     LocalDate date;

     // 생성자 : 명시하지 않으면 default 생성
     public Product() {
     } // default 생성자

     public Product(String id, String name, int price, LocalDate date) {
          this.date = date;
          this.id = id;
          this.name = name;
          this.price = price;
     }

     public void setPrice(int price) {
          this.price = price;
     }

     @Override
     public String toString() {
          return "Product [name=" + name + ", id=" + id + ", price=" + price + ", date=" + date + "]";
     }

}
