package org.example.notificationtypes;

import org.example.interfaces.Notification;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification: '" + message + "'");
    }
}
