package oop;

public class Account {

     String ano;
     String owner;
     long balance;

     public Account() {
     }

     public Account(String ano, String owner, long balance) {
          this.ano = ano;
          this.balance = balance;
          this.owner = owner;
     }

     void deposit(long money) {
          balance += money;
     }

     void withdraw(long money) {
          balance -= money;
     }

     void print() {
          System.out.println("현재 잔액 : " + balance);
     }

     @Override
     public String toString() {
          return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
     }

}
