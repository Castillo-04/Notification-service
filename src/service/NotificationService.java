package service;

import classes.EmailNotification;
import classes.PushNotification;
import classes.SmsNotification;
import classes.Notification;

public class NotificationService {
    int emailCount = 0;
    int smsCount = 0;
    int pushCount = 0;
    int total = 0;
    
    public void process(Notification[] notifications) {
        for (int i = 0; i < notifications.length; i++) {
            total++;
            switch (notifications[i]) {
                case EmailNotification e -> emailCount++;
                case SmsNotification s -> smsCount++;
                case PushNotification p -> pushCount++;
            }
          }
         }
    public void showSummary() {
        System.out.println("===== RESUMEN =====");
        System.out.println("correos enviados:" + emailCount);
        System.out.println("SMS enviados: " + smsCount);
        System.out.println("Push enviados: "+ pushCount);
        System.out.println("Total: " + total);
    }





}