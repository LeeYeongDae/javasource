package api.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx {
     public static void main(String[] args) {
          List<String> list = Arrays.asList("A", "B", "C", "D");
          Iterator<String> it = list.iterator();
          while (it.hasNext()) {
               System.out.println(it.next());
          }

          Set<String> set = new HashSet<>(list);
          it = set.iterator();
          while (it.hasNext()) {
               System.out.println(it.next());
          }
     }
}
