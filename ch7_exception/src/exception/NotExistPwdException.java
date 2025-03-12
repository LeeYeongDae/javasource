package exception;

public class NotExistPwdException extends Exception {

     public NotExistPwdException() {
          super();
     }

     public NotExistPwdException(String message) {
          super(message);
     }

}
