package loop;

public class ForEx13 {
    public static void main(String[] args) {
        // 1~100 사이의 소수 구하기
        for (int x = 2; x <= 100; x++) {
            int count = 0; // 나누어지는 횟수 체크
            for (int y = 1; y <= x; y++) {
                if (x % y == 0)
                    count++;
            }
            if (count == 2)
                System.out.print(x + " ");
        }

    }
}
