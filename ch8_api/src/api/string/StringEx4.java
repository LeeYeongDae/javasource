package api.string;

public class StringEx4 {
     public static void main(String[] args) {
          StringEx4 obj = new StringEx4();
          String[] names = { "King", "Queen", "Jack", "Ace", "Joker" };

          String result = obj.findKim(names);
          System.out.println(result);

     }

     public String findKim(String[] seoul) {
          for (int i = 0; i < seoul.length; i++) {
               if (seoul[i] == "Ace") {
                    System.out.println("Ace는 " + i + "번째에 있다");
                    return seoul[i];

               }
          }
          return null;
     }

}
