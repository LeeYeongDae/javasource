package oop;

public class GoodsStockEx {

     public static void main(String[] args) {
          GoodsStock goodsStock = new GoodsStock("p1013", 50);

          System.out.println(goodsStock);

          goodsStock.decStock(5);
          System.out.println(goodsStock);

          goodsStock.incStock(10);
          System.out.println(goodsStock);
     }

}
