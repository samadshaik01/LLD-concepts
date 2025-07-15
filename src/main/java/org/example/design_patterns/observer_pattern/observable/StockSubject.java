package org.example.design_patterns.observer_pattern.observable;

import org.example.design_patterns.observer_pattern.observer.NotificationAlertObserver;

public interface StockSubject {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifyObservers();
    public void setStockCount(int stockCount);
    public int getStockCount();

}
