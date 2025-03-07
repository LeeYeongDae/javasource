package extend;

public class AccountEx {
     public static void main(String[] args) {
          // CheckAccount cAccount = new CheckAccount("111", "str", 10000, "143");

          // System.out.println(cAccount.getAno());
          // System.out.println(cAccount.getOwner());
          // System.out.println(cAccount.getBalance());
          // System.out.println(cAccount.getCardNo());

          // try {
          // System.out.println(cAccount.pay("143", 5000));
          // } catch (Exception ex) {
          // ex.printStackTrace();
          // }

          // CreditLineAccount crAcc = new CreditLineAccount("112", "오너", 100000,
          // 100000000);
          // System.out.println(crAcc);
          // try {
          // crAcc.withdraw(200000);
          // System.out.println(crAcc.getBalance());
          // } catch (Exception e) {
          // e.printStackTrace();
          // }
          // BonusPointAccount bpAcc = new BonusPointAccount("114", "오너", 100000, 0);
          // System.out.println(bpAcc);
          // bpAcc.deposit(20000);
          // System.out.println(bpAcc.getBalance());
          // System.out.println(bpAcc.getBonusPoint());

          CheckingTrafficAccount ctAcc = new CheckingTrafficAccount("115", "이름", 1000000, "543", true);
          try {

               System.out.println(ctAcc.payTrafficCard("543", 5000));
          } catch (Exception e) {
               e.printStackTrace();
          }
     }
}
