package com.example.regex.advancedproblems.creditcardvalidator;

public class CreditCard {
    public static void main(String[] args) {
        String visa1 = "4123456789012345";
        String visa2 = "412345678901";
        String master1 = "5123456789012345";
        String master2 = "6123456789012345";
        String invalid = "1234567890123456";

        System.out.println(visa1 + " -> " + isValidCreditCard(visa1));
        System.out.println(visa2 + " -> " + isValidCreditCard(visa2));
        System.out.println(master1 + " -> " + isValidCreditCard(master1));
        System.out.println(master2 + " -> " + isValidCreditCard(master2));
        System.out.println(invalid + " -> " + isValidCreditCard(invalid));
    }

    public static boolean isValidCreditCard(String cardNumber) {
        String cardPattern = "^(4\\d{15}|5\\d{15})$";
        return cardNumber.matches(cardPattern);
    }
}

