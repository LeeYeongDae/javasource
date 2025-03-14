package api.util;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx6 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          ArrayList<Integer> arrlist = new ArrayList<>(9);

          System.out.print("키 입력: ");
          String input = sc.nextLine();
          String[] splinput = input.split(" ");

          for (String string : splinput) {
               arrlist.add(Integer.valueOf(string));
          }
          int max = 0;
          int index = 0;
          for (int i = 1; i < arrlist.size(); i++) {
               int distance = arrlist.get(i) - arrlist.get(i - 1);
               if (distance >= max) {
                    max = distance;
                    index = i + 2015;
               }
          }
          System.out.println("ArrayList : " + arrlist);
          System.out.println("Max Grow : " + index + " Diff : " + max);
     }
}
