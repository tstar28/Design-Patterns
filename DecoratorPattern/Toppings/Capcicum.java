package DesignPatterns.DecoratorPattern.Toppings;

import DesignPatterns.DecoratorPattern.Base.PizzaBase;

import javax.print.attribute.standard.PrinterIsAcceptingJobs;

public class Capcicum implements PizzaBase {
    PizzaBase base;
    public Capcicum(){

    }
    public Capcicum(PizzaBase base){
        this.base = base;
    }
    @Override
    public int cost() {
        if(this.base == null) return 40;
        return this.base.cost() + 40;
    }
}
