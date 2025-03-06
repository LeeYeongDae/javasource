package oop;

//Tv 클래스

public class Time {
     private int hour;
     private int minute;
     private float second;

     public int getHour() {
          return hour;
     }

     public void setHour(int hour) {
          while (hour > 23 || hour < 0) {
               if (hour < 0)
                    hour += 24;
               else if (hour > 23)
                    hour -= 24;
          }
          this.hour = hour;
     }

     public int getMinute() {
          return minute;
     }

     public void setMinute(int minute) {
          while (minute > 59 || minute < 0) {
               if (minute < 0)
                    minute += 60;
               else if (minute > 59)
                    minute -= 60;
          }
          this.minute = minute;
     }

     public float getSecond() {
          return second;
     }

     public void setSecond(float second) {
          while (second > 59.99f || second < 0) {
               if (second < 0)
                    second += 60;
               else if (second > 59.99f)
                    second -= 60;
          }
          this.second = second;
     }

}
