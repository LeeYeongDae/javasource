package stream;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx5 {
     public static void main(String[] args) {
          List<String> fruits = Arrays.asList("Apple", "Banana", "Carrot", "Pomogranade");
          Stream<String> stream = fruits.stream();

          stream.map(f -> f.toUpperCase()).peek(s -> System.out.println(s))
                    .collect(Collectors.toList());
          Stream<File> stream2 = Stream.of(
                    new File("fxxk.txt"),
                    new File("I_Hate.txt"),
                    new File("this_process.java"),
                    new File("Damn"),
                    new File("man.bat"));
          stream2.map(f -> f.getName())
                    .filter(f -> f.contains("."))
                    .map(f -> f.substring(f.lastIndexOf(".") + 1))
                    .distinct()
                    .forEach(f -> System.out.println(f));
     }
}
