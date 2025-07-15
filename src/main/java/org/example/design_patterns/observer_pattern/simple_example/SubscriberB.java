package org.example.design_patterns.observer_pattern.simple_example;

public class SubscriberB implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("Subscriber B received message: " + message.getContent());
    }
}
