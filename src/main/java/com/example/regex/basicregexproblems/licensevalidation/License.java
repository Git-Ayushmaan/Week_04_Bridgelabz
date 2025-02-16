package com.example.regex.basicregexproblems.licensevalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class License {
    public static void main(String[] args) {
        do {
            Scanner kb = new Scanner(System.in);
            int choice;
            System.out.println("Press 1 to check the validity of your License plate number and 0 to stop");
            choice = kb.nextInt();
            if (choice == 1) {
                System.out.println("Enter License plate number:");
                String licenseNo = kb.next();
                String regex = "^[A-Z]{2}[0-9]{4}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(licenseNo);
                if (matcher.matches()) {
                    System.out.println("The License plate number is valid.");
                } else {
                    System.out.println("Invalid License plate number");
                }
            } else {
                System.out.println("exit.");
                break;
            }
        } while (true);
    }
}
