package api.object;

public class ObjectEx {
     public static void main(String[] args) {
          Object object1 = new Object();
          Object object2 = new Object();

          // 같은 주소값 확인
          // System.out.println(object1.equals(object2) ? "같음" : "다름");
          // System.out.println(object1 == object2 ? "같음" : "다름");

          System.out.println(object1.toString()); // java.lang.Object@7a81197d

          Value value1 = new Value(10);
          Value value2 = new Value(10);

          // equals 재정의 : 값 비교
          // System.out.println(value1.equals(value2) ? "같음" : "다름");

          System.out.println(value1.toString()); // api.object.Value@7

          Person p1 = new Person("noname1", "아무개");
          Person p2 = new Person("noname1", "야무개");

          System.out.println(p1.equals(p2) ? "같음" : "다름");

          System.out.println(p1.toString()); // api.object.Person@4517d9a3
     }
}
