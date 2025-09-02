package org.example.app;

import org.example.services.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendNotification("EMAIL", "Welcome! Your account is ready.");
        service.sendNotification("SMS", "Your security code is 4712.");
    }
}