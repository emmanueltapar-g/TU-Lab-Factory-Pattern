package org.example;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {
    @Test
    @DisplayName("Structure: NotificationCreator should be an abstract class")
    void testNotificationCreatorIsAbstract() {
        // This test uses reflection to ensure the Creator is abstract.
        assertTrue(Modifier.isAbstract(NotificationCreator.class.getModifiers()),
                "The NotificationCreator class must be abstract.");
    }

    @Test
    @DisplayName("Factory: EmailCreator should create an EmailNotification")
    void testEmailCreatorFactoryMethod() {
        // Arrange
        NotificationCreator emailCreator = new EmailCreator();

        // Act
        Notification notification = emailCreator.createNotification();

        // Assert
        assertNotNull(notification, "createNotification() should not return null.");
        assertInstanceOf(EmailNotification.class, notification,
                "EmailCreator's factory method should return an instance of EmailNotification.");
    }

    @Test
    @DisplayName("Factory: SmsCreator should create an SmsNotification")
    void testSmsCreatorFactoryMethod() {
        // Arrange
        NotificationCreator smsCreator = new SmsCreator();

        // Act
        Notification notification = smsCreator.createNotification();

        // Assert
        assertNotNull(notification, "createNotification() should not return null.");
        assertInstanceOf(SmsNotification.class, notification,
                "SmsCreator's factory method should return an instance of SmsNotification.");
    }

    @Test
    @DisplayName("Product: All notification types should implement the Notification interface")
    void testProductsImplementInterface() {
        // This test ensures the concrete products adhere to the common interface.
        assertTrue(Notification.class.isAssignableFrom(EmailNotification.class));
        assertTrue(Notification.class.isAssignableFrom(SmsNotification.class));
        // Also checks the challenge class
        assertTrue(Notification.class.isAssignableFrom(PushNotification.class));
    }

    // --- CHALLENGE TESTS ---
    // These tests validate the implementation of the "Push Notification" challenge.

    @Test
    @DisplayName("Challenge - Factory: PushCreator should create a PushNotification")
    void testPushCreatorFactoryMethod() {
        // Arrange
        NotificationCreator pushCreator = new PushCreator();

        // Act
        Notification notification = pushCreator.createNotification();

        // Assert
        assertNotNull(notification, "PushCreator's createNotification() should not be null.");
        assertInstanceOf(PushNotification.class, notification,
                "PushCreator's factory method should return an instance of PushNotification.");
    }

    @Test
    @DisplayName("Challenge - Structure: PushCreator should extend NotificationCreator")
    void testPushCreatorInheritance() {
        // This test ensures the new creator is correctly integrated into the pattern.
        assertTrue(NotificationCreator.class.isAssignableFrom(PushCreator.class),
                "PushCreator must extend the abstract NotificationCreator class.");
    }
}