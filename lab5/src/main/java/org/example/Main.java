
package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Phone number validation
        PhoneNumberValidation phoneNumberValidation = new PhoneNumberValidation();
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("(+380)50-333-33-33");
        phoneNumbers.add("(+380)63-123-45-67");
        phoneNumbers.add("(+380)99-876-54-32");
        phoneNumbers.add("(+380)55-123-45-67");
        phoneNumbers.add("(+380)78-987-65-43");
        for(String phoneNumber : phoneNumbers){
            phoneNumberValidation.validatePhoneNumber(phoneNumber);
        }
        System.out.println();

        //Space deleting
        String text = "Я хочу    бути     програмістом";
        SpaceDeleter spaceDeleter = new SpaceDeleter();
        spaceDeleter.changingSpace(text);
        System.out.println();

        //Html tegs deleter
        String htmlText = "<div><p>Символи круглих дужок <code>'('</code> та <code>')'</code>. <br />Ці символи\n" +
                "дозволяють отримати з рядка додаткову інформацію.\n" +
                "<br/>Зазвичай, якщо парсер регулярних виразів шукає в тексті інформацію\n" +
                "за заданим виразом і знаходить її - він просто повертає\n" +
                "знайдений рядок.</p>\n" +
                "<p align=\"right\">А ось тут <a href=\"google.com\">посилання</a>, щоб життя медом не здавалося.</p></div>";
        HtmlTegsDeleter htmlTegsDeleter =   new HtmlTegsDeleter();
        htmlTegsDeleter.deleteHtmlTegs(htmlText);





    }
}