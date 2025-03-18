package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx1 {
     public static void main(String[] args) {
          int data = 0;
          byte b[] = new byte[1024];
          try (FileInputStream fis = new FileInputStream("C:/temp/test1.jpg");
                    FileOutputStream fos = new FileOutputStream("C:/temp/out1.jpg")) {
               long start = System.currentTimeMillis();
               while ((data = fis.read(b)) != -1) {
                    fos.write(b);
               }
               long end = System.currentTimeMillis();
               System.out.println(end - start);
          } catch (IOException e) {
               e.printStackTrace();
          }

     }
}
