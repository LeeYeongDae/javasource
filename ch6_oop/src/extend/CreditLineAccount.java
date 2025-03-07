package extend;

public class CreditLineAccount extends Account {

     private int creditLine;

     public CreditLineAccount(String ano, String owner, int balance, int creditLine) {
          super(ano, owner, balance);
          this.creditLine = creditLine;
     }

     @Override
     void withdraw(int money) throws Exception {
          if (super.getBalance() + this.creditLine < money) {
               throw new Exception("출금할 금액이 한도 금액보다 많습니다.");
          }
          super.setBalance(super.getBalance() - money);
          ;
     }

     @Override
     public String toString() {
          return "CreditLineAccount [creditLine=" + creditLine + ", ano =" + getAno() + ", owner =" + getOwner()
                    + ", balance =" + getBalance() + "]";
     }

}
