package extend;

public class BonusPointAccount extends Account {

     private int bonusPoint;

     public BonusPointAccount(String ano, String owner, int balance, int bonusPoint) {
          super(ano, owner, balance);
          this.bonusPoint = bonusPoint;
     }

     public int getBonusPoint() {
          return bonusPoint;
     }

     public void setBonusPoint(int bonusPoint) {
          this.bonusPoint = bonusPoint;
     }

     @Override
     void deposit(int money) {
          super.deposit(money);
          setBonusPoint(bonusPoint + (int) (money * 0.01));
     }

}
