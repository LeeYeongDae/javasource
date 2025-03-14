package api.util;

import api.object.Person;
import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
     public static void main(String[] args) {
          Set<Person> people = new HashSet<>();
          people.add(new Person("s123", "김씨"));
          people.add(new Person("s133", "이씨"));
          people.add(new Person("s153", "천씨"));
          people.add(new Person("s163", "한씨"));
          people.add(new Person("s113", "윤씨"));

          System.out.println("아이디\t 이름");
          System.out.println("---------------");
          for (Person person : people) {
               System.out.println(person.getId() + "\t " + person.getName());
          }

     }
}
