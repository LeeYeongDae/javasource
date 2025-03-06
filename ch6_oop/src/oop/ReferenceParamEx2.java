package oop;

//static 메서드 : 클래스 메서드

public class ReferenceParamEx2 {

     public static void main(String[] args) {
          int[] arr = { 3, 11, 6, 21, 10 };
          // System.out.println(arr[0]);
          printarr(arr); // 주소복사
          // System.out.println(arr[0]);
          sortarr(arr);
          System.out.println(sumarr(arr));
     }

     static void printarr(int[] arr) {
          System.out.print("[");
          for (int idx = 0; idx < arr.length; idx++) {
               System.out.print(arr[idx]);
               if (idx + 1 != arr.length)
                    System.out.print(", ");

          }
          System.out.println("]");
     }

     static void sortarr(int[] x) {
          for (int idx = 0; idx < x.length - 1; idx++) {
               for (int i = 0; i < x.length - 1; i++) {
                    if (x[i] > x[i + 1]) {
                         int tmp = x[i];
                         x[i] = x[i + 1];
                         x[i + 1] = tmp;
                    }
               }
          }
          printarr(x);
     }

     static int sumarr(int[] x) {
          int sum = 0;
          for (int i = 0; i < x.length; i++) {
               sum += x[i];
          }
          return sum;
     }

}
