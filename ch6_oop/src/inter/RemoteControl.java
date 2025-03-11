package inter;

public interface RemoteControl {
     int MAX_VOLUME = 10;
     final static int MIN_VOLUME = 0;

     void turnOn();

     void turnOff();

     void setVolume(int volume);

     default void setMute(boolean mute) {
          if (mute) {
               System.out.println("음소거");
          } else {
               System.out.println("음소거 해제");
          }
     }

     static void changeBattery() {
          System.out.println("건전지 교환");
     }
}
