package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx4 {
     public static void main(String[] args) {
          List<String> name = Arrays.asList("1", "2", "3");
          Set<String> set = new HashSet<>();
          System.out.println(set);
          name.stream().distinct().forEach(n -> System.out.println(n));
          name.stream().filter(names -> names.startsWith(""))
                    .forEach(n -> System.out.println(n));

          List<String> fruits = Arrays.asList("Apple", "Banana", "Carrot", "Doat");
          List<String> fruits2 = new ArrayList<>();
          for (String f : fruits) {
               System.out.println(f.toUpperCase());
               fruits2.add(f.toUpperCase());
          }
          System.out.println(fruits2.toString());

          List<String> list = fruits.stream()
                    .map(f -> f.toUpperCase())
                    .collect(Collectors.toList());
          System.out.println(list);

          Stream<File> stream = Stream.of(
                    new File("fxxk.txt"),
                    new File("I_Hate.txt"),
                    new File("this_process.java"),
                    new File("Damn"),
                    new File("man.bat"));
          Set<String> exSet = new HashSet<>();
          stream.forEach(f -> {
               int pos = f.getName().indexOf(".");
               if (pos != -1) {
                    String ext = f.getName().substring(pos + 1);
                    exSet.add(ext);
               }
          });
          System.out.print(exSet);

          stream.map(f -> f.getName())
                    .filter(f -> f.indexOf(".") > -1)
                    .map(f -> f.substring(f.lastIndexOf(".") + 1))
                    .distinct()
                    .forEach(f -> System.out.println(f));
     }
}
