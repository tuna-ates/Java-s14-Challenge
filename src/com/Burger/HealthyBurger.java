package com.Burger;

public class HealthyBurger  extends Hamburger{
    private String healthyExtra1Name;
    private  double healthyExtra1Price;
    private String healthyExtra2Name;

    private double healthyExtra2Price;


    public HealthyBurger(String name, String meat, BreadRollType breadRollType, double price) {
        super(name, meat, breadRollType, price);
    }

    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name=healthyExtra1Name;
        this.healthyExtra1Price=healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name,double healthyExtra2Price){
        this.healthyExtra2Name=healthyExtra2Name;
        this.healthyExtra2Price=healthyExtra2Price;
    }

    @java.lang.Override
    public double itemizeHamburger() {
        System.out.println("Name: "+super.getName());
        System.out.println("Meat: "+super.getMeat());
        System.out.println("BreadRollType: "+super.getBreadRollType());
        System.out.println("add1: "+super.getAddition1Name());
        System.out.println("add2: "+super.getAddition2Name());
        System.out.println("add3: "+this.getAddition3Name());
        System.out.println("add4: "+this.getAddition4Name());
        System.out.println("addHealthy1: "+this.getHealthyExtra1Name());
        System.out.println("addHealthy2: "+this.getHealthyExtra2Name());

        double result1 =super.getPrice()+this.healthyExtra1Price+this.healthyExtra2Price;

        System.out.println("Price: "+result1);
        return result1;
    }
}
