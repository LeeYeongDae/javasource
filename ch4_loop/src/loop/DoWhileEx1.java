package loop;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // 컴퓨터가 임의 수(1~100) 생성 / 생성 숫자 맞추기

        int answer = (int) (Math.random() * 100) + 1;

        int input = 0; // 초기화
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("1 ~ 100 사이의 정수를 입력하세요");
            input = scanner.nextInt(); // 다음에 오는 정수 받기
            scanner.close();

            if (input > answer)
                System.out.println(input + "은 주어진 값보다 큽니다.");
            else if (input < answer)
                System.out.println(input + "은 주어진 값보다 작습니다.");

            System.out.println();
        } while (input != answer); // 조건
        System.out.println("정답! " + input);
    }
}
