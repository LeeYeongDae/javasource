package api.util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx1 {
     public static void main(String[] args) {
          Integer arr[] = { 1, 2, 3, 5, 7 };
          // System.out.println(arr);
          Arrays.sort(arr);
          System.out.println(Arrays.toString(arr));
          Arrays.sort(arr, Comparator.reverseOrder());
          System.out.println(Arrays.toString(arr));

          Character[] characters = { 'a', 'o', 'd', 'n' };
          Arrays.sort(characters, Comparator.naturalOrder());
          System.out.println(Arrays.toString(characters));
     }
}
