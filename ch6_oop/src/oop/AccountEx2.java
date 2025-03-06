package oop;

import java.util.Scanner;

public class AccountEx2 {
     // 클래스 구성요소(멤버변수)
     // 클래스의 기능(멤버 메서드)
     // 메인 실행 방식 -> static으로 저장 이유는 실행 전에 생성되는 값이기에

     static Scanner sc = new Scanner(System.in);
     private static Account account[] = new Account[10];
     static int accCount = 0, selnum = 0;

     public static void main(String[] args) {

          boolean run = true;

          while (run) {

               System.out.println("=========================================================================");
               System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 계좌 찾기 | 6. 종료");
               System.out.println("=========================================================================");

               System.out.print("메뉴 번호 입력 >> ");
               int menu = Integer.parseInt(sc.nextLine());

               switch (menu) {
                    case 1:
                         account[accCount] = createAccount();
                         selnum = accCount;
                         accCount++;
                         break;
                    case 2:
                         accountList();
                         break;
                    case 3:
                         deposit(account[selnum]);
                         break;
                    case 4:
                         withdraw(account[selnum]);
                         break;
                    case 5:
                         findAccount();
                         break;
                    case 6:
                         System.out.println("메뉴를 종료합니다.");
                         run = false;
                         break;
                    default:
                         break;
               }
               System.out.println();

               // Account account = new Account("352-11", "유명한", 100000);

               // account.deposit(200000);
               // account.print();

               // account.withdraw(150000);
               // account.print();
          }
     }

     private static Account createAccount() {
          System.out.print("계좌번호 : ");
          String ano = sc.nextLine();
          System.out.printf("계좌주 : ");
          String owner = sc.nextLine();
          System.out.print("금액 : ");
          int balance = Integer.parseInt(sc.nextLine());

          return new Account(ano, owner, balance);
     }

     private static void accountList() {
          if (accCount == 0) {
               System.out.println("만들어진 계좌가 없습니다.");
               return;
          }
          System.out.println("==========================================================");
          for (int i = 0; i < accCount; i++) {
               System.out.println(i + 1 + ". " + account[i]);
          }
          System.out.println("==========================================================");
          System.out.print("사용할 계좌를 선택해주세요 >> ");
          int select = Integer.parseInt(sc.nextLine());
          if (select > accCount) {
               System.out.println("해당 번호의 계좌가 없습니다.");
          } else
               selnum = select - 1;
     }

     private static void deposit(Account acc) {
          System.out.print("예금할 금액을 작성해주세요. >> ");
          acc.deposit(Integer.parseInt(sc.nextLine()));
          System.out.println();
          System.out.println("현재 잔고액 : " + acc.getBalance());
     }

     private static void withdraw(Account acc) {
          System.out.print("출금할 금액을 작성해주세요. >> ");
          acc.withdraw(Integer.parseInt(sc.nextLine()));
          System.out.println();
          System.out.println("현재 잔고액 : " + acc.getBalance());
     }

     private static Account findAccount() {
          System.out.print("찾을 계좌의 계좌 번호를 입력해주세요 >> ");
          String ano = sc.nextLine();
          for (int i = 0; i < accCount; i++) {
               if (account[i].getAno().equals(ano)) {
                    selnum = i;
                    return account[i];
               }
          }
          return null;
     }
}
