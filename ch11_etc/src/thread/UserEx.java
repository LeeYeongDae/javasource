package thread;

public class UserEx {
     public static void main(String[] args) {
          Calc calc = new Calc();
          Thread t1 = new Thread(new User1(calc));
          t1.start();
          Thread t2 = new Thread(new User2(calc));
          System.out.println(t2.getName());
          t2.start();
     }
}
