package DesignPatterns.ObserverPattern.Observable;

import DesignPatterns.ObserverPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservalbe implements Observable{
    List<Observer> list = new ArrayList<>();
    int iphoneStock;
    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void setData(int data) {
        iphoneStock = data;
        notifyObservers();
    }

    @Override
    public int getData() {
        return iphoneStock;
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:list){
            observer.update();
        }
    }
}
