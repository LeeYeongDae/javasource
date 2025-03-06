package oop;

//Tv 클래스

public class TimeEx {
     public static void main(String[] args) {
          Time time = new Time();

          time.setHour(1235435);
          time.setMinute(155433);
          time.setSecond(25.4f);
          System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
     }
}
