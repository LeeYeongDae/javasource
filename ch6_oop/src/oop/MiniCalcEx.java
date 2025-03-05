package oop;

public class MiniCalcEx {

     public static void main(String[] args) {
          MiniCalc.print();
          System.out.println(MiniCalc.k);

          MiniCalc mc = new MiniCalc();
          mc.execute();
          mc.a = 7;
     }
}
