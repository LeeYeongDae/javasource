package api.string;

public class StringEx3 {
     public static void main(String[] args) {
          String str1 = "Hi";
          str1 += " Bye";
          System.out.println(str1);
          String str2 = "Bye";
          str2 = str2.concat("Yo");
          System.out.println(str2);

          System.out.println(str1.endsWith("e"));
          System.out.println(str1.startsWith("H"));

          String file = "text.txt";
          if (file.endsWith("png") || file.endsWith("gif") || file.endsWith("jpg")) {
               System.out.println("이미지 파일");
          }
          System.out.println(str1.replace("Hi", "Hello"));
          System.out.println(str1); // 변경 X
          str1 = str1.replace("Hi", "Hello");
          System.out.println(str1); // 변경

          // 정규식
          System.out.println(str1.replaceAll("[a-z]", "3"));

     }
}
