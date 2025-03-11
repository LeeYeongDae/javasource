package inter;

interface Soundable {
     String sound();
}

class Cat implements Soundable {

     @Override
     public String sound() {
          return "야. 옹";
     }

}

class Dog implements Soundable {

     @Override
     public String sound() {
          return "멍";
     }

}

class SoundableEx {
     public static void main(String[] args) {
          printSound(new Cat());
          printSound(new Dog());
     }

     static void printSound(Soundable s) {
          System.out.println(s.sound());
     }
}
