package array;

//배열 : 같은 자료형의 변수들을 하나로 묶는 개념

import java.util.Arrays;

//배열 크기는 변동이 불가능

public class ArrayEx9 {
     public static void main(String[] args) {
          int[] numArr = new int[10];

          // 0~9로 초기화
          for (int i = 0; i < numArr.length; i++) {
               numArr[i] = i;
          }
          System.out.println(Arrays.toString(numArr)); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

          // int a = 10, b = 15;
          // int tmp;
          // tmp = a;
          // a = b;
          // b = tmp;
          for (int i = 0; i < numArr.length; i++) {
               int tmp = numArr[i], ran = (int) (Math.random() * 10);
               numArr[i] = numArr[ran];
               numArr[ran] = tmp;
          }
          System.out.println(Arrays.toString(numArr));

          for (int i = 0; i < 100; i++) {
               int ran = (int) (Math.random() * 10);
               int tmp = numArr[0];
               numArr[0] = numArr[ran];
               numArr[ran] = tmp;
          }
          System.out.println(Arrays.toString(numArr));
     }
}