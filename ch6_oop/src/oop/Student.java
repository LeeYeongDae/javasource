package oop;

//Student 클래스

public class Student {
     // 멤버 변수, 멤버 메소드, 생성자, 소멸자
     private String name;
     private String id;
     private int grade;
     private int classN;
     private String phone;
     private String address;

     // 생성자 : 명시하지 않으면 default 생성
     public Student() {
     } // default 생성자

     public Student(int grade, int classN) {
          this.grade = grade; // 지역변수 grade를 이 클래스의 grade에 저장
          this.classN = classN;
     }

     public Student(String name, String id, int grade, int classN, String phone, String address) {
          this.name = name;
          this.id = id;
          this.grade = grade;
          this.classN = classN;
          this.phone = phone;
          this.address = address;
     }

     // 멤버 메서드(기본타입, 객체, 보이드)
     public void setName(String name) {
          this.name = name;
     }

     public String getName() {
          return name;
     }

     public void setId(String id) {
          this.id = id;
     }

     public String getId() {
          return id;
     }

     public void setGrade(int grade) {
          this.grade = grade;
     }

     public void setClassN(int classN) {
          this.classN = classN;
     }

     public void setPhone(String phone) {
          this.phone = phone;
     }

     public void setAddress(String address) {
          this.address = address;
     }

     @Override
     public String toString() {
          return "Student [name=" + name + ", id=" + id + ", grade=" + grade + ", classN=" + classN + ", phone=" + phone
                    + ", address=" + address + "]";
     }

     public int getGrade() {
          return grade;
     }

     public int getClassN() {
          return classN;
     }

     public String getPhone() {
          return phone;
     }

     public String getAddress() {
          return address;
     }
}
