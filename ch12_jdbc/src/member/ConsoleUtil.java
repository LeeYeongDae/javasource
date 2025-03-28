package member;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {
     MemberDAO mDao;
     int result = 0;

     public String memberDeleteInfo(Scanner sc) {
          System.out.println("======회원 삭제======");
          System.out.print("아이디 >> ");
          String delId = sc.nextLine();
          return delId;
     }

     public String memberGetInfo(Scanner sc) {
          System.out.println("======회원 조회======");
          System.out.print("아이디 >> ");
          String selId = sc.nextLine();
          return selId;
     }

     public MemberDTO memberInsertInfo(Scanner sc) {
          System.out.println();
          MemberDTO mDto = new MemberDTO();
          System.out.println("======회원 생성======");
          System.out.print("아이디 >> ");
          mDto.setId(sc.nextLine());
          System.out.print("이름 >> ");
          mDto.setName(sc.nextLine());
          System.out.print("주소 >> ");
          mDto.setAddr(sc.nextLine());
          System.out.print("이메일 >> ");
          mDto.setEmail(sc.nextLine());
          System.out.print("나이 >> ");
          mDto.setAge(Integer.parseInt(sc.nextLine()));

          return mDto;
     }

     public void printSeccessMessage(int result) {
          System.out.println(result > 0 ? "성공" : "실패");
     }

     public void printUpdateSeccessMessage(int result, String id) {
          System.out.println(result > 0 ? id + "정보를 수정하였습니다." : id + "정보 수정에 실패하였습니다.");
     }

     public MemberDTO memberUpdateMenu(Scanner sc) {
          System.out.println("======== 회원 정보 수정 =========");
          System.out.println("1. 주소 수정");
          System.out.println("2. 이메일 수정");
          System.out.println("=================================");
          System.out.print("번호 >> ");
          int no = Integer.parseInt(sc.nextLine());

          if (no == 1) {
               // no == 1 memberUpdateAddr() 호출
               return memberUpdateAddr(sc);

          } else if (no == 2) {
               // no == 2 memberUpdateEmail() 호출
               return memberUpdateEmail(sc);
          }

          // 리턴받은 DTO 를 리턴
          return null;
     }

     public MemberDTO memberUpdateAddr(Scanner sc) {
          // 수정할 값 입력(id,변경할 addr) => DTO 에 담은 후 리턴
          System.out.println("===== 수정 정보 입력 =======");
          System.out.print("아이디 >> ");
          MemberDTO memberDTO = new MemberDTO();
          memberDTO.setId(sc.nextLine());
          System.out.print("변경주소 >> ");
          memberDTO.setAddr(sc.nextLine());
          return memberDTO;
     }

     public MemberDTO memberUpdateEmail(Scanner sc) {
          // 수정할 값 입력(id, 변경할 email) => DTO 에 담은 후 리턴
          System.out.println("===== 수정 정보 입력 =======");
          System.out.print("아이디 >> ");
          MemberDTO memberDTO = new MemberDTO();
          memberDTO.setId(sc.nextLine());
          System.out.print("변경이메일 >> ");
          memberDTO.setEmail(sc.nextLine());
          return memberDTO;
     }

     public void memberPrint(List<MemberDTO> list) {
          System.out.println("===============================================");
          System.out.println("번호      아이디    이름    주소 이메일    나이");
          System.out.println("===============================================");
          for (MemberDTO mdto : list) {
               System.out.print(mdto.getNo() + "\t");
               System.out.print(mdto.getId() + "\t");
               System.out.print(mdto.getName() + "\t");
               System.out.print(mdto.getAddr() + "\t");
               System.out.print(mdto.getEmail() + "\t");
               System.out.println(mdto.getAge() + "\t");
          }
     }

}
