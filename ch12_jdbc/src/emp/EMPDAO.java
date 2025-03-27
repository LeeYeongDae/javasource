package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EMPDAO {
     private Connection con;
     private PreparedStatement pstmt;
     private ResultSet rs;

     static {
          try {
               Class.forName("oracle.jdbc.OracleDriver");
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
     }

     public Connection getConnection() {
          String url = "jdbc:oracle:thin:@localhost:1521:xe";
          String user = "scott";
          String password = "tiger";

          try {
               con = DriverManager.getConnection(url, user, password);
          } catch (SQLException e) {
               e.printStackTrace();
          }
          return con;
     }

     public void close(Connection con, PreparedStatement pstmt) {
          try {
               con.close();
               pstmt.close();
          } catch (SQLException e) {
               e.printStackTrace();
          }
     }

     public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
          try {
               rs.close();
               pstmt.close();
               con.close();
          } catch (SQLException e) {
               e.printStackTrace();
          }
     }

     public int insert(EMPDTO eDto) {
          con = getConnection();
          int result = 0;
          try {
               String sql = "insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm, deptno)";
               sql += "values(?,?,?,?,?,?,?,?)";
               pstmt = con.prepareStatement(sql);
               pstmt.setInt(1, eDto.getEmpNo());
               pstmt.setString(2, eDto.getEName());
               pstmt.setString(3, eDto.getJob());
               pstmt.setInt(4, eDto.getMgr());
               pstmt.setString(5, eDto.getHireDate());
               pstmt.setInt(6, eDto.getSal());
               pstmt.setInt(7, eDto.getComm());
               pstmt.setInt(8, eDto.getDeptNo());

               result = pstmt.executeUpdate();
          } catch (Exception e) {
               e.printStackTrace();
          } finally {
               close(con, pstmt);
          }
          return result;
     }

     public int update(EMPDTO eDto) {
          con = getConnection();
          int result = 0;
          try {
               String sql = "UPDATE emp_temp SET sal = ? WHERE empno=?";
               pstmt = con.prepareStatement(sql);
               pstmt.setInt(1, eDto.getSal());
               pstmt.setInt(2, eDto.getEmpNo());

               result = pstmt.executeUpdate();

          } catch (Exception e) {
               e.printStackTrace();
          } finally {
               close(con, pstmt);
          }
          return result;
     }

     public int delete(int empNo) {
          con = getConnection();
          String sql = "delete from emp_temp where empno=?";
          int result = 0;
          try {
               pstmt = con.prepareStatement(sql);

               pstmt.setInt(1, empNo);
               result = pstmt.executeUpdate();
          } catch (SQLException e) {
               e.printStackTrace();
          } finally {
               close(con, pstmt);
          }

          return result;
     }
}
