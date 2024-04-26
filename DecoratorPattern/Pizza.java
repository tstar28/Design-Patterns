package DesignPatterns.DecoratorPattern;

import DesignPatterns.DecoratorPattern.Base.CrunchyBase;
import DesignPatterns.DecoratorPattern.Base.PizzaBase;
import DesignPatterns.DecoratorPattern.Toppings.Capcicum;
import DesignPatterns.DecoratorPattern.Toppings.Onion;

public class Pizza {
    public static void main(String[] args) {
        PizzaBase pizza = new Capcicum(new Onion(new CrunchyBase()));
        System.out.println(pizza.cost());
    }
}
