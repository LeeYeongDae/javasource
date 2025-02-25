package ch1;

public class VarIntEx1 {
    public static void main(String[] args) {
        int age = 10, maxSpeed = 100;
        int max = 999999999;

        System.out.println("이 자식의 나이는 " + age + "이다.");
        age = 30;

        System.out.printf("이 자식의 진짜 나이는 %d, 최고 속력은 %d 이다.\n", age, maxSpeed);
        System.out.println("이 자식의 최고는 " + max + "이다.");
        System.out.println(age + maxSpeed + max);
    }
}
