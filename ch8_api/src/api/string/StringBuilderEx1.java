package api.string;

public class StringBuilderEx1 {
     public static void main(String[] args) {
          String st1 = "안녕하세요";
          st1 += " 뭘 봐요";
          st1 += " 또 뭘 봐요";

          StringBuffer sb = new StringBuffer();
          sb.append("안녕히세요");
          System.out.println(sb);

          StringBuffer bb1 = new StringBuffer("Test");
          StringBuffer bb2 = new StringBuffer("Test");
          System.out.println(bb1.equals(bb2) ? "같음" : "거짓");

          for (int i = st1.length() - 1; i >= 0; i--) {
               System.out.print(st1.charAt(i));
          }
          System.out.println();
          System.out.println(bb1.reverse());

          StringBuffer sb1 = new StringBuffer(st1);
          System.out.println(sb1.reverse());
          bb2.append("e");
          bb2.delete(1, 3);
          System.out.println(bb2);
          bb2.insert(1, "aallo");
          System.out.println(bb2);
          bb2.replace(0, 2, "Ch");
          System.out.println(bb2);
     }
}
