package loop;

import java.util.Scanner;

public class BreakEx3 {
     public static void main(String[] args) {
          // break : switch, loop문 중지

          boolean run = true;
          Scanner sc = new Scanner(System.in);
          int account = 0;

          while (run) {

               System.out.println("======================================");
               System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
               System.out.println("======================================");

               System.out.print("메뉴 번호 입력 >> ");
               int menu = sc.nextInt();

               switch (menu) {
                    case 1:
                         System.out.print("예금할 금액을 작성해주세요. >> ");
                         account += sc.nextInt();
                         System.out.println();
                         System.out.println("현재 잔고액 : " + account);
                         break;
                    case 2:
                         System.out.print("출금할 금액을 작성해주세요. >> ");
                         int export = sc.nextInt();
                         if (export > account) {
                              System.out.println("출금할 금액이 잔고 금액보다 많습니다.");
                              break;
                         }
                         account -= export;
                         System.out.println();
                         System.out.println("현재 잔고액 : " + account);
                         break;
                    case 3:
                         System.out.println();
                         System.out.println("현재 잔고액 : " + account);
                         break;
                    case 4:
                         System.out.println("메뉴를 종료합니다.");
                         run = false;
                         break;
                    default:
                         break;
               }
               System.out.println();
          }
     }
}
