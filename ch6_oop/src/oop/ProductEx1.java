package oop;

//OOP(Object Oriented Programming) : 객체지향 프로그래밍

import java.time.LocalDate;

public class ProductEx1 {
     public static void main(String[] args) {

          Product pro1 = new Product();

          pro1.id = "P123454";
          pro1.name = "운동화";
          pro1.price = 123400;
          pro1.date = LocalDate.now();

          System.out.println(pro1);
     }
}
