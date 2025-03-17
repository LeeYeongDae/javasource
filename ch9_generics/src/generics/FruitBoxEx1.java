package generics;

import java.util.ArrayList;

class Fruit {

     @Override
     public String toString() {
          return "Fruit";
     }

}

class Apple extends Fruit {

     @Override
     public String toString() {
          return "Apple";
     }

}

class Grape extends Fruit {

     @Override
     public String toString() {
          return "Grape";
     }

}

class Toy {

     @Override
     public String toString() {
          return "Toy";
     }

}

class Box3<T> {
     ArrayList<T> list = new ArrayList<T>();

     void add(T item) {
          list.add(item);
     }

     T get(int i) {
          return list.get(i);
     }

     public ArrayList<T> getList() {
          return list;
     }

     int size() {
          return list.size();
     }

     public String toString() {
          return list.toString();
     }

}

public class FruitBoxEx1 {
     public static void main(String[] args) {
          Box3<Fruit> fruitbox = new Box3<>();
          Box3<Apple> applebox = new Box3<>();
          Box3<Grape> grapebox = new Box3<>();
          Box3<Toy> toybox = new Box3<>();

          fruitbox.add(new Fruit());
          fruitbox.add(new Apple());
          applebox.add(new Apple());

          System.out.println(fruitbox);
          System.out.println(applebox);
     }
}