package poly;

public class Buyer {
     int money = 10000;
     int bonusPoint = 0;

     Product[] products = new Product[10];

     void buy(Product p) {
          if (money < p.price) {
               System.out.println("넌 거지야ㅋ");
               return;
          }
          this.money -= p.price;
          this.bonusPoint += p.bonusPoint;

          for (int i = 0; i < products.length; i++) {
               if (products[i] == null) {
                    products[i] = p;
                    break;
               }
          }
          System.out.println(p + "를 사네ㅋ");
     }

     void buy(Product[] p) {
          int prices = 0;
          for (int i = 0; i < p.length; i++) {
               prices += p[i].price;
          }
          for (int i = 0; i < p.length; i++) {
               if (money < prices) {
                    System.out.println("넌 거지야ㅋ");
                    return;
               }
               this.money -= p[i].price;
               this.bonusPoint += p[i].bonusPoint;
          }
          System.out.println(p[0] + "를 다 사네ㅋ");
     }

     void buyList() {
          int sum = 0;
          String itemList = "";

          for (int i = 0; i < products.length; i++) {
               if (products[i] != null) {
                    sum += products[i].price;
                    itemList += products[i] + " ";
               }
          }
          System.out.println("구매 금액 " + sum);
          System.out.println(itemList + "를 다 샀네ㅋㅋㅋㅋㅋㅋㅋㅋ");

     }
}
