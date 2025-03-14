package api.util;

import java.util.Arrays;

public class ArraysEx2 {
     public static void main(String[] args) {
          Integer arr[] = { 1, 2, 3, 5, 7 };
          Integer arr2[] = { 1, 2, 3, 5, 8 };
          // System.out.println(arr);
          Arrays.sort(arr);
          System.out.println(Arrays.binarySearch(arr, 3));

          System.out.println(Arrays.equals(arr, arr2));

          // Character[] characters = { 'a', 'o', 'd', 'n' };
          // Arrays.sort(characters, Comparator.naturalOrder());
          // System.out.println(Arrays.toString(characters));
     }
}
