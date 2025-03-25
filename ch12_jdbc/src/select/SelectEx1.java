package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx1 {
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
                    System.out.println("Connected");
                    String sql = "select * from emp";
                    pstmt = con.prepareStatement(sql);

                    rs = pstmt.executeQuery();

                    while (rs.next()) {
                         int empno = rs.getInt(1);
                         String ename = rs.getString("ename");
                         String job = rs.getString("job");
                         int mgr = rs.getInt("mgr");
                         String hireDate = rs.getString("hiredate");
                         int comm = rs.getInt("comm");
                         int deptno = rs.getInt("deptno");

                         System.out.println(empno + " " + ename + " " + job + " " + mgr + " " + hireDate + " " + comm
                                   + " " + deptno);

                    }
               }
          } catch (Exception e) {
               e.printStackTrace();
          }
     }
}
