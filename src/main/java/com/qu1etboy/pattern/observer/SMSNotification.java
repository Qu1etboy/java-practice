package com.qu1etboy.pattern.observer;

import java.beans.PropertyChangeEvent;

public class SMSNotification implements Notifcation {

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        System.out.println("Sent new review to merchant via SMS (" + propertyChangeEvent.getNewValue() + ")");
    }
}
