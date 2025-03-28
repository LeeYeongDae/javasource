package member;

import java.util.List;
import java.util.Scanner;

public class MemberMain {
     public static void main(String[] args) {
          boolean run = true;
          Scanner sc = new Scanner(System.in);
          ConsoleUtil util = new ConsoleUtil();
          MemberDAO mDao = new MemberDAO();
          MemberDTO mDto = null;

          while (run) {
               System.out.println("=====================================");
               System.out.println("1. 추가");
               System.out.println("2. 수정");
               System.out.println("3. 삭제");
               System.out.println("4. 조회");
               System.out.println("5. 전체조회");
               System.out.println("6. 종료");
               System.out.println("=====================================");

               System.out.print("메뉴>> ");
               int menu = Integer.parseInt(sc.nextLine());

               switch (menu) {
                    case 1:
                         mDto = util.memberInsertInfo(sc);
                         int result = mDao.insert(mDto);
                         util.printSeccessMessage(result);
                         break;
                    case 2:
                         mDto = util.memberUpdateMenu(sc);
                         result = mDao.update(mDto);
                         util.printUpdateSeccessMessage(result, mDto.getId());
                         break;
                    case 3:
                         String mId = util.memberDeleteInfo(sc);
                         result = mDao.delete(mId);
                         util.printSeccessMessage(result);
                         break;
                    case 4:
                         mId = util.memberGetInfo(sc);
                         mDto = mDao.select(mId);
                         System.out.println(mDto);
                         break;
                    case 5:
                         List<MemberDTO> list = mDao.select();
                         if (list != null)
                              util.memberPrint(list);
                         break;
                    case 6:
                         run = false;
                         break;
                    default:
                         break;
               }
          }
     }
}
