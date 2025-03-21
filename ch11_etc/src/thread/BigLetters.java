package thread;

public class BigLetters {
     public static void main(String[] args) {

          Thread t1 = new Thread(() -> {
               for (char ch = 'a'; ch <= 'z'; ch++) {
                    System.out.print(ch + " ");
               }
          });
          t1.start();

          t1 = new Thread(new SmallLetters());
          t1.start();
          Thread t2 = new Thread(new SmallLetters2());
          System.out.println(t2.getName());
          t2.start();

          Thread t3 = new Thread(new NumPrint());
          System.out.println(t3.getName());
          t3.start();

          Thread main = Thread.currentThread();
          System.out.println(main.getName());

          // 대문자 출력
          for (char ch = 'A'; ch <= 'Z'; ch++) {
               System.out.print(ch + " ");
          }
     }
}
