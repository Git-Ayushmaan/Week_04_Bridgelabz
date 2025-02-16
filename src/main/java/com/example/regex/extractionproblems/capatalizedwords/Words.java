package com.example.regex.extractionproblems.capatalizedwords;


import java.util.regex.*;

public class Words {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex = "[A-Z][a-z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Matched : " + matcher.group());
        }
    }
}
