package DesignPatterns.StrategyPattern;

public class Main{
    public static void main(String[] args) {
        Vehicle vehicle = new RegularVehicle();
        vehicle.showDrive();
        Vehicle s = new SuperVehicle();
        s.showDrive();
    }
}