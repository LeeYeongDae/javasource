package emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EMPMain {
     public static void main(String[] args) {
          boolean run = true;
          Scanner sc = new Scanner(System.in);
          int empNo = 0;
          int result = 0;
          EMPDAO eDao = new EMPDAO();
          EMPDTO eDto = new EMPDTO();

          while (run) {
               System.out.println("=====================================");
               System.out.println("1. 입력");
               System.out.println("2. 수정");
               System.out.println("3. 삭제");
               System.out.println("4. 전체조회");
               System.out.println("5. 특정사원 조회");
               System.out.println("6. 종료");
               System.out.println("=====================================");

               System.out.print("메뉴>> ");
               int menu = Integer.parseInt(sc.nextLine());

               switch (menu) {
                    case 1:
                         eDto = insertInfo(sc);
                         result = eDao.insert(eDto);
                         System.out.println(result > 0 ? "입력성공" : "입력실패");
                         break;
                    case 2:
                         eDto = updateInfo(sc);
                         result = eDao.update(eDto);
                         System.out.println(result > 0 ? "수정성공" : "수정실패");
                         break;
                    case 3:
                         empNo = deleteInfo(sc);
                         result = eDao.delete(empNo);
                         System.out.println(result > 0 ? "삭제성공" : "삭제실패");
                         break;
                    case 4:
                         List<EMPDTO> list = eDao.select();
                         empPrint(list);
                         break;
                    case 5:
                         empNo = getRow(sc);
                         eDto = eDao.select(empNo);
                         System.out.println(eDto);
                         break;
                    case 6:
                         run = false;
                         break;
                    default:
                         break;
               }
          }
     }

     public static int getRow(Scanner sc) {
          System.out.print("조회 대상 empNo >> ");
          int empNo = Integer.parseInt(sc.nextLine());
          return empNo;
     }

     public static void empPrint(List<EMPDTO> list) {
          System.out.println("==============================================================");
          System.out.println("사번  이름 직무 매니저번호     입사일    급여 수당 부서번호");
          System.out.println("==============================================================");
          for (EMPDTO empdto : list) {
               System.out.println(empdto.getEmpNo() + "\t");
               System.out.println(empdto.getEName() + "\t");
               System.out.println(empdto.getJob() + "\t");
               System.out.println(empdto.getMgr() + "\t");
               System.out.println(empdto.getHireDate() + "\t");
               System.out.println(empdto.getSal() + "\t");
               System.out.println(empdto.getComm() + "\t");
               System.out.println(empdto.getDeptNo() + "\t");
          }
     }

     public static EMPDTO updateInfo(Scanner s) {
          System.out.print("수정 대상 empNo >> ");
          int empNo = Integer.parseInt(s.nextLine());
          System.out.print("변경 급여 >> ");
          int sal = Integer.parseInt(s.nextLine());

          EMPDTO eDto = EMPDTO.builder().empNo(empNo).sal(sal).build();
          return eDto;
     }

     public static int deleteInfo(Scanner s) {
          System.out.print("삭제 대상 empNo >> ");
          int empNo = Integer.parseInt(s.nextLine());
          return empNo;
     }

     public static EMPDTO insertInfo(Scanner scanner) {
          // 새로운 사원 정보 입력
          System.out.print("사번 >> ");
          int empNo = Integer.parseInt(scanner.nextLine());
          System.out.print("이름 >> ");
          String eName = scanner.nextLine();
          System.out.print("직무 >> ");
          String job = scanner.nextLine();
          System.out.print("매니저번호 >> ");
          int mgr = Integer.parseInt(scanner.nextLine());
          System.out.print("입사일 >> ");
          String hireDate = scanner.nextLine();
          System.out.print("급여 >> ");
          int sal = Integer.parseInt(scanner.nextLine());
          System.out.print("수당 >> ");
          int comm = Integer.parseInt(scanner.nextLine());
          System.out.print("부서번호 >> ");
          int deptNo = Integer.parseInt(scanner.nextLine());

          Date date = null;
          try {
               date = new SimpleDateFormat("yyyy-MM-dd").parse(hireDate);
          } catch (ParseException e) {
               e.printStackTrace();
          }
          return new EMPDTO(empNo, eName, job, mgr, hireDate, sal, comm, deptNo);
     }
}
