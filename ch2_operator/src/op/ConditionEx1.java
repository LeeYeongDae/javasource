package op;

public class ConditionEx1 {
    public static void main(String[] args) {
        int x, y, z;

        x = 10; y = -5; z = 0;

        //x가 음수일 때 양수로 만들기
        int result1 = x >= 0 ? x : -x;
        System.out.println(result1);

        //y가 0보다 크면 'A' 아니면 'B'
        char ch = y > 0 ? 'A' : 'B';
        System.out.println(ch);

        //z가 0보다 크면 "A" 아니면 "B"
        String str = z > 0 ? "A" : "B";
        System.out.println(str);
    }
}
