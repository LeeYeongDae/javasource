package array;

//배열 : 같은 자료형의 변수들을 하나로 묶는 개념

public class ArrayEx14 {
     public static void main(String[] args) {
          // 2차원 배열
          // 타입[][] 배열명 = new 타입[n][n];
          int score[][] = {
                    { 100, 78, 50 },
                    { 60, 37, 80 },
                    { 30, 70, 56 },
                    { 64, 86, 95 },
                    { 100, 100, 100 }
          };
          int[] sums = new int[score[0].length];
          System.out.println("번호  국어  영어  수학  총점   평균");
          System.out.println("====================================");
          for (int i = 0; i < score.length; i++) {
               int sum = 0;
               System.out.printf("%2d    ", i + 1);
               for (int j = 0; j < score[i].length; j++) {
                    System.out.printf("%3d   ", score[i][j]);
                    sum += score[i][j];
               }
               System.out.printf("%3d   %6.2f\n", sum, (float) sum / score[i].length);
          }
          System.out.println("====================================");
          for (int i = 0; i < score.length; i++) {
               sums[0] += score[i][0];
               sums[1] += score[i][1];
               sums[2] += score[i][2];
          }
          System.out.print("총점 : ");
          for (int i = 0; i < sums.length; i++) {
               System.out.printf("%3d   ", sums[i]);
          }
     }
}