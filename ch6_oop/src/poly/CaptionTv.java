package poly;

//Tv 클래스

public class CaptionTv extends Tv {
     boolean caption;

     void displayCaption(String text) {
          if (caption)
               System.out.println(text);
     }

}
