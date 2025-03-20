package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
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
          System.out.println(supplier.get());

          IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
          System.out.println(intSupplier.getAsInt());

          Predicate<String> predicate = (s) -> s.length() == 0;
          if(predicate.test("")) System.out.println("빈 입니다.");

          //짝수 홀수 판단
          Predicate<Integer> predicate1 = (i) -> i%2 == 0;
          System.out.println(predicate1.test((int) (Math.random() * 10))?"짝수":"홀수");

          Function<Integer, String> f = (i) -> String.valueOf(i);
          System.out.println(f.apply((int) (Math.random() * 10)));

          BiFunction<Integer, Integer, Integer> f2 = (i, i2) -> i+i2;
          System.out.println(f2.apply(5, 75));
     }
}
