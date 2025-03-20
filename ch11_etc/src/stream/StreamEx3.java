package stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx3 {
     public static void main(String[] args) {
          List<Member> members = Arrays.asList(
                    new Member("이름", Sex.FEMALE, 20),
                    new Member("이름", Sex.MALE, 30),
                    new Member("이름", Sex.FEMALE, 25),
                    new Member("이름", Sex.MALE, 24),
                    new Member("이름", Sex.MALE, 27));
          int ages = 0, cnt = 0;
          for (Member member : members) {
               if (member.getSex() == Sex.MALE) {
                    ages += member.getAge();
                    cnt++;
               }
          }
          System.out.println("남자 나이 평균 : " + ages / cnt);
          double ageAvg = members.stream()
                    .filter((member) -> member.getSex() == Sex.MALE)
                    .mapToInt(Member::getAge)
                    .average()
                    .getAsDouble();
          System.out.println("남자 나이 평균 : " + ageAvg);
     }
}
