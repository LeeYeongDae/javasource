package condition;

public class SwitchTest1 {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6) + 1;

        switch (num) {
            case 1: // num == 1
                System.out.println("주사위 1이 나왔습니다.");
                break;  // 막지 않으면 연달아 출력됨
            case 2:
                System.out.println("주사위 2가 나왔습니다.");
                break;
            case 3:
                System.out.println("주사위 3이 나왔습니다.");
                break;
            case 4:
                System.out.println("주사위 4가 나왔습니다.");
                break;
            case 5:
                System.out.println("주사위 5가 나왔습니다.");
                break;
            case 6:
                System.out.println("주사위 6이 나왔습니다.");
                break;
            default:
                throw new AssertionError();
        }
    }
}
