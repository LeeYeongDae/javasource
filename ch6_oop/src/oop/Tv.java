package oop;

//Tv 클래스

public class Tv {
     public int size;
     private String color;
     int channel;
     public int volume;
     boolean power;

     public void setColor(String color) {
          this.color = color;
     }

     public String getColor() {
          return color;
     }

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
          return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                    + power + "]";
     }

}
