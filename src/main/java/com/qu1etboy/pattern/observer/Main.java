package com.qu1etboy.pattern.observer;

public class Main {
    public static void main(String[] args) {
        Review review = new Review();
        review.addPropertyChangeListener(new EmailNotification());
        review.addPropertyChangeListener(new SMSNotification());

        review.addReview("Super good!");
        review.addReview("I love it. 10/10!!!");
    }
}
