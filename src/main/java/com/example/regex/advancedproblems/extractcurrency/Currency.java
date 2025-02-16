package com.example.regex.advancedproblems.extractcurrency;

import java.util.*;
import java.util.regex.*;

public class Currency {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50. Another price is €100.00 and ₹200.";

        String regex = "\\$?€?₹?[0-9]+(\\.[0-9]{2})?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> currencyValues = new ArrayList<>();
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        System.out.println(String.join(", ", currencyValues));
    }
}
