package condition;

import java.util.Scanner;

public class IfTest10 {
    public static void main(String[] args) {
        //3개의 숫자를 입력 받아 가장 큰 수와 가장 작은 수 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("1번째 정수 입력 :");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

        System.out.println("2번째 정수 입력 :");
        input = scanner.nextLine();
        int num2 = Integer.parseInt(input);

        System.out.println("3번째 정수 입력 :");
        input = scanner.nextLine();
        int num3 = Integer.parseInt(input);

        scanner.close();

        int max, min;
        max = num1 > num2 ? num1 : num2;
        max = max > num3 ? max : num3;
        min = num1 < num2 ? num1 : num2;
        min = min < num3 ? min : num3;
        
        System.out.println("최대값은 "+max+"이고, 최소값은 "+min+"이다.");

    }
}
