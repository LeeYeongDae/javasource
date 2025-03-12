package exception;

public class ArrayEx {
     public static void main(String[] args) {
          int arr[] = new int[2];
          try {

               System.out.println(arr[3]);
          } catch (ArrayIndexOutOfBoundsException e) {
               e.printStackTrace();
          }
     }
}
