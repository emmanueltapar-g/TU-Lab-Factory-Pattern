package org.example.notificationcreators;

import org.example.interfaces.Notification;
import org.example.model.NotificationCreator;
import org.example.notificationtypes.SmsNotification;

public class SmsCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
