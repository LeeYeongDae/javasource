package loop;

import java.util.Scanner;

//중첩 for

public class ForEx7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("변의 길이를 입력하세요");
        String input = scanner.nextLine(); // 다음에 오는 문자열 받기
        int num = Integer.parseInt(input);

        scanner.close();
        for (int i = 0; i < num; i++) { // num개의 줄 찍기
            for (int j = 0; j < num; j++) // 한줄로 별 num개 찍기
                System.out.print("*"); // 별 찍기
            System.out.println(); // 다음 줄
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(j + "\t"); // 배열 값 적기
            System.out.println(); // 다음 줄
        }
    }
}
