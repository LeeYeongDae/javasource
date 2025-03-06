package oop;

public class SingletonEx {
    public static void main(String[] args) {
        Singleton sgt = Singleton.getInstance();
        Singleton sgt2 = Singleton.getInstance();
        System.out.println(sgt == sgt2 ? "같음" : "다름");

        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s143", "짭", 1, 54, "010-5342-2355", "ser@gafwf.net");
        System.out.println(student1 == student2 ? "같음" : "다름");
    }
}
