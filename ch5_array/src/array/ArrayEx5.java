package array;

import java.util.Arrays;

//배열 : 같은 자료형의 변수들을 하나로 묶는 개념
//배열 크기는 변동이 불가능

public class ArrayEx5 {
     public static void main(String[] args) {
          // 길이 5이고 값이 정해진 문자배열
          char[] chArr = { 'a', 'b', 'c', 'd', 'e' };

          // 배열 크기
          System.out.println(chArr.length);

          // 배열 요소 확인
          System.out.println(chArr);
          System.out.println(Arrays.toString(chArr));

          // 배열 요소 변경
          chArr[2] = 'f';
          System.out.println(Arrays.toString(chArr));

          // double 배열 선언, 생성(5)
          double[] dbArr = new double[5];
          for (int i = 0; i < dbArr.length; i++) {
               double score = ((int) (Math.random() * 1000) + 1) / 100.0;
               dbArr[i] = score;
          }

          System.out.println(dbArr);
          System.out.println(Arrays.toString(dbArr));
     }
}