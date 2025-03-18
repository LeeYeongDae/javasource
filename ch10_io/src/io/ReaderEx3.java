package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class ReaderEx3 {
     public static void main(String[] args) {
          try (Reader re = new FileReader("./src/io/FileEx1.java", Charset.forName("utf-8"));
                    BufferedReader br = new BufferedReader(re);) {
               int data = 0;
               String str = "";
               while ((str = br.readLine()) != null) {
                    // bw.write(str);
                    // bw.newLine();
               }
          } catch (Exception e) {
               e.printStackTrace();
          }
     }
}
