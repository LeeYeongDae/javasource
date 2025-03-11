package shop;

public class MyShopEx {
    public static void main(String[] args) {
        IShop shop = new MyShop();

        shop.setTitle("MyShop");

        shop.genUser(new User("길삼", PayType.CARD));
        shop.genUser(new User("길사", PayType.CASH));

        shop.genProduct(new CellPhone("Fold3", 400000, "KT"));
        shop.genProduct(new CellPhone("S24", 300000, "SKT"));
        shop.genProduct(new Tv("LG 울트라 HD", 800000, "4K"));
        shop.genProduct(new Tv("삼성 QLED", 2000000, "QLED"));
        shop.genProduct(new CellPhone("Flip5", 600000, "LG"));

        shop.start();
    }
}
