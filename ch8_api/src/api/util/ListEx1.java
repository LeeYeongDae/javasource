package api.util;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
     public static void main(String[] args) {
          List<Integer> list = new ArrayList<>();

          list.add(1);
          list.add(154);
          list.add(12);
          list.add(12);
          list.add(112);
          list.add(15);
          list.add(12);
          list.add(4, 55);

          System.out.println(list);

          System.out.println(list.get(5));
          System.out.println(list.remove(3));
          System.out.println(list.remove(Integer.valueOf(12)));
          System.out.println(list);
     }
}
