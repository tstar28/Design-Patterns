package DesignPatterns.StrategyPattern;

class Vehicle{
    Drive obj;
    Vehicle(Drive drive){
        this.obj = drive;
    }
    void showDrive(){
        obj.drive();
    }
}
