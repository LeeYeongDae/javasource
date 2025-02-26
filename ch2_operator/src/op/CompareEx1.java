package op;

public class CompareEx1 {
    public static void main(String[] args) {
        System.out.printf("10 == 10.0f \t %b\n", (10 == 10.0f)); // 10.0f == 10.0f
        System.out.printf("'0' == 0 \t %b\n", ('0' == 0));    // 48 == 0
        System.out.printf("'A' == 65 \t %b\n", ('A' == 65)); // 65 == 65
        System.out.printf("'A' > 'B' \t %b\n", ('A' > 'B'));    // 65 > 66
        System.out.printf("'A'+1 != 'B' \t %b\n", ('A'+1 != 'B'));  // 65+1 != 66
    }
}
