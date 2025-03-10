package abstractclass;

public abstract class Player {
     boolean pause;
     int currentPos;

     Player() {
          pause = false;
          currentPos = 0;
     }

     abstract void play();

     void pause() {

     }
}

class CDPlayer extends Player {

     @Override
     void play() {
          System.out.println("CD 플레이어");
     }

}

class AudioPlayer extends Player {

     @Override
     void play() {
          System.out.println("Audio 플레이어");
     }

}
