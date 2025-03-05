package oop;

//static 메서드 : 클래스 메서드

public class PrimitiveParamEx {

     public static void main(String[] args) {
          // main 메서드
          Data d = new Data();
          System.out.println(d.x);
          change2(d);
          System.out.println(d.x);

          // PrimitiveParamEx obj = new PrimitiveParamEx();
          // obj.change();
     }

     static void change(int x) {
          x = 10000;
          System.out.println(x);
     }

     static void change2(Data x) {
          x.x = 10000;
          System.out.println(x.x);
     }

}
