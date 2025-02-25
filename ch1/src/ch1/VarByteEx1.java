package ch1;

public class VarByteEx1 {
    public static void main(String[] args) {
        byte age = 10, maxSpeed = 100;
        //byte의 크기 : 2^8=256 ⇒ -128 ~ 127

        System.out.println("이 자식의 나이는 " + age + "이다.");
        System.out.println("이 자식의 최고 속력은 " + maxSpeed + "이다.");
        System.out.printf("이 자식의 나이는 %d 이다.\n", age);
        System.out.printf("이 자식의 최고 속력은 %d 이다.\n", maxSpeed);
        System.out.println(age + maxSpeed);
    }
}
