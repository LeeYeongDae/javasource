package condition;

import java.util.Scanner;

public class SwitchTest6 {
    public static void main(String[] args) {
        // 연산자와 피연산자 입력 받고 계산해서 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("연산자 입력");
        String input = scanner.nextLine();
        char op = input.charAt(0);

        System.out.println("첫번째 피연산자 입력");
        input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

        System.out.println("두번째 피연산자 입력");
        input = scanner.nextLine();
        int num2 = Integer.parseInt(input);

        int result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("연산자가 틀렸습니다.");
                System.exit(0);
        }

        System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
        scanner.close();
    }
}
