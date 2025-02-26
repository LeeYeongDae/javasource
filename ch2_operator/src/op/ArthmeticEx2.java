package op;

public class ArthmeticEx2 {
    public static void main(String[] args) {
        int a = 10, b = 4;

        //byte,short 타입의 경우 연산 수행이 될 경우 연산결과가 int형으로 변경
        //-> int로 저장 | 결과값을 강제 형변환
        
        System.out.printf("%d / %d = %d\n", a, b, a/b); //몫만 처리해줌
        System.out.printf("%d / %.1f = %.1f\n", a, (float)b, a/(float)b); //형변환으로 인해 더 큰 float로 변환
        System.out.printf("%d %% %d = %d\n", a, b, a%b);
    }
}
