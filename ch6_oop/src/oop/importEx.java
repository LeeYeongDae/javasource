package oop;

import extend.Parent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Math.*;

//impor를 사용하지 않는 패키지의 경우 자동 처리되는 패키지
//import java.lang.* lang 패키지에 속한 모든 클래스 import 

public class importEx {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          Parent parent = new Parent();

          Date date = new Date();
          System.out.println(date);

          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
          System.out.println("Today's date is : " + sdf.format(date));

          System.out.println(Math.min(15, 25));
     }
}
