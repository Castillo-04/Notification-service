  
package classes;

public class Main {
    public static void main(String[] args) {
        Notification[] notifications = new Notification[6];


        try {
            notifications[0] = new EmailNotification("jon@gmail.com", "Bienvenido", "Hola Jon");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            notifications[1] = new SmsNotification("5533083170","");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            notifications[0] = new EmailNotification("jon@gmail.com", "Bienvenido", "Hola Jon");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            notifications[0] = new EmailNotification("jon@gmail.com", "Bienvenido", "Hola Jon");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            notifications[0] = new EmailNotification("jon@gmail.com", "Bienvenido", "Hola Jon");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            notifications[0] = new EmailNotification("jon@gmail.com", "Bienvenido", "Hola Jon");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            notifications[0] = new EmailNotification("jon@gmail.com", "Bienvenido", "Hola Jon");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}