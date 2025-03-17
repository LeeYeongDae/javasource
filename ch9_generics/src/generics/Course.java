package generics;

import java.util.ArrayList;
import java.util.List;

public class Course<T> {
     private String name;
     private List<T> students;

     public Course(String name, int cap) {
          this.name = name;
          this.students = new ArrayList<>(cap);
     }

     public static void main(String[] args) {

     }

     public void add(T t) {
          this.students.add(t);
     }

     public String getName() {
          return name;
     }

     public List<T> getStudents() {
          return students;
     }

}

class CourseEx {
     public static void main(String[] args) {
          Course<HighStudent> hiCourse = new Course<HighStudent>("강고딩", 10);
          registerCourseStudent(hiCourse);
     }

     static void registerCourse(Course<?> course) {
          System.out.println(course.getName() + " " + course.getStudents());
     }

     static void registerCourseStudent(Course<? extends Student> course) {
          System.out.println(course.getName() + " " + course.getStudents());
     }

     static void registerCourseWorker(Course<? super Worker> course) {
          System.out.println(course.getName() + " " + course.getStudents());
     }
}
