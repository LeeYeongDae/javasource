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

          studentInfo(stu3);

          stu3.setPhone("010-5678-4321");
          System.out.println(stu3);
     }

     public static void studentInfo(Student stu) {
          System.out.println("==============================");
          System.out.println("아이디 : " + stu.getId());
          System.out.println("이름 : " + stu.getName());
          System.out.println("학년 : " + stu.getGrade());
          System.out.println("반 : " + stu.getClassN());
          System.out.println("전화번호 : " + stu.getPhone());
          System.out.println("이메일 : " + stu.getAddress());
          System.out.println("==============================");
     }
}
