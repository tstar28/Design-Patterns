package DesignPatterns.DecoratorPattern.Toppings;

import DesignPatterns.DecoratorPattern.Base.PizzaBase;

public class Onion implements PizzaBase {
    PizzaBase base;
    public Onion(PizzaBase base){
        this.base = base;
    }
    public int cost(){
        return this.base.cost() + 20;
    }
}
