package com.example.laitest;

public class ElectricThing {

    private String name;
    private int rate;
    private int peoPle;
    private int newPrice;
    private int imageThing;
    private int reducePercent;

    public ElectricThing(String name, int rate, int peoPle, int newPrice, int imageThing, int reducePercent) {
        this.name = name;
        this.rate = rate;
        this.peoPle = peoPle;
        this.newPrice = newPrice;
        this.imageThing = imageThing;
        this.reducePercent = reducePercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getPeoPle() {
        return peoPle;
    }

    public void setPeoPle(int peoPle) {
        this.peoPle = peoPle;
    }

    public int getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(int newPrice) {
        this.newPrice = newPrice;
    }

    public int getImageThing() {
        return imageThing;
    }

    public void setImageThing(int imageThing) {
        this.imageThing = imageThing;
    }

    public int getReducePercent() {
        return reducePercent;
    }

    public void setReducePercent(int reducePercent) {
        this.reducePercent = reducePercent;
    }
}
