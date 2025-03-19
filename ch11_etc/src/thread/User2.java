package thread;

public class User2 extends Thread {
     private Calc calc;

     public User2(Calc calc) {
          setName("User2");
          this.calc = calc;
     }

     @Override
     public void run() {
          calc.setMemory(10);
     }
}
