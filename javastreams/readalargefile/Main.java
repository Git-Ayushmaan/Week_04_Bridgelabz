package com.example.javastreams.readalargefile;
public class Main {
    public static void main(String[] args) {
        String fileName = "D:\\Capgemini\\errordoc.txt";
        LargeFileReader object=new LargeFileReader();
        object.readLargeFiles(fileName);
    }
}