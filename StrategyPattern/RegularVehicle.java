package DesignPatterns.StrategyPattern;

class RegularVehicle extends Vehicle{
    RegularVehicle(){
        super(new RegularDrive());
    }
}