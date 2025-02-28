package loop;

import java.util.Scanner;

public class DoWhileEx2 {
    public static void main(String[] args) {
        // 문자 입력 즉시 출력 / q 입력시 종료

        String input = " ";
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("메세지를 입력하세요");
            System.out.print(">> ");
            input = scanner.nextLine(); // 다음에 오는 문자열 받기

            if (!(input.equalsIgnoreCase("q")))
                System.out.println(input);

            System.out.println();
        } while (!(input.equalsIgnoreCase("q"))); // 조건
        System.out.println("종료");
    }
}
