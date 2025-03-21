package array;

import java.util.Scanner;

//배열 : 같은 자료형의 변수들을 하나로 묶는 개념

public class ArrayEx16 {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               String[][] words = {
                         { "chair", "의자" },
                         { "computer", "컴퓨터" },
                         { "integer", "정수" }
               };

               int[] ran = new int[3];
               ran[0] = (int) (Math.random() * 3);
               do {
                    ran[1] = (int) (Math.random() * 3);
               } while (ran[1] == ran[0]);
               do {
                    ran[2] = (int) (Math.random() * 3);
               } while (ran[2] == ran[0] || ran[2] == ran[1]);

               for (int i = 0; i < ran.length; i++) {
                    System.out.printf("Q%d. %s 의 뜻은?\n", i + 1, words[ran[i]][0]);
                    String A1 = sc.nextLine();
                    if (words[ran[i]][1].equals(A1))
                         System.out.println("정답입니다.");
                    else
                         System.out.printf("틀렸습니다. 정답은 %s입니다.\n", words[ran[i]][1]);
               }
          }
     }
}