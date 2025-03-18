package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx2 {
     public static void main(String[] args) {
          try (Reader re = new FileReader("C:/temp/test1.jpg");
                    BufferedReader br = new BufferedReader(re);
                    Writer w = new FileWriter("C:/temp/out1.jpg");
                    BufferedWriter bw = new BufferedWriter(w)) {
               int data = 0;
               String str = "";
               while ((str = br.readLine()) != null) {
                    bw.write(str);
                    bw.newLine();
               }
          } catch (Exception e) {
               e.printStackTrace();
          }
     }
}
