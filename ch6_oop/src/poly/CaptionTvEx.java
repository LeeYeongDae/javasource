package poly;

//Tv 클래스

public class CaptionTvEx {
     public static void main(String[] args) {
          Tv tv = new CaptionTv();

          tv.channel = 10;
          tv.channelUp();
          System.out.println(tv.channel);

          CaptionTv ctv = (CaptionTv) tv;
          ctv.displayCaption("text");
          ctv.caption = true;
          ctv.displayCaption("text");

     }

}
