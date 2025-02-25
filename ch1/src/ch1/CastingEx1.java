package ch1;

public class CastingEx1 {
    public static void main(String[] args) {
        double num = 85.4;
        System.out.println("num = "+ num);
        int score = (int)num;
        System.out.println("score = " + score);
        char ch1 = (char)score;
        System.out.println("ch1 = " + ch1);
        }
}
