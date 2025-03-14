package api.util;

import api.object.Person;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx2 {
     public static void main(String[] args) {
          Map<Integer, Person> people = new HashMap<>();
          people.put(1, new Person("s123", "김씨"));
          people.put(2, new Person("s133", "이씨"));
          people.put(3, new Person("s153", "천씨"));
          people.put(4, new Person("s163", "한씨"));
          people.put(5, new Person("s113", "윤씨"));

          Set<Integer> set = people.keySet();
          Iterator<Integer> it = set.iterator();
          while (it.hasNext()) {
               int key = it.next();
               Person value = people.get(key);
               System.out.println(key + " : " + value.getId() + "\t " + value.getName());
          }
     }
}
