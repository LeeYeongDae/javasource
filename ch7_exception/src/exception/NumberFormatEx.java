package exception;

import java.util.Scanner;

public class NumberFormatEx {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("입력 : ");
          try {
               int num = Integer.parseInt(sc.nextLine());
               System.out.println(num);
          } catch (Exception e) {
               e.printStackTrace();
          } finally {
               System.out.println("무조건 실행");
          }
          sc.close();
     }
}
