package lambda;

public class LambdaEx {
     public static void main(String[] args) {

          // Lambda2 obj = new Lambda2() {
          // @Override
          // public void method() {

          // }
          // };
          Lambda2 obj = () -> System.out.println("test");

          Lambda3 obj2 = (a, b) -> a > b ? a : b;
          System.out.println(obj2.max(4, 6));
     }
}
