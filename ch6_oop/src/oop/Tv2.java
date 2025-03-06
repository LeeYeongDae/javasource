package oop;

//Tv 클래스

public class Tv2 {
     private int size;
     private String color;
     private int channel;
     private int volume;
     private boolean power;

     public Tv2() {
     }

     public Tv2(int channel, String color, boolean power, int size, int volume) {
          this.channel = channel;
          this.color = color;
          this.power = power;
          this.size = size;
          this.volume = volume;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public String getColor() {
          return color;
     }

     public void setSize(int size) {
          this.size = size;
     }

     public void setChannel(int channel) {
          this.channel = channel;
     }

     public void setPower() {
          this.power = !power;
     }

     @Override
     public String toString() {
          return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                    + power + "]";
     }

     public int getSize() {
          return size;
     }

     public int getChannel() {
          return channel;
     }

     public int getVolume() {
          return volume;
     }

     public boolean isPower() {
          return power;
     }

}
