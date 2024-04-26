package DesignPatterns.StrategyPattern;

public class SuperVehicle extends Vehicle {
    SuperVehicle(){
        super(new SuperDrive());
    }
}
