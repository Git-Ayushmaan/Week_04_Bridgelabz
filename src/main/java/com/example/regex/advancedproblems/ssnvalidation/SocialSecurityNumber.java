package com.example.regex.advancedproblems.ssnvalidation;
import java.util.regex.*;

public class SocialSecurityNumber {
        public static void main(String[] args) {
            String text = "My SSN is 123-45-6789. Another number 123456789 is invalid.";
            String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                System.out.println("\"" + matcher.group() + "\" is valid");
            }
            String invalidRegex = "\\b\\d{9}\\b";  // Matches 9-digit numbers without hyphens
            Matcher invalidMatcher = Pattern.compile(invalidRegex).matcher(text);

            while (invalidMatcher.find()) {
                System.out.println("\"" + invalidMatcher.group() + "\" is invalid");
            }
        }
    }


