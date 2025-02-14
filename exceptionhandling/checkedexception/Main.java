package com.example.exceptionhandling.checkedexception;

public class Main {
    public static void main(String[] args) {
        String fileName = "D:\\Capgemini\\source.txt";
        FileProcessor processor = new FileProcessor();
        processor.readFile(fileName);
    }
}
