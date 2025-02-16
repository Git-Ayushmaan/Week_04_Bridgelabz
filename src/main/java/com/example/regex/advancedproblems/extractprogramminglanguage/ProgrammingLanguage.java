package com.example.regex.advancedproblems.extractprogramminglanguage;

import java.util.*;
import java.util.regex.*;

public class ProgrammingLanguage {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        String[] languages = {"Java", "Python", "JavaScript", "Go", "C", "C++", "C#", "Ruby", "Swift", "Kotlin", "PHP", "Rust", "TypeScript"};

        String regex = "\\b(" + String.join("|", languages) + ")\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        Set<String> foundLanguages = new LinkedHashSet<>();
        while (matcher.find()) {
            foundLanguages.add(matcher.group());
        }
        System.out.println(String.join(", ", foundLanguages));
    }
}

