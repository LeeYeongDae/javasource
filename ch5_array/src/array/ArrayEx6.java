package array;

//배열 : 같은 자료형의 변수들을 하나로 묶는 개념

import java.util.Arrays;

//배열 크기는 변동이 불가능

public class ArrayEx6 {
     public static void main(String[] args) {
          int[] arr = { 78, 99, 52, 35, 14 };

          // 배열에 값 추가 방법
          int[] tmp = new int[10]; // 새 배열 공간 생성

          for (int i = 0; i < arr.length; i++) // 반복문을 통한 배열값 복사
          {
               tmp[i] = arr[i];
          }
          System.out.println(Arrays.toString(tmp)); // [78, 99, 52, 35, 14, 0, 0, 0, 0, 0]

          int[] tmp2 = new int[10]; // 새 배열 공간 생성
          System.arraycopy(arr, 0, tmp2, 1, arr.length);
          System.out.println(Arrays.toString(tmp2)); // [0, 78, 99, 52, 35, 14, 0, 0, 0, 0]
     }
}