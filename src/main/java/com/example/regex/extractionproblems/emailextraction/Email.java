package com.example.regex.extractionproblems.emailextraction;


import java.util.regex.*;
public class Email {
    public static void main(String[] args) {
            String email = "Contact us at support@example.com and info@company.org";
            //String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
            String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,})+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            while (matcher.find()){
                System.out.println("Matched : "+matcher.group());
            }
    }
}
