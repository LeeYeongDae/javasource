package extend;

public class CheckingTrafficAccount extends CheckAccount {
     private boolean hasTraffic;

     public CheckingTrafficAccount(String ano, String owner, int balance, String cardNo, boolean hasTraffic) {
          super(ano, owner, balance, cardNo);
          this.hasTraffic = hasTraffic;
     }

     public boolean isHasTraffic() {
          return hasTraffic;
     }

     int payTrafficCard(String cardNo, int amount) throws Exception {
          if (!hasTraffic) {
               throw new Exception("교통카드 기능 없음");
          }
          return pay(cardNo, amount);
     }

}
