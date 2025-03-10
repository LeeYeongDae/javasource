package poly;

public class CEO extends Employee {

     @Override
     public void work() {
          System.out.println(getName() + " " + getPosition() + "(이)가 일 중");
     }
}

class PartTime extends Employee {

     @Override
     public void work() {
          System.out.println(getName() + " " + getPosition() + "(이)가 단타치기로 일 중");
     }

}

class Admin extends Employee {

     @Override
     public void work() {
          System.out.println(getName() + " " + getPosition() + "(이)가 내 앞길이라 일 중");
     }
}
