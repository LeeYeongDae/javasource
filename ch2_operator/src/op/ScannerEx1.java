package op;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        //키보드 입력 받기

        Scanner scanner = new Scanner(System.in);

        System.out.println("두자리 정수 입력");
        String input = scanner.nextLine(); //다음에 오는 문자열 받기
        int num = Integer.parseInt(input); //문자열의 공백 없이 정수로 받기
        System.out.println("입력값 : " + num);

        scanner.close();
    }
}
