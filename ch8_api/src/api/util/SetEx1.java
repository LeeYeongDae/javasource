package api.util;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
     public static void main(String[] args) {
          Set<String> set1 = new HashSet<>();

          set1.add("A");
          set1.add("B");
          set1.add("C");
          set1.add("D");
          set1.add("E");
          set1.add("F");
          set1.add("E");
          set1.add("E");
          set1.add("E");

          System.out.println(set1);

          String str1 = "E";
          String str2 = "E";
          String str3 = new String("E");
          System.out.println(str1.hashCode());
          System.out.println(str2.hashCode());
          System.out.println(str3.hashCode());
     }
}
