package org.example.design_patterns.observer_pattern.simple_example;

public class SubscriberA implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("Subscriber A received message: " + message.getContent());
    }
}
