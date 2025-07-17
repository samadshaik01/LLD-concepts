package org.example.practice.observer_dp;

public class SubscriberTwo implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("subscribertwo " + message.getContent());
    }
}
