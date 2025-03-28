package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
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

     public int insert(MemberDTO mDto) {
          int result = 0;
          try {
               con = getConnection();
               String sql = "insert into member(no, id, name, addr, email, age) ";
               sql += "values(member_seq_no.NEXTVAL,?,?,?,?,?)";
               pstmt = con.prepareStatement(sql);
               pstmt.setString(1, mDto.getId());
               pstmt.setString(2, mDto.getName());
               pstmt.setString(3, mDto.getAddr());
               pstmt.setString(4, mDto.getEmail());
               pstmt.setInt(5, mDto.getAge());

               result = pstmt.executeUpdate();
          } catch (Exception e) {
               e.printStackTrace();
          } finally {
               close(con, pstmt);
          }
          return result;
     }

     public int delete(String id) {

          int result = 0;
          try {
               con = getConnection();
               String sql = "delete from member where id = ?";
               pstmt = con.prepareStatement(sql);

               pstmt.setString(1, id);
               result = pstmt.executeUpdate();
          } catch (SQLException e) {
               e.printStackTrace();
          } finally {
               close(con, pstmt);
          }

          return result;
     }

     public int update(MemberDTO mDto) {
          int result = 0;
          try {
               con = getConnection();
               String sql = "update member ";
               if (mDto.getAddr() != null) {
                    sql += "set addr = ? ";
                    sql += "where id = ? ";
                    pstmt = con.prepareStatement(sql);
                    pstmt.setString(1, mDto.getAddr());
                    pstmt.setString(2, mDto.getId());
               } else {
                    sql += "set email = ? ";
                    sql += "where id = ? ";
                    pstmt = con.prepareStatement(sql);
                    pstmt.setString(1, mDto.getEmail());
                    pstmt.setString(2, mDto.getId());
               }
               result = pstmt.executeUpdate();
          } catch (Exception e) {
               e.printStackTrace();
          } finally {
               close(con, pstmt);
          }
          return result;
     }

     public MemberDTO select(String id) {
          MemberDTO mDto = null;
          try {
               con = getConnection();
               String sql = "SELECT * FROM member WHERE id=?";
               pstmt = con.prepareStatement(sql);
               pstmt.setString(1, id);
               rs = pstmt.executeQuery();
               if (rs.next()) {
                    mDto = new MemberDTO();
                    mDto.setNo(rs.getInt("no"));
                    mDto.setId(rs.getString("id"));
                    mDto.setName(rs.getString("name"));
                    mDto.setAddr(rs.getString("addr"));
                    mDto.setEmail(rs.getString("email"));
                    mDto.setAge(rs.getInt("age"));
               }
               return mDto;

          } catch (SQLException e) {
               e.printStackTrace();
          } finally {
               close(con, pstmt, rs);
          }
          return null;
     }

     public List<MemberDTO> select() {
          con = getConnection();
          List<MemberDTO> mDtos = new ArrayList<>();
          String sql = "SELECT * FROM member ";
          try {
               pstmt = con.prepareStatement(sql);
               rs = pstmt.executeQuery();
               while (rs.next()) {
                    MemberDTO mDto = new MemberDTO();
                    mDto.setNo(rs.getInt("no"));
                    mDto.setId(rs.getString("id"));
                    mDto.setName(rs.getString("name"));
                    mDto.setAddr(rs.getString("addr"));
                    mDto.setEmail(rs.getString("email"));
                    mDto.setAge(rs.getInt("age"));
                    mDtos.add(mDto);
               }

          } catch (SQLException e) {
               e.printStackTrace();
          } finally {
               close(con, pstmt, rs);
          }
          return mDtos;
     }

     void findname(){
          MemberDTO mDto = null;
          try {
               con = getConnection();
               String sql = "SELECT * FROM member WHERE name="%?%";
               pstmt = con.prepareStatement(sql);
               pstmt.setString(1, id);
               rs = pstmt.executeQuery();
               if (rs.next()) {
                    mDto = new MemberDTO();
                    mDto.setNo(rs.getInt("no"));
                    mDto.setId(rs.getString("id"));
                    mDto.setName(rs.getString("name"));
                    mDto.setAddr(rs.getString("addr"));
                    mDto.setEmail(rs.getString("email"));
                    mDto.setAge(rs.getInt("age"));
               }
               return mDto;
     }
}