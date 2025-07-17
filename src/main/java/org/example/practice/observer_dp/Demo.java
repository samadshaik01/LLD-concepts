package org.example.practice.observer_dp;

public class Demo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.add(new SubscriberOne());
        subject.add(new SubscriberTwo());

        subject.notify(new Message("hello subscribers"));
    }
}
