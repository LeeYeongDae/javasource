package exception;

public class CheckedEx1 {
     public static void main(String[] args) {
          try {
               Class.forName("");
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
     }
}
