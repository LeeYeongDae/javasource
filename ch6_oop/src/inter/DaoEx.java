package inter;

interface DataAccessObject {
     public void select();

     public void insert();

     public void update();

     public void delete();
}

class OracleDao implements DataAccessObject {

     @Override
     public void select() {
          System.out.println("Oracle 선택");
     }

     @Override
     public void insert() {
          System.out.println("Oracle 삽입");
     }

     @Override
     public void update() {
          System.out.println("Oracle 갱신");
     }

     @Override
     public void delete() {
          System.out.println("Oracle 삭제");
     }

}

class MySqlDao implements DataAccessObject {

     @Override
     public void select() {
          System.out.println("MySql 선택");
     }

     @Override
     public void insert() {
          System.out.println("MySql 삽입");
     }

     @Override
     public void update() {
          System.out.println("MySql 갱신");
     }

     @Override
     public void delete() {
          System.out.println("MySql 삭제");
     }
}

public class DaoEx {

     public static void main(String[] args) {
          dbWork(new OracleDao());
          dbWork(new MySqlDao());
     }

     static void dbWork(DataAccessObject dao) {
          dao.select();
          dao.insert();
          dao.update();
          dao.delete();
     }
}
