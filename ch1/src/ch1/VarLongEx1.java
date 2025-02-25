package ch1;

public class VarLongEx1{
    public static void main(String[] args) {
        long age = 10, maxSpeed = 100;
        long max = 999999999;
        long money = 1000000000000l;

        System.out.println("이 자식의 돈은 " +  money + "이다.");

        System.out.println("이 자식의 나이는 " + age + "이다.");
        System.out.println("이 자식의 최고 속력은 " + maxSpeed + "이다.");
        System.out.println("이 자식의 최고는 " + max + "이다.");
        System.out.println(age + maxSpeed + max);
    }
}
