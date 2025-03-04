package array;

//배열 : 같은 자료형의 변수들을 하나로 묶는 개념

import java.util.Arrays;

public class ArrayEx11 {
     public static void main(String[] args) {
          int[] score = { 78, 99, 52, 35, 66, 96, 100 };

          // 정렬
          for (int i = 0; i < score.length; i++) {
               for (int j = i; j < score.length; j++) {
                    if (score[i] > score[j]) {
                         int tmp = score[i];
                         score[i] = score[j];
                         score[j] = tmp;
                    }
               }
          }
          // 버블정렬
          for (int i = 0; i < score.length - 1; i++) {
               for (int j = 0; j < score.length - 1 - i; j++) {
                    if (score[j] > score[j + 1]) {
                         int tmp = score[j];
                         score[j] = score[j + 1];
                         score[j + 1] = tmp;
                    }
               }
          }

          System.out.println(Arrays.toString(score));
     }
}