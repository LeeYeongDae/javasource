package condition;

public class SwitchTest3 {
    public static void main(String[] args) {
        String pos = "과장";

        switch (pos) {
            case "부장":
                System.out.println("700만원");
                break; // 막지 않으면 연달아 출력됨
            case "과장":
                System.out.println("500만원");
                break;
            default:
                System.out.println("300만원");
                break;
        }
    }
}
