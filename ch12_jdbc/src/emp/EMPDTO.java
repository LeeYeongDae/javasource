package emp;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class EMPDTO {
     private int empNo;
     private String eName;
     private String job;
     private int mgr;
     private String hireDate;
     private int sal;
     private int comm;
     private int deptNo;

     public EMPDTO() {
     }

     public EMPDTO(int empNo, String eName, String job, int mgr, String hireDate, int sal, int comm, int deptNo) {
          this.comm = comm;
          this.deptNo = deptNo;
          this.eName = eName;
          this.empNo = empNo;
          this.hireDate = hireDate;
          this.job = job;
          this.mgr = mgr;
          this.sal = sal;
     }

     public int getEmpNo() {
          return empNo;
     }

     public void setEmpNo(int empNo) {
          this.empNo = empNo;
     }

     public String getEName() {
          return eName;
     }

     public void setEName(String eName) {
          this.eName = eName;
     }

     public String getJob() {
          return job;
     }

     public void setJob(String job) {
          this.job = job;
     }

     public int getMgr() {
          return mgr;
     }

     public void setMgr(int mgr) {
          this.mgr = mgr;
     }

     public String getHireDate() {
          return hireDate;
     }

     public void setHireDate(String hireDate) {
          this.hireDate = hireDate;
     }

     public int getSal() {
          return sal;
     }

     public void setSal(int sal) {
          this.sal = sal;
     }

     public int getComm() {
          return comm;
     }

     public void setComm(int comm) {
          this.comm = comm;
     }

     public int getDeptNo() {
          return deptNo;
     }

     public void setDeptNo(int deptNo) {
          this.deptNo = deptNo;
     }
}