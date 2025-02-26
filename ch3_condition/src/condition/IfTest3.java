package condition;

import java.util.Scanner;

public class IfTest3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 입력");
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        if (score >= 90)
        {
            System.out.println("점수가 90점 이상입니다. A등급입니다.");
        }
        else
        {
            System.out.println("점수가 90점 미만입니다. B등급입니다.");
        }
        scanner.close();
    }
}
