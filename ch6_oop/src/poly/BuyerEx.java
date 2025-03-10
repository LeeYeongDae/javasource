package poly;

public class BuyerEx {
     public static void main(String[] args) {
          Buyer buyer = new Buyer();

          buyer.buy(new Tv2());
          buyer.buy(new Computer());

          System.out.println("남은 돈은 " + buyer.money + "달러입니다요");
          System.out.println("보너스는 " + buyer.bonusPoint + "점입니다만");
          buyer.buyList();
          /*
           * Computer computer[] = new Computer[3];
           * Tv2 tv[] = new Tv2[3];
           * Audio audio[] = new Audio[3];
           * 
           * for (int i = 0; i < 3; i++) {
           * computer[i] = new Computer();
           * tv[i] = new Tv2();
           * audio[i] = new Audio();
           * }
           * 
           * buyer.buy(audio);
           * 
           * System.out.println("남은 돈은 " + buyer.money + "달러입니다요");
           * System.out.println("보너스는 " + buyer.bonusPoint + "점입니다만");
           */
     }
}
