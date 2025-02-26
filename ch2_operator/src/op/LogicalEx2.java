package op;

import java.util.Scanner;

public class LogicalEx2 {
    public static void main(String[] args) {
        //사용자로부터 문자 입력받은 후 숫자인지 영문자인지 판별하는 프로그램

        Scanner scanner = new Scanner(System.in);

        System.out.println("문자를 입력하세요");
        String input = scanner.nextLine(); //다음에 오는 문자열 받기
        char ch = input.charAt(0); //문자열의 첫번째 문자 받기
        
        scanner.close();
try {
    if ('0' <= ch && ch <= '9')
        {
            System.out.println("입력한 문자는 숫자입니다.");
        }
        else if(('a' <= ch && ch <= 'z')||('A' <= ch && ch <= 'Z'))
        {
            System.out.println("입력한 문자는 영문자입니다.");
        }
        else
        {
           throw new Exception("입력한 문자는 숫자도 영문자도 아닙니다."); 
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }        
    }
}
