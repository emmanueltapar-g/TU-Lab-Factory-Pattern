package org.example.app;

import org.example.model.NotificationCreator;
import org.example.notificationcreators.EmailCreator;
import org.example.notificationcreators.PushCreator;
import org.example.notificationcreators.SmsCreator;

public class Main {
    public static void main(String[] args) {
        // To send an email, we use the EmailCreator factory
        NotificationCreator emailCreator = new EmailCreator();
        emailCreator.sendNotification("Welcome! Your account is ready.");

        // To send an SMS, we use the SmsCreator factory
        NotificationCreator smsCreator = new SmsCreator();
        smsCreator.sendNotification("Your security code is 4712.");

        NotificationCreator pushNotifCreator = new PushCreator();
        pushNotifCreator.sendNotification("You have a new request.");
    }
}