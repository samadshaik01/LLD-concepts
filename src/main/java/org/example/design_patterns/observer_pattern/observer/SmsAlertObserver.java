package org.example.design_patterns.observer_pattern.observer;

public class SmsAlertObserver implements NotificationAlertObserver{
    @Override
    public void update() {
        sendSmsAlert();
    }

    private void sendSmsAlert() {
        System.out.println("SMS alert sent to customer");
    }
}
