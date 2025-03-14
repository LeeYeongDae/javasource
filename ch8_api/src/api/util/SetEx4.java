package api.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
     public static void main(String[] args) {
          Set<Integer> set = new TreeSet<>();
          List<Integer> list = new ArrayList<>();
          for (int i = 0; set.size() < 6; i++) {

               int lotto = (int) (Math.random() * 45) + 1;
               // list.add(lotto);
               set.add(lotto);
          }
          System.out.println(set);

          list.sort(Comparator.reverseOrder());
          System.out.println(list);
          list.sort(Comparator.naturalOrder());
          System.out.println(list);
     }
}
