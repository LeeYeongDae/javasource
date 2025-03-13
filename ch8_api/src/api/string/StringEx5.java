package api.string;

public class StringEx5 {
     public static void main(String[] args) {
          System.out.println(count("12345AB12AB45AB", "AB"));
          System.out.println(count("12345", "AB"));
     }

     public static int count(String src, String target) {
          return src.indexOf(target);
     }

     public static int count(String src, String target, int s) {
          return src.indexOf(target, s);
     }
}
