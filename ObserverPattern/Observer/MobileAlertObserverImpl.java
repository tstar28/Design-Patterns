package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.IphoneObservalbe;
import DesignPatterns.ObserverPattern.Observable.Observable;

public class MobileAlertObserverImpl implements Observer{
    Observable observable;
    int mobileNumber;
    public MobileAlertObserverImpl(int mobileNumber, Observable observable){
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendNotification();
    }

    private void sendNotification() {
        System.out.println("sending notification through mobile stock update "+ observable.getData());
    }
}
