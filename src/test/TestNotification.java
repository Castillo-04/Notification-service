package test;

import classes.Notification;
import classes.EmailNotification;
import classes.SmsNotification;
import classes.PushNotification;
import service.NotificationService;

public class TestNotification {
    public static void main(String[] args) {
        try {
            Notification[] notifications = {

                    new EmailNotification("jonathan@gmail.com", "Bienvenido", "Gracias por registrarte"),
                    new SmsNotification("5512345678", "Su codigo es 4704"),
                    new PushNotification("qwert0987", "Nuevas promociones"),
                    new PushNotification("Pao78797", "Nuevas promociones"),
                    // new PushNotification("", "Nuevas promociones")  
            };
            NotificationService service = new NotificationService();
            service.process(notifications);
            service.showSummary();
        } catch (IllegalArgumentException  e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
