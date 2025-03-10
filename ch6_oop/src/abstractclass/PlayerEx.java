package abstractclass;

public class PlayerEx {
     public static void main(String[] args) {
          Player player = new CDPlayer();
          player.play();

          player = new AudioPlayer();
          player.play();

     };
}
