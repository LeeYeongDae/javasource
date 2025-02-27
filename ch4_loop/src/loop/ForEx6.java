package loop;

import java.util.Scanner;

public class ForEx6 {
    public static void main(String[] args) {
        //팩토리얼
        int fact = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        String input = scanner.nextLine(); //다음에 오는 문자열 받기
        int num = Integer.parseInt(input);
        
        scanner.close();
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(num+"! = "+fact);
        
    }
}
