package lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

public class LambdaEx2 {
     public static void main(String[] args) {

          Consumer<Integer> consumer = (i) -> {
               System.out.println(i);
          };
          consumer.accept(50);

          Consumer<String> consumer2 = (t) -> {
               System.out.println(t);
          };
          consumer2.accept("Fxx");

          BiConsumer<String, String> biConsumer;
          DoubleConsumer doubleConsumer = (d) -> System.out.println(d);
          doubleConsumer.accept(0);
          ObjDoubleConsumer<String> objDoubleConsumer = (t, value) -> System.out.println();

          Supplier<Integer> supplier = () -> (int) (Math.random() * 6) + 1;
     }
}
