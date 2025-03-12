package api.string;

public class StringEx {
     public static void main(String[] args) {
          String str1 = new String("Hi");
          String str4 = new String("Hi");
          String str2 = "Hi";
          String str3 = "Hi";
          String str5 = new String(new char[5]);

          System.out.println(str1 == str4); // false
          System.out.println(str2 == str3); // true
          System.out.println(str1.equals(str4)); // true

          str1 = "";
          str2 = null;
          System.out.println(str1.length());
          // System.out.println(str2.length()); //nullpointerexception
     }
}
