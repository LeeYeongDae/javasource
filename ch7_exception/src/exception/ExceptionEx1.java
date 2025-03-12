package exception;

public class ExceptionEx1 {
     public static void main(String[] args) {
          int num = 100;
          int res = 0;

          try {
               for (int i = 0; i < 10; i++) {
                    res = num / (int) (Math.random() * 10);
                    System.out.println(res);
               }

          } catch (ArithmeticException e) {
               System.out.println("0으로는 못 나눠요");
          } catch (Exception e) {
               System.out.println("오류 발생");
          }
     }
}
