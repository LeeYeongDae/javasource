package loop;

public class WhileEx1 {
    public static void main(String[] args) {
        // 무한루프 : 반복문이 멈추지 못하는 경우

        int i = 0; // 초기화
        while (i < 5) // 조건
        {
            System.out.println("안녕하세요");
            i++; // 다음
        }
    }
}
