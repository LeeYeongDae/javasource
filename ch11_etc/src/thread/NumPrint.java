package thread;

public class NumPrint extends Thread {

     public NumPrint() {
          setName("NumPrint");
     }

     @Override
     public void run() {
          // 소문자 출력
          for (int i = 0; i <= 100; i++) {
               System.out.print(i + " ");
          }
     }
}
