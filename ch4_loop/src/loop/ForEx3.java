package loop;

public class ForEx3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            //System.out.println(i);
            sum += i;
        }

        System.out.println(sum + "\n");

        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0)
                System.out.print(i + " ");
        }

    }
}
