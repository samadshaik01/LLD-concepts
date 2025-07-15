package org.example.design_patterns.observer_pattern.simple_example;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {
    private final List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notify(Message message) {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}
