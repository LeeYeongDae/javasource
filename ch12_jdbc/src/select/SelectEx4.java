package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx4 {
     public static void main(String[] args) {
          Connection con = null;
          PreparedStatement pstmt = null;
          ResultSet rs = null;

          try {
               Class.forName("oracle.jdbc.OracleDriver");
               String url = "jdbc:oracle:thin:@localhost:1521:xe";
               String user = "scott";
               String password = "tiger";

               con = DriverManager.getConnection(url, user, password);

               if (con != null) {
                    System.out.println("\n Connected");

                    String sql = "select e.EMPNO, e.DEPTNO, e.SAL, d.DNAME, d.LOC ";
                    sql += "FROM EMP e, DEPT d ";
                    sql += "WHERE e.DEPTNO = d.DEPTNO and e.SAL <= 2500 AND e.EMPNO <= 9999";
                    pstmt = con.prepareStatement(sql);

                    rs = pstmt.executeQuery();

                    while (rs.next()) {
                         int empno = rs.getInt(1);
                         String deptno = rs.getString("DEPTNO");
                         int sal = rs.getInt("SAL");
                         String dname = rs.getString("DNAME");
                         String loc = rs.getString("LOC");

                         System.out.println(empno + " " + deptno + " " + sal + " " + dname + " " + loc);

                    }
               }
          } catch (Exception e) {
               e.printStackTrace();
          }
     }
}
