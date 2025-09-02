package org.example.services;

import org.example.notificationtypes.EmailNotification;
import org.example.notificationtypes.SmsNotification;
import org.example.interfaces.Notification;

public class NotificationService {
    public void sendNotification(String channel, String message) {
        Notification notification;
        if (channel.equalsIgnoreCase("EMAIL")) {
            notification = new EmailNotification();
        } else if (channel.equalsIgnoreCase("SMS")) {
            notification = new SmsNotification();
        } else {
            throw new IllegalArgumentException("Unknown channel " + channel);
        }
        notification.send(message);
    }
}
