package com.example.javastreams.readandwritetextfile;

public class Main {
    public static void main(String[] args) {
        ReadAndWrite fileHandler = new ReadAndWrite();
        String sourceFile = "D:\\Capgemini\\source.txt";
        String destinationFile = "D:\\Capgemini\\destination.txt";
        fileHandler.copyFile(sourceFile, destinationFile);
    }
}
