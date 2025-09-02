package org.example.notificationcreators;

import org.example.interfaces.Notification;
import org.example.model.NotificationCreator;
import org.example.notificationtypes.EmailNotification;

public class EmailCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
