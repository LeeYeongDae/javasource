package condition;

import java.util.Scanner;

public class SwitchTest4 {
    public static void main(String[] args) {
        // 가위(1)바위(2)보(3)
        int com = (int) (Math.random() * 3) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("가위바위보 선택 :");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        switch (num - com) {
            case 1:
            case -2:
                System.out.println("당신이 이겼습니다.");
                break;
            case 0:
                System.out.println("당신이 비겼습니다.");
                break;
            case -1:
            case 2:
                System.out.println("당신이 졌습니다.");
                break;
            default:
                break;
        }
        System.out.print("컴퓨터가 낸 것은 ");
        switch (com) {
            case 1:
                System.out.println("가위");
                break;
            case 2:
                System.out.println("바위");
                break;
            case 3:
                System.out.println("보");
                break;
            default:
                break;
        }
        System.out.print("당신이 낸 것은 ");
        switch (num) {
            case 1:
                System.out.println("가위");
                break;
            case 2:
                System.out.println("바위");
                break;
            case 3:
                System.out.println("보");
                break;
            default:
                break;
        }
    }
}
