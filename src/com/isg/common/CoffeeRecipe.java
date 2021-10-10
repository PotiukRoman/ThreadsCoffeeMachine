package com.isg.common;

public enum CoffeeRecipe {
    AMERICANO(0.4,8,0.2),
    ESPRESSO(0.4,8,0.3),
    CAPPUCCINO(0.4,8,0.5);

    public double water;
    public int coffee;
    public double milk;

    CoffeeRecipe(double water,int coffee,double milk){
        this.water=water;
        this.coffee=coffee;
        this.milk=milk;
    }
}