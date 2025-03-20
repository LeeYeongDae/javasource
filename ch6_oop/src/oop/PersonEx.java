package oop;

public class PersonEx {
     public static void main(String[] args) {
          Person p1 = new Person();
          p1.setName("이름");
          p1.setPno("123");
          p1.setTel("010-1234-5678");
          System.out.println(p1);

          Person2 p2 = new Person2();

          Person2 person2 = Person2.builder()
                    .pno("345")
                    .name("dlfma")
                    .tel("4")
                    .build();
     }
}
