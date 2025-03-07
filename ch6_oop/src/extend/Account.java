package extend;

public class Account {

     private String ano;
     private String owner;
     private int balance;

     public Account() {
     }

     public Account(String ano, String owner, int balance) {
          this.ano = ano;
          this.balance = balance;
          this.owner = owner;
     }

     void deposit(int money) {
          balance += money;
     }

     void withdraw(int money) throws Exception {
          if (balance < money) {
               throw new Exception("출금할 금액이 잔고 금액보다 많습니다.");
          }
          balance -= money;
     }

     void print() {
          System.out.println("현재 잔액 : " + balance);
     }

     @Override
     public String toString() {
          return "[계좌번호: " + ano + ", 계좌주: " + owner + ", 잔액: " + balance + "]";
     }

     public String getAno() {
          return ano;
     }

     public String getOwner() {
          return owner;
     }

     public int getBalance() {
          return balance;
     }

     public void setBalance(int balance) {
          this.balance = balance;
     }

}
