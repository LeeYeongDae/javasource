package exception;

public class LoginEx {
     public static void main(String[] args) {
          try {
               login("white", "1234");
          } catch (Exception e) {
               e.printStackTrace();
          }

     }

     static void login(String id, String pwd) throws Exception {
          if (!id.equals("blue")) {
               throw new NotExistIdException("아이디가 존재 안함");
          }
          if (!pwd.equals("1234")) {
               throw new NotExistPwdException("비번이 틀림");
          }
     }
}
