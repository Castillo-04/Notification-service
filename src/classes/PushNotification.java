package classes;

public record PushNotification(String token, String message) implements Notification {

    public PushNotification {
        boolean esInvalido = (token == null || token.isBlank());
        if (esInvalido) {
            throw new IllegalArgumentException("El token del dispositivo no puede quedar vacio");

        }

    }

}
