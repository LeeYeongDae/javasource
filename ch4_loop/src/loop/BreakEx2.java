package loop;

public class BreakEx2 {
     public static void main(String[] args) {
          // break : switch, loop문 중지

          int dice = 0;

          int sum = 0, i = 0;
          while (true) {
               dice = (int) (Math.random() * 6) + 1;
               System.out.println("주사위 눈 : " + dice);
               if (dice == 6)
                    break;
          }
          System.out.println("6이 나왔습니다.");
     }
}
