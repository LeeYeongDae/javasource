package stream;

public class Member {
     private String name;
     private int age;
     private Sex sex;

     public Member() {
     }

     public Member(String name, Sex sex, int age) {
          this.age = age;
          this.name = name;
          this.sex = sex;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public Sex getSex() {
          return sex;
     }

     public void setSex(Sex sex) {
          this.sex = sex;
     }

}

enum Sex {
     MALE, FEMALE
};
