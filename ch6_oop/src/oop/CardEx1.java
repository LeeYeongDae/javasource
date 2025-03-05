package oop;

//OOP(Object Oriented Programming) : 객체지향 프로그래밍

public class CardEx1 {
     public static void main(String[] args) {

          System.out.println(Card.width + " x " + Card.height);

          Card card = new Card();
          card.shape = "Heart";
          card.number = 'A';

          Card card2 = new Card();
          card2.shape = "Spade";
          card2.number = 'A';
     }
}
