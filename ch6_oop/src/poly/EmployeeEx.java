package poly;

public class EmployeeEx {
     public static void main(String[] args) {
          Employee em = new Employee();
          em.setName("김씨");
          em.setPosition("사원");
          doWork(em);

          em = new CEO();
          em.setName("박씨");
          em.setPosition("대표");
          doWork(em);

          em = new PartTime();
          em.setName("조씨");
          em.setPosition("기간제");
          doWork(em);

          em = new Admin();
          em.setName("이씨");
          em.setPosition("관리자");
          doWork(em);
     }

     static void doWork(Employee em) {
          em.work();
     }
}
