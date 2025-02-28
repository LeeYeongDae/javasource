package loop;

public class ForEx12 {
    public static void main(String[] args) {
        // 4x + 5y = 60
        // x,y 는 10 이하의 자연수
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if (x * 4 + y * 5 == 60)
                    System.out.printf("(%d, %d)\t ", x, y);
            }
        }

    }
}
