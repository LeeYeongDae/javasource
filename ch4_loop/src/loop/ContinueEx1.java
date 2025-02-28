package loop;

public class ContinueEx1 {
     public static void main(String[] args) {
          // continue : loop문 중간에 해당 구문 skip

          // for (int i = 0; i <= 10; i++) {
          // if (i % 3 == 0)
          // continue; // 아래 구문은 작동X
          // System.out.println(i);
          // }

          for (int i = 0; i <= 10; i++) {
               if (i % 2 == 1)
                    continue; // 아래 구문은 작동X
               System.out.println(i);
          }
     }
}
