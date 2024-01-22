package com.Burger;

public class DeluxeBurger extends Hamburger {

   private EkstraGift cips;
   private EkstraGift drink;

    public DeluxeBurger() {
        super("DeluxBurger", "redMeat", BreadRollType.SUSAMLI,19);
          this.cips=EkstraGift.CIPS;
          this.drink=EkstraGift.DRINK;

    }

    @java.lang.Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @java.lang.Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @java.lang.Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @java.lang.Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }


}
