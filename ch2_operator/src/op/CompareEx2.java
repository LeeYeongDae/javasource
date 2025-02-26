package op;

public class CompareEx2 {
    public static void main(String[] args) {
        float f1 = 0.1f;
        double d1 = 0.1;
        double d2 = (double)f1;

        System.out.printf("10.0 == 10.0f \t %b\n", (10.0 == 10.0f)); // 10.0f == 10.0f
        System.out.printf("0.1 == 0.1f \t %b\n", (0.1 == 0.1f)); // 0.1 != 0.1f
        System.out.printf("f1 = %19.17f\n", f1); //float의 저장방식으로 인해 오차 발생
        System.out.printf("d1 = %19.17f\n", d1); //0.10000000000000000
        System.out.printf("d2 = %19.17f\n", d2); //0.10000000149011612
        System.out.printf("f1 == d1 \t %b\n ", (f1 == d1)); //
        System.out.printf("d1 == d2 \t %b\n ", (d1 == d2)); //
        System.out.printf("d2 == f1 \t %b\n ", (d2 == f1)); //
        System.out.printf("(float)d1 == f1 \t %b\n ", ((float)d1 == f1)); //
    }
}
