package com.example.exceptionhandling.trywithresources;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "D:\\Capgemini\\info.txt";

        try {
            String firstLine = TryFileReader.readFirstLine(filePath);
            if (firstLine != null) {
                System.out.println("First line of the file: " + firstLine);
            } else {
                System.out.println("The file is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}