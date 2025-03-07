package extend;

//Tv 클래스

public class Tv {
     int channel;
     boolean power;

     public void channelUp() {
          channel++;
     }

     public void channelDown() {
          channel--;
     }

     public void setPower() {
          this.power = !power;
     }

     @Override
     public String toString() {
          return "Tv [channel=" + channel + ", power=" + power + "]";
     }

}
