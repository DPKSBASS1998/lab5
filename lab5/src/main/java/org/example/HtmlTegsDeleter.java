package org.example;

public class HtmlTegsDeleter {
    public void deleteHtmlTegs(String htmlText){
        String pattern = "<[^>]*>";
        String cleanText = htmlText.replaceAll(pattern, "");
        System.out.println(cleanText);
    }
}
