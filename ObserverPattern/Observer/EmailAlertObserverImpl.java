package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.Observable;

public class EmailAlertObserverImpl implements Observer{
    Observable observable;
    String email;
    public EmailAlertObserverImpl(String email, Observable observable){
        this.observable = observable;
        this.email = email;
    }
    @Override
    public void update() {
        sendNotification();
    }

    private void sendNotification() {
        System.out.println("notify through email stock updated "+ observable.getData());
    }
}
