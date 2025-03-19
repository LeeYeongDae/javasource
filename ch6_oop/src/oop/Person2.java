package oop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString // ToString 메서드
@AllArgsConstructor // 전체 생성자
@NoArgsConstructor // default 생성자
@RequiredArgsConstructor
@Getter // Getter

public class Person2 {

     @Setter // 해당 멤버변수만 Setter
     private String pno;
     @NonNull
     private String name;
     private String tel;
}
