package org.example;

public class SpaceDeleter {
    public void changingSpace(String text) {
        String pattern = "\\s+";

        String newText = text.replaceAll(pattern, " ");
        System.out.println(newText);
    }
}
