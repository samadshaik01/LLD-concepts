package org.example.practice.observer_dp;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> list = new ArrayList<>();

    void add(Observer observer) {
        list.add(observer);
    }

    void remove(Observer observer) {
        list.remove(observer);
    }

    void notify(Message message) {
        for (Observer ob : list) {
            ob.update(message);
        }
    }
}
