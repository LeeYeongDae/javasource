package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Scanner;

public class WriterEx1 {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in);
                    Writer writer = new FileWriter("c:/temp/outt.txt", Charset.forName("utf-8"));
                    BufferedWriter bw = new BufferedWriter(writer);) {
               String data = "";
               String str = "";
               while (!str.equalsIgnoreCase("q")) {
                    str = sc.nextLine();
                    if (str.equalsIgnoreCase("q"))
                         break;
                    data += str + "\n";
               }
               bw.write(data);
          } catch (Exception e) {
               e.printStackTrace();
          }
     }
}
