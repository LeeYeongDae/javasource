package array;

import java.util.Arrays;

//배열 : 같은 자료형의 변수들을 하나로 묶는 개념

public class ArrayEx15 {
     public static void main(String[] args) {
          // 가변배열 : 열의 길이가 변동하는 배열
          int[][] score = new int[3][];

          score[0] = new int[4];
          score[1] = new int[2];
          score[2] = new int[3];

          int[][] score2 = {
                    { 78, 99, 35, 25 },
                    { 12, 24 },
                    { 36, 65, 75 }
          };
          for (int i = 0; i < score2.length; i++) {
               System.out.println(Arrays.toString(score2[i]));
          }
     }
}