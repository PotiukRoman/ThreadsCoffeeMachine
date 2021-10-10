package com.isg;

import com.isg.common.CoffeeMaker;
import com.isg.common.CoffeeMakerWork;
import com.isg.common.CoffeeRecipe;
import com.isg.consumers.User;

public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker=new CoffeeMaker();
        CoffeeMakerWork coffeeMakerWork= new CoffeeMakerWork(coffeeMaker);
        Thread user1=new User("Ivan",coffeeMakerWork, CoffeeRecipe.AMERICANO);
        Thread user2=new User("Yuriy",coffeeMakerWork,CoffeeRecipe.ESPRESSO);
        Thread user3=new User("Pavlo",coffeeMakerWork,CoffeeRecipe.CAPPUCCINO);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        coffeeMakerWork.showInfo();
    }
}
