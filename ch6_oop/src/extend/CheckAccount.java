package extend;

public class CheckAccount extends Account {
     private String cardNo;

     public CheckAccount() {
          super();
     }

     public CheckAccount(String ano, String owner, int balance, String cardNo) {
          super(ano, owner, balance);
          this.cardNo = cardNo;
     }

     int pay(String card, int amount) throws Exception {
          if (!cardNo.equals(card) || getBalance() < amount) {
               throw new Exception("카드번호나 잔액 확인");
          } else {
               withdraw(amount);
          }
          return getBalance();
     }

     public String getCardNo() {
          return cardNo;
     }

     public void setCardNo(String cardNo) {
          this.cardNo = cardNo;
     }

}
