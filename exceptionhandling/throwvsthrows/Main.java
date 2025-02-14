package com.example.exceptionhandling.throwvsthrows;

public class Main {
    public static void main(String[] args) {
        double amount1 = 1000;
        double rate1 = 5;
        int years1 = 2;

        double amount2 = -500;
        double rate2 = 3;
        int years2 = 1;

        try {
            double interest1 = InterestCalculator.calculateInterest(amount1, rate1, years1);
            System.out.println("Calculated Interest: " + interest1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            double interest2 = InterestCalculator.calculateInterest(amount2, rate2, years2);
            System.out.println("Calculated Interest: " + interest2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}