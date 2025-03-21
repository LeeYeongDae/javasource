package stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx6 {
     public static void main(String[] args) {
          IntStream stream = IntStream.rangeClosed(0, 10);

          long cnt = stream.filter(i -> i % 2 == 0).count();
          System.out.println(cnt);
          long sum = stream.filter(i -> i % 2 == 0).sum();
          System.out.println(sum);
          OptionalInt min = stream.filter(i -> i % 2 == 0).min();
          System.out.println(min);
          OptionalInt max = stream.filter(i -> i % 2 == 0).max();
          System.out.println(max);
     }
}
