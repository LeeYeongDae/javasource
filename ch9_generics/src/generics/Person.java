package generics;

public class Person {
     private String id;
     private String name;

     public Person(String id, String name) {
          this.id = id;
          this.name = name;
     }

     @Override
     public boolean equals(Object obj) {
          if (obj instanceof Person) {
               Person p = (Person) obj;
               return (this.id.equals(p.id) && this.name.equals(p.name));
          }

          return super.equals(obj);
     }

     @Override
     public String toString() {
          return "Person [id=" + id + ", name=" + name + "]";
     }

     public String getId() {
          return id;
     }

     public String getName() {
          return name;
     }

}

class Student extends Person {

     public Student(String id, String name) {
          super(id, name);
     }

}

class HighStudent extends Student {

     public HighStudent(String id, String name) {
          super(id, name);
     }

}

class Worker extends Person {

     public Worker(String id, String name) {
          super(id, name);
     }

}
