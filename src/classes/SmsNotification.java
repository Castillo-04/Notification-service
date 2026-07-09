package classes;

public record SmsNotification(String phoneNumber, String message) implements Notification {

    public SmsNotification {
        /*
         * Todo: Preguntar si es necesario validar el numero de telefono con el numero
         * de caracteres puedes usar .lenght() != 10 pero si quieres usar regex puedes
         * usar matches("\\d{10}") para validar que sean 10 digitos en uno validas que
         * sea de 10 caracteres y en otro 10 numeros nada mas
         */
        boolean esInvalido = (phoneNumber == null || phoneNumber.matches("\\d{10}") == false);
        if (esInvalido) {
            throw new IllegalArgumentException("El numero telefonico debe contener exactamente 10 numeros");

        }

    }

}
