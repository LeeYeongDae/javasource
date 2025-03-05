package oop;

//OOP(Object Oriented Programming) : 객체지향 프로그래밍

public class StudentEx1 {
     public static void main(String[] args) {

          Student stu1 = new Student();
          Student stu2 = new Student(1, 1);
          Student stu3 = new Student("S041235", "아무개", 1, 1, "010-1234-5678", "noname@gmail.com");

          System.out.println(stu1);
          System.out.println(stu2);
          System.out.println(stu3);

          stu3.setPhone("010-5678-4321");
          System.out.println(stu3);
     }
}
