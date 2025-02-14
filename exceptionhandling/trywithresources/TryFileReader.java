package com.example.exceptionhandling.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryFileReader {

    // Method to read the first line of a file
    public static String readFirstLine(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return reader.readLine();
        }
    }
}