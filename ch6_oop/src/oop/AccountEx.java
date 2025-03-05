package oop;

public class AccountEx {
     public static void main(String[] args) {
          Account account = new Account("352-11", "유명한", 100000);

          account.deposit(200000);
          account.print();

          account.withdraw(150000);
          account.print();
     }
}
