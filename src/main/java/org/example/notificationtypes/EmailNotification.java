package org.example.notificationtypes;

import org.example.interfaces.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: '" + message + "'");
    }
}
