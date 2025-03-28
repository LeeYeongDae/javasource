package member;

import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

// ~~~DTO : Data Transfer Object - 메소드에서 데이터를 담아서 전달하는 객체
// ~~~DAO : Data Access Object - DB 작업을 모아놓은 객체

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
     private int no;
     private String id;
     private String name;
     private String addr;
     private String email;
     private int age;

     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getAddr() {
          return addr;
     }

     public void setAddr(String addr) {
          this.addr = addr;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public int getNo() {
          return no;
     }

     public void setNo(int no) {
          this.no = no;
     }

}