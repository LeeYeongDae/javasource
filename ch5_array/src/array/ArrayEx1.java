package array;

//배열 : 같은 자료형의 변수들을 하나로 묶는 개념
//배열 크기는 변동이 불가능

public class ArrayEx1 {
     public static void main(String[] args) {
          // 학생 100명의 점수를 처리
          // int[] scores = new int[100];
          /*
           * for (int i = 0; i < scores.length; i++) {
           * int score = (int) (Math.random() * 100) + 1;
           * scores[i] = score;
           * System.out.println(scores[i]);
           * }
           */
          int[] scores2 = { 88, 65, 64, 76, 94 };

          System.out.println("3번째 학생의 점수 : " + scores2[2]);
          System.out.println("배열 길이 : " + scores2.length);

          scores2[4] = 98;
          System.out.println("5번째 학생의 점수 : " + scores2[4]);

          // ArrayIndexOutOfBoundsException
          try {
               System.out.println(scores2[5]);
          } catch (Exception e) {
               // if (e.getCause() == ArrayIndexOutOfBoundsException)
               System.out.println("해당 값은 범위 밖의 값입니다.");
          }
     }
}
