package array;

//배열 : 같은 자료형의 변수들을 하나로 묶는 개념

import java.util.Arrays;

//배열 크기는 변동이 불가능

public class ArrayEx7 {
     public static void main(String[] args) {

          char[] alpha = { 'A', 'B', 'C', 'D' };
          char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

          char[] tmp = new char[alpha.length + num.length]; // 새 배열 공간 생성
          System.arraycopy(alpha, 0, tmp, 0, alpha.length);
          System.arraycopy(num, 0, tmp, alpha.length, num.length);
          System.out.println(Arrays.toString(tmp)); // [A, B, C, D, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

     }
}