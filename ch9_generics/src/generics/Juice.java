package generics;

class Juicer {
     static Juice makeJuice(Box3<Fruit> box) {
          String tmp = "";
          for (Fruit f : box.getList())
               tmp += f + "";

          return new Juice(tmp);
     }
}

public class Juice {
     String name;

     public Juice(String name) {
          this.name = name;
     }

     @Override
     public String toString() {
          return name;
     }

}
