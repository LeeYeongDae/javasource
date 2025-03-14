package api.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
     public static void main(String[] args) {
          List<Integer> list = new ArrayList<>();
          Set<Integer> set = new HashSet<>();
          for (int i = 0; set.size() < 6; i++) {

               int lotto = (int) (Math.random() * 45) + 1;
               // list.add(lotto);
               set.add(lotto);
          }
          System.out.println(set);
     }
}
