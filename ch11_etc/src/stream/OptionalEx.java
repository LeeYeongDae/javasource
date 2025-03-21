package stream;

import java.util.Optional;

public class OptionalEx {
     public static void main(String[] args) {

          Optional<String> opstr = Optional.of("asdf");
          Optional<Integer> opint = opstr.map(String::length);

          System.out.println(opstr.get());
          System.out.println(opint.get());

          opstr.orElse(""); // null일 때 내용 반환
          Optional.of("").filter(x -> x.length() > 0)
                    .map(Integer::parseInt).orElse(-1);

          opint.isPresent();
          opint.ifPresent(x -> System.out.println(x));
     }
}
