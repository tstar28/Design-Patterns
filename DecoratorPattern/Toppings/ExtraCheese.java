package DesignPatterns.DecoratorPattern.Toppings;

import DesignPatterns.DecoratorPattern.Base.PizzaBase;

public class ExtraCheese implements PizzaBase {
    PizzaBase base;
    public ExtraCheese(){

    }
    public ExtraCheese(PizzaBase base){
        this.base = base;
    }
    @Override
    public int cost() {
        if(this.base==null) return 50;
        return this.base.cost() + 50;
    }
}
