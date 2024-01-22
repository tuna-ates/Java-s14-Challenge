package com.Burger;

import java.util.Objects;

public class Hamburger {
    private String name;
    private  String meat;
    private  BreadRollType breadRollType;

    private double price;

    private String addition1Name;

    private double addition1Price;

    private String addition2Name;

    private double addition2Price;
    private String addition3Name;

    private double addition3Price;
    private String addition4Name;

    private double addition4Price;


    public Hamburger(String name, String meat, BreadRollType breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(BreadRollType breadRollType) {
        this.breadRollType = breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name=addition1Name;
    }
    public void addHamburgerAddition2(String addition2Name,double addition2Price){
        this.addition2Name=addition2Name;
    }
    public void addHamburgerAddition3(String addition3Name,double addition3Price){
        this.addition3Name=addition3Name;
    }
    public void addHamburgerAddition4(String addition4Name,double addition4Price){
        this.addition4Name=addition4Name;
    }

    public double itemizeHamburger(){
        System.out.println("Name: "+getName());
        System.out.println("Meat: "+getMeat());
        System.out.println("BreadRollType: "+getBreadRollType());
        System.out.println("add1: "+this.addition1Name);
        System.out.println("add2: "+this.addition2Name);
        System.out.println("add3: "+this.addition3Name);
        System.out.println("add4: "+this.addition4Name);

        double result1 =this.price+this.addition1Price+this.addition2Price
                +this.addition3Price+this.addition4Price;
        System.out.println("Price: "+result1);
        return result1;

    }

    @java.lang.Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", breadRollType='" + breadRollType + '\'' +
                ", price=" + price +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Hamburger hamburger = (Hamburger) object;
        return Objects.equals(name, hamburger.name);
    }

}
