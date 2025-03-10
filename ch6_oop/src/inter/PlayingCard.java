package inter;

public interface PlayingCard {
     // int num; 멤버 변수 선언 X
     final int NUM = 10;

     // 상수
     // void method() {} 일반 메소드 X
     /* public abstract 생락됨, */void method();

     // static과 default로 일반 메소드 선언 가능
     static void display() {
     }

     default void print() {
     };
}
