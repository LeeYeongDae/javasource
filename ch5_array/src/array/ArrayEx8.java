package array;

//배열 : 같은 자료형의 변수들을 하나로 묶는 개념
//배열 크기는 변동이 불가능

public class ArrayEx8 {
     public static void main(String[] args) {
          int[] score = { 78, 99, 52, 35, 66, 96, 100 };
          int max = score[0], min = score[0];
          // 배열 내 최대 최소 구하기
          for (int idx = 0; idx < score.length; idx++) {
               if (max < score[idx])
                    max = score[idx];
               else if (min >= score[idx])
                    min = score[idx];
          }
          System.out.println("최대값 : " + max + ", 최소값 : " + min);

     }
}