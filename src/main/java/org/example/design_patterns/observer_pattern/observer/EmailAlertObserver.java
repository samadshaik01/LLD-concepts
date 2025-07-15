package org.example.design_patterns.observer_pattern.observer;



public class EmailAlertObserver implements NotificationAlertObserver {

    @Override
    public void update() {
        snedEmailAlert();
    }

    private void snedEmailAlert() {
        System.out.println("Email alert sent to customer");
    }
}
