package loop;

public class ForEx8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) // 해당 줄만큼 찍기
                System.out.print("*"); // 별 찍기
            System.out.println(); // 다음 줄
        }
    }
}
