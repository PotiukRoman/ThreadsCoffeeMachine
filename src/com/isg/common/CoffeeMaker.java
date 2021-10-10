package com.isg.common;

public class CoffeeMaker {
    double waterMaxVolume=1;
    int coffeeBeansMaxVolume=20;
    double milkMaxVolume=1;

    double currentWaterLevel;
    int currentCoffeeBeansNumber;
    double currentMilkLevel;

    public CoffeeMaker(){
        this.currentWaterLevel=waterMaxVolume;
        this.currentCoffeeBeansNumber=coffeeBeansMaxVolume;
        this.currentMilkLevel=milkMaxVolume;
    }

    public double getWaterMaxVolume() {
        return waterMaxVolume;
    }

    public int getCoffeeBeansMaxVolume() {
        return coffeeBeansMaxVolume;
    }

    public double getMilkMaxVolume() {
        return milkMaxVolume;
    }

    public double getCurrentWaterLevel() {
        return currentWaterLevel;

    }

    public void setCurrentWaterLevel(double portion) {
        this.currentWaterLevel -= portion;

    }

    public int getCurrentCoffeeBeansNumber() {
        return currentCoffeeBeansNumber;

    }

    public void setCurrentCoffeeBeansNumber(int CoffeeBeansNumber) {
        this.currentCoffeeBeansNumber -= CoffeeBeansNumber;

    }

    public double getCurrentMilkLevel() {
        return currentMilkLevel;

    }

    public void setCurrentMilkLevel(double portion) {
        this.currentMilkLevel -= portion;

    }
}
