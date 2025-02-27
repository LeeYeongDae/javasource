package condition;

import java.util.Scanner;

public class IfTest6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 입력");
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);
        scanner.close();
        char grade = ' ', opt='0';
        if (score >= 90)
        {
            grade = 'A';
            if (score%10 >= 8)
            opt = '+';
            else if(score%10 < 4)
            opt = '-';
        }
        else if (score >= 80)
        {
            grade = 'B';
            if (score%10 >= 8)
            opt = '+';
            else if(score%10 < 4)
            opt = '-';
        }
        else if (score >= 70){
            grade = 'C';
            if (score%10 >= 8)
            opt = '+';
            else if(score%10 < 4)
            opt = '-';
        }
        else if (score >= 60){
            grade = 'D';
            if (score%10 >= 8)
            opt = '+';
            else if(score%10 < 4)
            opt = '-';
        }
        else
            grade = 'F';
        System.out.printf("당신의 학점은 %c%c입니다.\n",grade,opt);
    
    }
}
