package inter;

public class Card implements PlayingCard {

     @Override
     public void print() {
          PlayingCard.super.print();
     }

     public void display() {
          PlayingCard.display();
     }

     @Override
     public void method() {
          throw new UnsupportedOperationException("Not supported yet.");
     }
}
