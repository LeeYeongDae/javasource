package array;

import java.util.Arrays;
import java.util.Scanner;

//배열 : 같은 자료형의 변수들을 하나로 묶는 개념
//배열 크기는 변동이 불가능

public class ArrayEx4 {
     public static void main(String[] args) {
          // 길이 5인 정수배열
          Scanner sc = new Scanner(System.in);
          int[] scores;

          System.out.print("학생 수 >>");
          int num = sc.nextInt();
          scores = new int[num];

          for (int i = 0; i < scores.length; i++) {
               System.out.print(i + 1 + "번째 학생의 점수 입력 >> ");
               scores[i] = sc.nextInt();
          }

          System.out.println(Arrays.toString(scores));
          int sum = 0;

          for (int i = 0; i < scores.length; i++)
               sum += scores[i];
          System.out.println("학생들의 총합 점수 : " + sum + ", 학생들의 평균 점수 : " + (float) sum / scores.length);
     }
}