package oop;

public class GoodsStock {

     String code;
     int stockNum;

     public GoodsStock() {
     }

     public GoodsStock(String code, int stockNum) {
          this.code = code;
          this.stockNum = stockNum;
     }

     void incStock() {
          stockNum++;
     }

     void incStock(int x) {
          stockNum += x;
     }

     void decStock() {
          stockNum--;
     }

     void decStock(int x) {
          stockNum -= x;
     }

     @Override
     public String toString() {
          return "GoodsStock [code=" + code + ", stockNum=" + stockNum + "]";
     }

}
