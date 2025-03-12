package api.string;

import java.util.Arrays;

public class StringEx2 {
     public static void main(String[] args) {
          String str2 = "Hi";
          char ch[] = new char[str2.length()];

          for (int i = 0; i < str2.length(); i++) {
               System.out.print(str2.charAt(i));
               ch[i] = str2.charAt(i);
          }
          System.out.println();
          System.out.println(Arrays.toString(ch));

          ch = str2.toCharArray();
          System.out.println(str2.indexOf("H"));

          String sub = "Java의 정석";
          if (sub.indexOf("Java") >= 0) {
               System.out.println("이게 자바랑 관련이 있네");
          } else
               System.out.println("이게 자바랑 관련이 없네");

          if (sub.contains("Java")) {
               System.out.println("이게 자바랑 관련이 있네");
          } else
               System.out.println("이게 자바랑 관련이 없네");

          System.out.println(sub.indexOf("정", 4));
          System.out.println(sub.lastIndexOf("정"));
          String str = "하이하";
          System.out.println(str.indexOf("하"));
          System.out.println(str.lastIndexOf("하"));
     }
}
