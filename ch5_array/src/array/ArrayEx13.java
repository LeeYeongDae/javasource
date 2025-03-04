package array;

//배열 : 같은 자료형의 변수들을 하나로 묶는 개념

import java.util.Arrays;

public class ArrayEx13 {
     public static void main(String[] args) {
          // 2차원 배열
          // 타입[][] 배열명 = new 타입[n][n];
          {
               int[][] arr1 = new int[2][2];

               for (int i = 0; i < arr1.length; i++) {
                    // System.out.println(Arrays.toString(arr1[i]));
               }

               arr1[0][0] = 69;
               arr1[0][1] = 74;
               arr1[1][0] = 78;
               arr1[1][1] = 92;
               for (int i = 0; i < arr1.length; i++) {
                    // System.out.println(Arrays.toString(arr1[i]));
               }
               // for
               for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr1[i].length; j++) {
                         // System.out.print(arr1[i][j] + "\t");
                    }
               }
               // foreach
               for (int[] tmp : arr1) {
                    for (int is2 : tmp) {
                         // System.out.print(is2 + "\t");
                    }
               }
          }
          int arr2[][] = {
                    { 100, 100, 100 },
                    { 20, 30, 40 }
          };
          for (int i = 0; i < arr2.length; i++) {
               System.out.println(Arrays.toString(arr2[i]));
          }
          int sum = 0;
          for (int[] tmp : arr2) {
               for (int is2 : tmp) {
                    sum += is2;
               }
          }
          System.out.println(sum);
     }
}