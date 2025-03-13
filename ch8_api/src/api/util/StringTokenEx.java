package api.util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenEx {
     public static void main(String[] args) {
          String str = "This is the America's ass";
          StringTokenizer st = new StringTokenizer(str);

          System.out.println(Arrays.toString(str.split(" ")));
          while (st.hasMoreTokens()) {
               System.out.println(st.nextToken());
          }
          System.out.println();

          String str2 = "This/is the/America's ass";
          st = new StringTokenizer(str2, "/");
          while (st.hasMoreTokens()) {
               System.out.println(st.nextToken());
          }

          String expression = "x=100*(200+300)/2";
          st = new StringTokenizer(expression, "+-*/=()", true);
          while (st.hasMoreTokens()) {
               System.out.print(st.nextToken() + "\t");
          }

          String sc = "1,ㅋ,100,100,100|2,ㅋㅋ,99,99,96|3,ㅋㅋㅋ,77,88,97";
          st = new StringTokenizer(sc, "|");
          while (st.hasMoreTokens()) {

               StringTokenizer st2 = new StringTokenizer(st.nextToken(), ",");
               while (st2.hasMoreTokens())
                    System.out.println(st2.nextToken());
          }
     }
}
