package api.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx5 {
     public static void main(String[] args) {
          ArrayList<String> arrlist = new ArrayList<>(200000);
          LinkedList<String> linlist = new LinkedList<>();

          System.out.println("=== 순차 추가 ===");
          System.out.println("ArrayList : " + add1(arrlist));
          System.out.println("LinkedList : " + add1(linlist));
          System.out.println("=== 중간 추가 ===");
          System.out.println("ArrayList : " + add2(arrlist));
          System.out.println("LinkedList : " + add2(linlist));
          System.out.println("=== 중간 삭제 ===");
          System.out.println("ArrayList : " + remove2(arrlist));
          System.out.println("LinkedList : " + remove2(linlist));
          System.out.println("=== 순차 삭제 ===");
          System.out.println("ArrayList : " + remove1(arrlist));
          System.out.println("LinkedList : " + remove1(linlist));
     }

     public static long add1(List<String> list) {
          long start = System.currentTimeMillis();
          for (int i = 0; i < 100000; i++) {
               list.add(i + "");
          }
          long end = System.currentTimeMillis();
          return end - start;
     }

     public static long add2(List<String> list) {
          long start = System.currentTimeMillis();
          for (int i = 0; i < 100000; i++) {
               list.add(500, "X");
          }
          long end = System.currentTimeMillis();
          return end - start;
     }

     public static long remove1(List<String> list) {
          long start = System.currentTimeMillis();
          for (int i = list.size() - 1; i >= 0; i--) {
               list.remove(i);
          }
          long end = System.currentTimeMillis();
          return end - start;
     }

     public static long remove2(List<String> list) {
          long start = System.currentTimeMillis();
          for (int i = 0; i < 100000; i++) {
               list.remove(i);
          }
          long end = System.currentTimeMillis();
          return end - start;
     }
}
