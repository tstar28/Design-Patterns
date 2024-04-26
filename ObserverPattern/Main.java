package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.Observable.IphoneObservalbe;
import DesignPatterns.ObserverPattern.Observable.Observable;
import DesignPatterns.ObserverPattern.Observer.EmailAlertObserverImpl;
import DesignPatterns.ObserverPattern.Observer.MobileAlertObserverImpl;

public class Main {
    public static void main(String[] args) {
        IphoneObservalbe iphoneObservalbe = new IphoneObservalbe();
        EmailAlertObserverImpl observer1 = new EmailAlertObserverImpl("tusharsingh@gmail.com",iphoneObservalbe);
        EmailAlertObserverImpl observer2 = new EmailAlertObserverImpl("utk@gmail.com",iphoneObservalbe);
        MobileAlertObserverImpl observer3 = new MobileAlertObserverImpl(7896516,iphoneObservalbe);

        iphoneObservalbe.registerObserver(observer1);
        iphoneObservalbe.registerObserver(observer2);
        iphoneObservalbe.registerObserver(observer3);

        iphoneObservalbe.setData(10);
        iphoneObservalbe.setData(100);
    }
}
