package com.example.javastreams.readuserinputfromconsole;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        UserInfo userInfo = userInput.getUserInfo();

        if (userInfo != null) {
            FileHandler fileHandler = new FileHandler();
            fileHandler.saveToFile(userInfo, "D:\\Capgemini\\userInfo.txt");
        }
    }
}
