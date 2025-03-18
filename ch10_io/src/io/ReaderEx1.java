package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ReaderEx1 {
     public static void main(String[] args) {
          try (Reader reader = new FileReader("C:/temp/test1.txt", Charset.forName("utf-8"));
                    Writer writer = new FileWriter("c:/temp/out1.txt", true)) {
               int data = 0;
               char cbuf[] = new char[1024];
               while ((data = reader.read(cbuf)) != -1) {
                    System.out.println(cbuf);
                    writer.write(cbuf);
               }
          } catch (Exception e) {
               e.printStackTrace();
          }
     }
}
