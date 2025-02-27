package condition;

import java.util.Scanner;

public class IfTest7 {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*100);
        System.out.println(num1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 입력 :");
        String input = scanner.nextLine();
        int num2 = Integer.parseInt(input);
        scanner.close();

        if (num1 % 2 == 0)
            System.out.println("num1은 짝수입니다.");
        else
            System.out.println("num1은 홀수입니다.");
            
        if (num2 % 2 == 0)
            System.out.println("num2은 짝수입니다.");
        else
            System.out.println("num2은 홀수입니다.");
    }
}
