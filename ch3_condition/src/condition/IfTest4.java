package condition;

import java.util.Scanner;

public class IfTest4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 입력");
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        if (score >= 90)
            System.out.println("A등급입니다.");
        else if (score >= 80)
            System.out.println("B등급입니다.");
        else if (score >= 70)
            System.out.println("C등급입니다.");
        else if (score >= 60)
            System.out.println("D등급입니다.");
        else
            System.out.println("F등급입니다.");
            
        scanner.close();
    }
}
