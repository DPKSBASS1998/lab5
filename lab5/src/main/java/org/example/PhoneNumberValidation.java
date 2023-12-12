package org.example;
import java.util.regex.*;
public class PhoneNumberValidation {
    public void validatePhoneNumber(String text) {
        String pattern = "^\\(\\+380\\)(50|63|66|67|68|96|97|98|99)-\\d{3}-\\d{2}-\\d{2}";

        if (Pattern.matches(pattern, text)) {
            System.out.println("Номер є валідним.");
        } else {
            System.out.println("Номер не є валідним.");
        }
    }
}
