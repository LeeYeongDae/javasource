package loop;

public class WhileEx2 {
    public static void main(String[] args) {
        //무한루프 : 반복문이 멈추지 못하는 경우

        int i = 0; //초기화
        while(i < 11) //조건
        {
            System.out.println(i+"    ");
            i++;
        }
        System.out.println();

        i = 10;
        while (i > 0) {
            if (i % 2 == 0)
                System.out.print(i + "  ");
            i--;
        }
        System.out.println();

        i=2;
        while(i < 11) //조건
        {
            System.out.println(i+"    ");
            i+=2;
        }
    }
}
