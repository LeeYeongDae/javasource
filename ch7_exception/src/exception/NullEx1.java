package exception;

public class NullEx1 {
     public static void main(String[] args) {
          String str = null;

          Account accounts[] = new Account[5];
          // System.out.println(str.length());
          for (Account account : accounts) {
               if (account != null)
                    System.out.println(account.getAno());
          }

          try {
          } catch (NullPointerException e) {
               // e.printStackTrace();
               System.out.println(e.getMessage());
          }
     }
}
