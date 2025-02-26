package op;

public class ArthmeticEx3 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = c1;
        char c3;

        //char도 byte, short와 같이 연산의 결과가 int형으로 변경
        // -> 결과값을 int로 저장 | 결과값을 강제 형변환
        int result = c1 + 1;

        c3 = (char)(c1 + 1);

        c2++;
        c2++;

        System.out.println("c1 = "+ c1);
        System.out.println("c2 = "+ c2);
        System.out.println("result = "+ result); //98
        System.out.println("c3 = "+ c3); //b

        //아스키코드로 인해 문자를 숫자값으로 인식
    }
}
