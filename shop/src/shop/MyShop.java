package shop;

import java.util.Scanner;

public class MyShop implements IShop {

     private String title;
     private User[] users = new User[5];
     private Product[] products = new Product[10];
     Scanner sc = new Scanner(System.in);

     @Override
     public void setTitle(String title) {
          this.title = title;
     }

     @Override
     public void genUser(User user) {
          int empty = 0;
          for (int i = 0; i < users.length; i++) {
               if (users[i] == null) {
                    empty = i;
                    break;
               }
          }
          users[empty] = user;
     }

     @Override
     public void genProduct(Product p) {
          int empty = 0;
          for (int i = 0; i < products.length; i++) {
               if (products[i] == null) {
                    empty = i;
                    break;
               }
          }
          products[empty] = p;
     }

     @Override
     public void start() {
          System.out.println(this.title + " : 메인화면 - 계정선택");
          System.out.println("===============================");
          for (int i = 0; i < users.length; i++) {
               if (users[i] != null)
                    System.out.println("[" + i + "] " + users[i].getName() + "(" + users[i].getPayType() + ")");
          }
          System.out.println("[x] 종료");
          System.out.println("===============================");
          System.out.print("선택 : ");
          String select = sc.nextLine();
          char seluser = select.charAt(0);
          if (seluser == 'x' || seluser == 'X') {
               System.out.println("가게를 닫습니다.");
          } else if ('0' <= seluser && seluser <= '9') {
               System.out.println(users[(int) seluser - 48].getName() + "님 안녕하세요.");
               productList();
          }
     }

     public void productList() {
          System.out.println(this.title + " : 상품목록 - 상품선택");
          System.out.println("===============================");
          for (int i = 0; i < products.length; i++) {
               if (products[i] != null) {
                    System.out.println("[" + i + "] " + products[i].getPname());
                    System.out.println("    가격 : " + products[i].getPrice());
                    System.out.print("    ");
                    products[i].printExtra();
               }
          }
          System.out.println("[h] 메인화면");
          System.out.println("[c] 체크아웃");
          System.out.println("===============================");
          System.out.print("선택 : ");
          String select = sc.nextLine();
          char selprod = select.charAt(0);
          if (selprod == 'h' || selprod == 'H') {
               System.out.println("메인화면으로 돌아갑니다.");
          } else if (selprod == 'c' || selprod == 'C') {
               System.out.println("체크아웃하셨습니다.");
          } else if ('0' <= selprod && selprod <= '9') {
               System.out.println(products[0].getPname() + "을 선택하셨습니다.");
          }
     }

}
