package com.example.exceptionhandling.customexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        VoteChecker voteChecker = new VoteChecker();

        System.out.print("Enter your age: ");
        int age = kb.nextInt();

        try {
            voteChecker.validateAge(age);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        } finally {
            kb.close();
        }
    }
}
