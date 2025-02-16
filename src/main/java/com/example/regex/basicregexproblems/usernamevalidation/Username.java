package com.example.regex.basicregexproblems.usernamevalidation;


import java.util.Scanner;
import java.util.regex.*;


public class Username {
    public static void main(String[] args) {
        do {
            Scanner kb = new Scanner(System.in);
            int choice;
            System.out.println("Press 1 to check the validity of your username and 0 to stop");
            choice = kb.nextInt();
            if (choice == 1) {
                System.out.println("Enter Username:");
                String username = kb.next();
                String regex = "^[a-zA-z][a-zA-Z0-9_]{5,15}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(username);
                if (matcher.matches()) {
                    System.out.println("The username is valid.");
                } else {
                    System.out.println("Invalid Username");
                }
            } else {
                System.out.println("exit.");
                break;
            }
        } while (true);
    }
}

