package array;

import java.util.Arrays;

//배열 : 같은 자료형의 변수들을 하나로 묶는 개념
//배열 크기는 변동이 불가능

public class ArrayEx2 {
     public static void main(String[] args) {
          // 길이 10인 정수배열
          int[] arr = new int[10];

          for (int i = 0; i < arr.length; i++) {

               arr[i] = i * 10 + 10;
          }
          for (int i = 0; i < arr.length; i++) {
               System.out.println(arr[i] + "\t");

          }

          for (int i : arr) {
               System.out.println(i + "\t");
          }

          System.out.println(Arrays.toString(arr));
     }
}
