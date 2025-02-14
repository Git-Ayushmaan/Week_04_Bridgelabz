package com.example.exceptionhandling.exceptionpropagation;

public class Main {
    public static void main(String[] args) {
        ExceptionClass ec = new ExceptionClass();
        try {
            ec.method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
