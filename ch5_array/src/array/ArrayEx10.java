package array;

//배열 : 같은 자료형의 변수들을 하나로 묶는 개념

public class ArrayEx10 {
     public static void main(String[] args) {
          int[] ball = new int[45];

          for (int i = 0; i < ball.length; i++)
               ball[i] = i + 1;

          for (int i = 0; i < 6; i++) {
               int ran = (int) (Math.random() * 45);
               int tmp = ball[i];
               ball[i] = ball[ran];
               ball[ran] = tmp;
          }
          for (int i = 0; i < 6; i++) {
               System.out.print(ball[i] + " ");
          }
     }
}