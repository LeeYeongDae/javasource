package array;

//배열 : 같은 자료형의 변수들을 하나로 묶는 개념

import java.util.Arrays;

public class ArrayEx12 {
     public static void main(String[] args) {
          String[] names = { "Kim", "Park", "Lee" };

          String[] strs = new String[2];
          System.out.println(Arrays.toString(strs)); // [null, null]
          int[] ints = new int[2];
          System.out.println(Arrays.toString(ints)); // [0, 0]
          boolean[] bools = new boolean[2];
          System.out.println(Arrays.toString(bools)); // [false, false]

     }
}