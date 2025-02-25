package op;
// 증감연산자 : +1, -1을 간단히 처리
// ++, -- : 변수 앞(전위), 변수 뒤(후위)
public class IncDecOperEx1 {
    public static void main(String[] args) {
        int num = 10;

        num++;
        System.out.println("num = " + num);
        num--;
        System.out.println("num = " + num);

        int num2 = 20;
        System.out.println("num2 = " + (num2++)); // 20 => 현재 num2 값 = 21
        System.out.println("num2 = " + (++num2)); // 22
    }
}
