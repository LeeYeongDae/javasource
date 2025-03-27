package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertEx1 {
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

               String sql = "insert into dept_temp(deptno, dname, loc) values(10, 'ACCOUNTING', 'NEW YORK')";
               pstmt = con.prepareStatement(sql);

               int result = pstmt.executeUpdate();
               System.out.println(result);

          } catch (Exception e) {
               e.printStackTrace();
          } finally {
               try {
                    con.close();
                    pstmt.close();
                    rs.close();
               } catch (Exception e) {
                    e.printStackTrace();
               }
          }
     }
}
