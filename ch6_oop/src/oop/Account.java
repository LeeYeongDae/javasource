package oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Account {

@ToString           //ToString 메서드
@AllArgsConstructor //전체 생성자
@NoArgsConstructor  //default 생성자
@Getter             //Getter
@Setter             //Setter

     private String ano;
     private String owner;
     private long balance;

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
          if (balance < money) {
               System.out.println("출금할 금액이 잔고 금액보다 많습니다.");
               return;
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

     public long getBalance() {
          return balance;
     }

}
