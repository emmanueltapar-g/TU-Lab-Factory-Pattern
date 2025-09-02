package org.example.model;

import org.example.interfaces.Notification;

public abstract class NotificationCreator {

    // This is the FACTORY METHOD. It's abstract, forcing subclasses to implement it.
    public abstract Notification createNotification();

    /**
     * This is the core business logic. It uses the factory method to get the
     * object it needs, so it's not coupled to any concrete notification class.
     */
    public void sendNotification(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}
