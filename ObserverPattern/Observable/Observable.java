package DesignPatterns.ObserverPattern.Observable;

import DesignPatterns.ObserverPattern.Observer.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void setData(int data);
    int getData();
    void notifyObservers();
}

