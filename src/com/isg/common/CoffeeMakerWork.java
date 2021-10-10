package com.isg.common;

public class CoffeeMakerWork {
    CoffeeMaker coffeeMaker;

    public CoffeeMakerWork(CoffeeMaker coffeeMaker){
        this.coffeeMaker=coffeeMaker;

    }

    public boolean is_enough_water(CoffeeRecipe drinks){
        return coffeeMaker.getCurrentWaterLevel()>=drinks.water;

    }

    public boolean is_enough_coffee(CoffeeRecipe drinks){
        return coffeeMaker.getCurrentCoffeeBeansNumber()>=drinks.coffee;

    }

    public boolean is_enough_milk(CoffeeRecipe drinks){
        return coffeeMaker.getCurrentMilkLevel()>=drinks.milk;

    }

    public double waterConsumed(){
        return coffeeMaker.getWaterMaxVolume()-coffeeMaker.getCurrentWaterLevel();

    }

    public int coffeeConsumed(){
        return coffeeMaker.getCoffeeBeansMaxVolume()-coffeeMaker.getCurrentCoffeeBeansNumber();

    }

    public double milkConsumed(){
        return coffeeMaker.getMilkMaxVolume()-coffeeMaker.getCurrentMilkLevel();

    }

    public void showInfo(){
        System.out.println();
        System.out.printf("Спожито води: %.2f   Залишилося води: %.2f%n",waterConsumed(), coffeeMaker.getCurrentWaterLevel());
        System.out.printf("Спожито кави: %d   Залишилося кави: %d%n",coffeeConsumed(), coffeeMaker.getCurrentCoffeeBeansNumber());
        System.out.printf("Спожито молока: %.2f   Залишилося молока: %.2f%n",milkConsumed(), coffeeMaker.getCurrentMilkLevel());
    }

    public boolean do_drink(CoffeeRecipe drinks){
        if(is_enough_water(drinks)&&is_enough_coffee(drinks)&&is_enough_milk(drinks)){
            System.out.println("Кавомашина починає готувати "+ drinks);
            coffeeMaker.setCurrentWaterLevel(drinks.water);
            coffeeMaker.setCurrentCoffeeBeansNumber(drinks.coffee);
            coffeeMaker.setCurrentMilkLevel(drinks.milk);
            System.out.println("Кава Готова");
            return true;
        }
        System.out.println("Бракує інгредієнтів");
        return false;
    }
}
