package poly;

public class ChildEx {
     public static void main(String[] args) {
          Child child1 = new Child();
          Parent parent = new Child();

          parent.method1();
          child1.method2();

          Child child2 = (Child) parent;
          child2.method3();

          // java.lang.ClassCastException: class poly.Parent
          Parent parent2 = new Parent();
          child2 = (Child) parent2;
          child2.method3();
     }
}
