package op;

public class CompareEx3 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";    //str1에서 생성된 "abc"로 참조
        String str3 = new String("abc");    //새로 heap에 "abc"의 공간 생성

        //같은 공간에 저장된 문자열 비교시 ==은 값 비교, 따라서 true
        //다른 공간에 저장된 문자열 비교시 ==은 주소 비교,

        System.out.printf("(str1 == str2) = %b\n",(str1 == str2)); // true
        System.out.printf("(str1 == str3) = %b\n",(str1 == str3)); // false
        System.out.printf("(str1 == str3) = %b\n",(str1.equals(str3))); // true
        System.out.printf("(str1 == str3) = %b\n",(str1.equalsIgnoreCase(str3))); // true 대소문자 비교 X
    }
}
