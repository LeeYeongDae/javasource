package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
     public static void main(String[] args) {
          List<String> list = Arrays.asList("1", "2", "3");

          for (String string : list) {

          }
          Iterator<String> it = list.iterator();
          while (it.hasNext()) {

          }
          Stream<String> stream = list.stream();
          stream.forEach(s -> System.out.println(s));

          // ~= Consumer<String> action;

     }
}
