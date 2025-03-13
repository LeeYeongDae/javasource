package api.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx {
     public static void main(String[] args) {
          LocalDateTime now = LocalDateTime.now();
          System.out.println(now); // 2025-03-13T14:39:52.824385700

          LocalDate date = LocalDate.now();
          System.out.println(date); // 2025-03-13
          System.out.println(date.getYear());
          System.out.println(date.getMonth()); // MARCH 열거형 출력
          System.out.println(date.getDayOfMonth());
          System.out.println(date.plusDays(1));

          LocalTime time = LocalTime.now();
          System.out.println(time); // 14:39:52.825385400
          System.out.println(time.getHour());
          System.out.println(time.getMinute());
          System.out.println(time.getSecond());
          System.out.println(time.minusHours(5));
     }
}
