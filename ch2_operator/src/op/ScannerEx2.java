package op;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // 키보드 입력 받기

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        System.out.println(input);

        scanner.close();
    }
}
