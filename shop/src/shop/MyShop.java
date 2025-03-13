package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop implements IShop {

     private String title;
     private List<User> users = new ArrayList<>(5);
     private List<Product> products = new ArrayList<>(10);
     private String seluser;
     private List<Product> carts = new ArrayList<>(10);
     Scanner sc = new Scanner(System.in);

     @Override
     public void setTitle(String title) {
          this.title = title;
     }

     @Override
     public void genUser(User user) {
          users.add(user);
     }

     @Override
     public void genProduct(Product p) {
          products.add(p);
     }

     @Override
     public void start() {
          System.out.println(this.title + " : 메인화면 - 계정선택");
          System.out.println("===============================");
          for (int i = 0; i < users.size(); i++) {
               if (users.get(i) != null)
                    System.out.println("[" + i + "] " + users.get(i).getName() + "(" + users.get(i).getPayType() + ")");
          }
          System.out.println("[x] 종료");
          System.out.println("===============================");
          System.out.print("선택 : ");
          seluser = sc.nextLine();
          if (seluser.equalsIgnoreCase("x")) {
               System.out.println("가게를 닫습니다.");
          } else if (users.get(Integer.parseInt(seluser)) != null) {
               System.out.println(users.get(Integer.parseInt(seluser)).getName() + "님 안녕하세요.");
               productList();
          }
     }

     public void productList() {
          boolean run = true;
          while (run) {
               System.out.println(this.title + " : 상품목록 - 상품선택");
               System.out.println("===============================");
               for (int i = 0; i < products.size(); i++) {
                    if (products.get(i) != null) {
                         System.out.println("[" + i + "] " + products.get(i).getPname());
                         System.out.println("    가격 : " + products.get(i).getPrice());
                         System.out.print("    ");
                         products.get(i).printExtra();
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
               } else if (products.get(Integer.parseInt(selprod)) != null) {
                    System.out.println(products.get(Integer.parseInt(selprod)).getPname() + "을 선택하셨습니다.");
                    carts.add(products.get(Integer.parseInt(selprod)));
               }
          }

     }

     public void checkout() {
          int sum = 0;
          System.out.println(this.title + " : " + users.get(Integer.parseInt(seluser)).getName() + " - 체크아웃");
          System.out.println("===============================");
          for (int i = 0; i < carts.size(); i++) {
               if (carts.get(i) != null) {
                    System.out.println("[" + i + "] " + carts.get(i).getPname() + "     " + carts.get(i).getPrice());
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
