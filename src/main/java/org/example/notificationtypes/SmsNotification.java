package org.example.notificationtypes;

import org.example.interfaces.Notification;

public class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: '" + message + "'");
    }
}
