package org.example.design_patterns.observer_pattern.simple_example;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notify(Message message);
}
