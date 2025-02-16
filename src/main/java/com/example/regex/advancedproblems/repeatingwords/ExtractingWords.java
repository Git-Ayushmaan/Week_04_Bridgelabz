package com.example.regex.advancedproblems.repeatingwords;


import java.util.regex.*;
public class ExtractingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        text = text.toLowerCase();
        String regex = "\\b(\\w+)\\s+\\1\\b";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {
            System.out.println("Repeated Word: " + matcher.group(1));
        }
    }
}

