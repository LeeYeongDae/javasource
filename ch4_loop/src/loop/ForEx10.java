package loop;

import java.util.Scanner;

public class ForEx10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("줄의 수를 입력하세요");
        int input = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= input; i++) {
            for (int j = input; j > 0; j--) // 해당 줄만큼 찍기
            {
                if (j > i)
                    System.out.print(" "); // 공백 찍기
                else
                    System.out.print("*"); // 별 찍기
            }

            System.out.println(); // 다음 줄
        }
    }
}
