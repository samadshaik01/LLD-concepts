package org.example.design_patterns.observer_pattern.simple_example;

public class Demo {
    public static void main(String[] args) {
        //thumbrule : Subject-->Publisher ,Observer-->Subscriber1,Subscriber2
        Publisher publisher = new Publisher();

        Observer subscriberA = new SubscriberA();
        Observer subscriberB = new SubscriberB();

        publisher.attach(subscriberA);
        publisher.attach(subscriberB);

        Message message = new Message("Hello, Subscribers!");
        publisher.notify(message);

        publisher.detach(subscriberA);
        Message message2 = new Message("Goodbye, Subscribers!");
        publisher.notify(message2);
    }
}
