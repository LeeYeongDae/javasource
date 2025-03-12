package shop;

import java.util.Scanner;

public class MyShop implements IShop {

     private String title;
     private User[] users = new User[5];
     private Product[] products = new Product[10];
     private String seluser;
     private Product[] carts = new Product[10];
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
          seluser = sc.nextLine();
          if (seluser.equalsIgnoreCase("x")) {
               System.out.println("가게를 닫습니다.");
          } else if (users[Integer.parseInt(seluser)] != null) {
               System.out.println(users[Integer.parseInt(seluser)].getName() + "님 안녕하세요.");
               productList();
          }
     }

     public void productList() {
          int empty = 0;
          boolean run = true;
          while (run) {
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
               System.out.println("[H] 메인화면");
               System.out.println("[C] 체크아웃");
               System.out.println("===============================");
               System.out.print("선택 : ");
               String selprod = sc.nextLine();
               if (selprod.equalsIgnoreCase("h")) {
                    System.out.println("메인화면으로 돌아갑니다.");
                    run = false;
                    start();
               } else if (selprod.equalsIgnoreCase("c")) {
                    System.out.println("체크아웃하셨습니다.");
                    run = false;
                    checkout();
               } else if (products[Integer.parseInt(selprod)] != null) {
                    System.out.println(products[Integer.parseInt(selprod)].getPname() + "을 선택하셨습니다.");
                    for (int i = 0; i < carts.length; i++) {
                         if (carts[i] == null) {
                              empty = i;
                              break;
                         }
                    }
                    carts[empty] = products[Integer.parseInt(selprod)];
               }
          }

     }

     public void checkout() {
          int sum = 0;
          System.out.println(this.title + " : " + users[Integer.parseInt(seluser)].getName() + " - 체크아웃");
          System.out.println("===============================");
          for (int i = 0; i < carts.length; i++) {
               if (carts[i] != null) {
                    System.out.println("[" + i + "] " + carts[i].getPname() + "     " + carts[i].getPrice());
               }
          }
          System.out.println("[B] 이전화면");
          System.out.println("[Q] 종료");
          System.out.println("===============================");
          System.out.print("선택 : ");
          String select = sc.nextLine();
          if (select.equalsIgnoreCase("b")) {
               System.out.println("이전화면으로 돌아갑니다.");
               productList();
          } else if (select.equalsIgnoreCase("q")) {
               System.out.println("종료합니다.");
               System.exit(sum);
          }
     }
}
