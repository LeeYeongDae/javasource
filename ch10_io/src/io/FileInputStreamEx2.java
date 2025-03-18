package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx2 {
     public static void main(String[] args) {
          int data = 0;
          byte b[] = new byte[1024];
          try (FileInputStream fis = new FileInputStream("C:/temp/test1.jpg");
                    BufferedInputStream bif = new BufferedInputStream(fis);
                    FileOutputStream fos = new FileOutputStream("C:/temp/out1.jpg");
                    BufferedOutputStream bof = new BufferedOutputStream(fos)) {
               while ((data = fis.read(b)) != -1) {
                    fos.write(b);
               }
          } catch (IOException e) {
               e.printStackTrace();
          }

     }
}
