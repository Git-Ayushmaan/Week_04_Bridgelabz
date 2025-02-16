package com.example.regex.replaceandmodifystrings.censorbadwords;

import java.util.HashSet;

public class CensorBadWords {
    public static void main(String[] args) {
        String sentence = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid", "idiot"};

        HashSet<String> badWordSet = new HashSet<>();
        for (String word : badWords) {
            badWordSet.add(word.toLowerCase());
        }

        StringBuilder result = new StringBuilder();
        for (String word : sentence.split(" ")) {
            if (badWordSet.contains(word.toLowerCase())) {
                result.append("**** ");
            } else {
                result.append(word).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }
}
