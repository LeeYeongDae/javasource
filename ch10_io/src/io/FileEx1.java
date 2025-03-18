package io;

import java.io.File;

public class FileEx1 {
     public static void main(String[] args) {
          File file = new File("C:/source/javasource/ch10_io/test1.txt");
          File file2 = new File("C:/source/javasource/ch10_io/", "test1.txt");

          File dir = new File("C:/source/javasource/ch10_io/");
          File file3 = new File(dir, "test1.txt");

          System.out.println("경로 제외 파일명 : " + file.getName());
          String filename = file.getName().substring(0, file.getName().lastIndexOf("."));
          String filec = file.getName().substring(file.getName().lastIndexOf(".") + 1);
          System.out.println("확장자명 제외 파일명 : " + filename);
          System.out.println("확장자 : " + filec);
          System.out.println("경로 포함 파일명 : " + file.getPath());
          System.out.println("절대 경로 : " + file.getAbsolutePath());
          System.out.println("디렉토리 : " + file.getParent());
          // 경로 구분자 표기 윈도우 ; 리눅스 :
          System.out.println("Path Seperator : " + file.pathSeparator);
          System.out.println("Path SeperatorChar : " + file.pathSeparatorChar);
          // 구분자 표기 윈도우 \ 리눅스 /
          System.out.println("Seperator : " + file.separator);
          System.out.println("SeperatorChar : " + file.separatorChar);
     }
}
