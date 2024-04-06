package com.qu1etboy.pattern.observer;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Review {
    private List<String> reviews;
    private PropertyChangeSupport support;

    public Review() {
        support = new PropertyChangeSupport(this);
        reviews = new ArrayList<>();
    }

    public void addPropertyChangeListener(Notifcation notifcation) {
        support.addPropertyChangeListener(notifcation);
    }

    public void removePropertyChangeListener(Notifcation notifcation) {
        support.removePropertyChangeListener(notifcation);
    }

    public void addReview(String review) {
        reviews.add(review);
        // Notify observers
        support.firePropertyChange("reviews", null, review);
    }
}
