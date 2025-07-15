package org.example.design_patterns.observer_pattern;

import org.example.design_patterns.observer_pattern.observable.StockPublisher;
import org.example.design_patterns.observer_pattern.observer.EmailAlertObserver;
import org.example.design_patterns.observer_pattern.observer.NotificationAlertObserver;
import org.example.design_patterns.observer_pattern.observer.SmsAlertObserver;

public class Demo {
    public static void main(String[] args) {
        StockPublisher stockPublisher = new StockPublisher();

        NotificationAlertObserver customer1 = new EmailAlertObserver();
        NotificationAlertObserver customer2 = new SmsAlertObserver();

        stockPublisher.add(customer1);
        stockPublisher.add(customer2);

        stockPublisher.notifyObservers();

        stockPublisher.setStockCount(10); // Adding stock will notify observers only if stock was previously zero



    }
}
