package oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString // ToString 메서드
@AllArgsConstructor // 전체 생성자
@NoArgsConstructor // default 생성자
@Getter // Getter
@Setter // 전체변수의 Setter

public class Person {
     private String pno;
     private String name;
     private String tel;

}
