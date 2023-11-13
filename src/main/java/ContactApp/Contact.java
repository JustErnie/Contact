package ContactApp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public record Contact(String name, String number, String email) {
    public Contact(String name, String number, String email) {
        this.name = name;

        if (validateNumber(number)) {
            this.number = number;
        } else throw new IllegalArgumentException("Wrong number format");

        if (validateEmail(email)) {
            this.email = email;
        } else throw new IllegalArgumentException("Wrong email format");
    }

    private static boolean validateNumber(String number) {
        Pattern pattern = Pattern.compile("^\\+\\d{11}$");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    private static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("^.+@.+\\.\\w{2,3}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
