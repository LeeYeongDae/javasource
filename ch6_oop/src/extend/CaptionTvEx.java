package extend;

//Tv 클래스

public class CaptionTvEx {
     public static void main(String[] args) {
          Tv tv = new Tv();
          tv.setPower();

          CaptionTv ctv = new CaptionTv();
          ctv.channel = 10;
          ctv.channelUp();
          System.out.println(ctv.channel);
          ctv.displayCaption("text");
          ctv.caption = true;
          ctv.displayCaption("text");

     }

}
