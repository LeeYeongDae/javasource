package condition;

import java.util.Scanner;

public class IfTest9 {
    public static void main(String[] args) {
        //윤년 평년 구하기
        //연도 입력

        Scanner scanner = new Scanner(System.in);
        System.out.println("연도 입력 :");
        String input = scanner.nextLine();
        int year = Integer.parseInt(input);
        scanner.close();

        //윤년 평년인지 출력
        //윤년 : 년도가 4의 배수이고, 100의 배수가 아님 | 400의 배수
        if((year % 4 == 0 && year % 100 != 0) ||year % 400 == 0)
        System.out.println("해당 연도는 윤년입니다.");
        else
        System.out.println("해당 연도는 평년입니다.");
    }
}
