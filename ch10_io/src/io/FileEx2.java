package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx2 {
     public static void main(String[] args) {
          File file = new File("C:/temp");
          File dir = new File(file, "dir");
          if (!dir.exists()) {
               dir.mkdir();
          }

          File file1 = new File(dir, "test1.txt");
          File file2 = new File(dir, "test2.txt");
          File file3 = new File(dir, "test3.txt");
          try {
               if (!file1.exists())
                    file1.createNewFile();
               if (!file2.exists())
                    file2.createNewFile();
               if (!file3.exists())
                    file3.createNewFile();
          } catch (IOException e) {
               e.printStackTrace();
          }

          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");

          File[] files = dir.listFiles();
          for (File f : files) {
               System.out.print(sdf.format(new Date(f.lastModified())) + "\t");
               if (f.isDirectory()) {
                    System.out.println("<DIR>\t\t" + f.getName());
               } else {
                    System.out.println("\t\t" + f.length() + "\t" + f.getName());
               }
               System.out.println();
          }
     }
}
