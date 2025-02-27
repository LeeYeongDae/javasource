package condition;

import java.util.Scanner;

public class IfTest8 {
    public static void main(String[] args) {
        //시간당 임금 계산
        int rate = 9800; //시급
        int pay, hours;

        //근무시간 입력
        Scanner scanner = new Scanner(System.in);
        System.out.println("근무시간 입력 :");
        String input = scanner.nextLine();
        hours = Integer.parseInt(input);
        scanner.close();

        //근무시간 8시간까지만 지급, 초과근무시 초과 시간당 1.5배
        if (hours > 8)
            pay = rate * 8 + (int)(rate * (hours - 8) * 1.5f);
        else
            pay = rate * hours;
        
        System.out.println("받은 임금은 "+ pay + "원입니다.");
    }
}
