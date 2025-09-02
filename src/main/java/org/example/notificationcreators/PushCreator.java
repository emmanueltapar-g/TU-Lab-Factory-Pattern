package org.example.notificationcreators;

import org.example.interfaces.Notification;
import org.example.model.NotificationCreator;
import org.example.notificationtypes.PushNotification;

public class PushCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
