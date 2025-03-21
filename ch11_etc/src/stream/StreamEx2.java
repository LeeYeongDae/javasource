package stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx2 {
     static int stsum;

     @SuppressWarnings("UnusedAssignment")
     public static void main(String[] args) {
          Set<String> set = new HashSet<>();
          Stream<String> stream = set.stream();
          String[] strarr = { "s", "t", "r" };
          stream = Arrays.stream(strarr);

          Path path = Paths.get("../");
          try (Stream<Path> stpath = Files.list(path)) {
               stpath.forEach(f -> System.out.println(f.getFileName()));
          } catch (Exception e) {
               e.printStackTrace();
          }
          int sum = 0;
          for (int i = 0; i <= 100; i++) {
               sum += i;
          }
          System.out.println(sum);
          stsum = 0;
          IntStream.range(1, 100).forEach(i -> System.out.println(i + " "));
          IntStream.rangeClosed(1, 100).forEach(i -> stsum += i);

     }
}
