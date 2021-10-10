package com.isg.consumers;
import com.isg.common.CoffeeMakerWork;
import com.isg.common.CoffeeRecipe;

public class User extends Thread{
    private CoffeeMakerWork coffeeMakerWork;
    private String name;
    private CoffeeRecipe drinks;

    public User(String name, CoffeeMakerWork coffeeMakerWork, CoffeeRecipe drinks){
        super();
        this.coffeeMakerWork=coffeeMakerWork;
        this.name=name;
        this.drinks=drinks;
        start();
    }

    @Override
    public void run(){
        synchronized (coffeeMakerWork){
            System.out.println("Користувач "+name+" доступився до кавомашини ");
            //викликаємо роботу кавомашини
            if(coffeeMakerWork.do_drink(drinks)){
                System.out.println("Користувачеві "+name+" вдалося отримати напій ");
                System.out.println();
            }else {
                System.out.println("Користувачеві "+name+" не вдалося отримати напій ");
                System.out.println();
            }
        }
    }
}
