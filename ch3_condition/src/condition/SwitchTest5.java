package condition;

import java.util.Scanner;

public class SwitchTest5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 입력");
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        char grade = ' ';
        switch (score / 10) {
            case 9:
            case 10:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
                break;
        }

        System.out.printf("당신의 학점은 %c입니다.\n", grade);
        scanner.close();
    }
}
