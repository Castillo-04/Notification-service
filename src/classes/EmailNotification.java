package classes;

public record EmailNotification(String email, String subject, String message) implements Notification {

    public EmailNotification {
        boolean esInvalido = (email == null || !email.contains("@"));
        if (esInvalido) {
            throw new IllegalArgumentException("El correo no es valido");
        }
    }

}
