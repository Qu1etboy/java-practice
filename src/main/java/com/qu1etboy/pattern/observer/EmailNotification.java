package com.qu1etboy.pattern.observer;

import java.beans.PropertyChangeEvent;

public class EmailNotification implements Notifcation {

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        System.out.println("Sent new review to merchant via email (" + propertyChangeEvent.getNewValue() + ")");
    }
}
