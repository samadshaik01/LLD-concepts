package org.example.practice.observer_dp;

public class SubscriberOne implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("subscriberOne " + message.getContent());
    }
}

