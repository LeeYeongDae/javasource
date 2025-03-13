package api.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {
     public static void main(String[] args) {
          List<String> list = new ArrayList<>();

          list.add("대지");
          list.add("바다");
          list.add("하늘");
          list.add("신비");
          list.add("황혼");
          list.add("비밀");

          System.out.println(list);
          list.remove(1);
          list.remove("하늘");
          System.out.println(list);

          String strArr[] = { "한식", "양식", "중식", "일식", "매운 거", "안 매운 거", "밥", "빵", "면", "떡", "뜨거운 거", "차가운 거" };
          List<String> list2 = Arrays.asList(strArr);
          System.out.println(list2);

          System.out.println(list2.get(4));
          // System.out.println(list2.remove(4)); 배열에서 와서 삭제가 안됨
          System.out.println(list2);
          list2 = new ArrayList<String>(Arrays.asList(strArr));
          System.out.println(list2.remove(4));
          System.out.println(list2);

          Object[] arrs = list2.toArray();
          System.out.println(Arrays.toString(arrs));
     }
}
