package api.util;

import java.util.LinkedList;
import java.util.List;

public class ListEx4 {
     public static void main(String[] args) {
          List<String> list = new LinkedList<>();

          list.add("대지");
          list.add("바다");
          list.add("하늘");
          list.add("황혼");
          list.add("신비");
          list.add("비밀");
          list.add("전설");

          for (String string : list) {
               System.out.println(string);
          }
          list.remove(0);
          list.remove(0);
          list.remove("하늘");
          System.out.println(list);
          System.out.println(list.indexOf("신비"));
     }
}
