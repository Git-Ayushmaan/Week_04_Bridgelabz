package com.example.regex.extractionproblems.extractinglinks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebPage {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info." ;
        String regex ="https?://[a-zA-Z0-9.-]+(?:\\.[a-zA-Z]{2,})+(?:/[a-zA-Z0-9._~:/?#[\\\\]@!$&'()*+,;=-]*)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Matched links : " + matcher.group());
        }
    }
}
