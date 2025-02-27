package loop;

public class WhileEx4 {
    public static void main(String[] args) {
        // 구구단 출력
        for (int i = 1; i < 10; i++) {
            System.out.println("7 x " + i + " = " + 7 * i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println("7 x " + i + " = " + 7 * i);
            i++;
        }

    }
}
