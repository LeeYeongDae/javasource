package extend;

public class SubString extends ListString {

     String name = "임꺽정";

     @Override
     public void list() {
          // super.list();
          System.out.println(name + " 자식 클래스명");
     }

     public void print() {
          super.list();
          list();
     }

}
