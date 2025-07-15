package org.example.design_patterns.observer_pattern.observable;

import org.example.design_patterns.observer_pattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;


public class StockPublisher implements StockSubject {

    public List<NotificationAlertObserver> observersList = new ArrayList<NotificationAlertObserver>();
    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (NotificationAlertObserver observer : observersList) {
            observer.update();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0) {
            notifyObservers();
        }
        stockCount = stockCount + newStockAdded;
    }
}

