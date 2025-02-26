package op;

public class ArthmeticEx1 {
    public static void main(String[] args) {
        int a = 10, b = 4;

        //byte,short 타입의 경우 연산 수행이 될 경우 연산결과가 int형으로 변경
        //-> int로 저장 | 결과값을 강제 형변환

        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
    
    }
}
