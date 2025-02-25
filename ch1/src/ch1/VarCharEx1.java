package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        //문자 : 글자 한개
        //문자열 : 글자 1개~여러 개
        char ch1 = '기';
        int unicode = ch1;
        System.out.println("ch1 = "+ ch1);
        System.out.println("unicode = "+ unicode); // 44592

        char ch2 = 'a';
        unicode = ch2;
        System.out.println("ch2 = "+ ch2);
        System.out.println("unicode = "+ unicode); // 97

        char ch3 = 'A';
        unicode = ch3;
        System.out.println("ch3 = "+ ch3);
        System.out.printf("ch3 = %c\n", ch3);
        System.out.println("unicode = "+ unicode); // 65

    }
}
