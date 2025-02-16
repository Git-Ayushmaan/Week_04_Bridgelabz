package com.example.regex.basicregexproblems.hexcolorcodevalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorCode {
    public static void main(String[] args) {
        do {
            Scanner kb = new Scanner(System.in);
            int choice;
            System.out.println("Press 1 to check the validity of your Hex color code and 0 to stop");
            choice = kb.nextInt();
            if(choice == 1){
                System.out.println("Enter Hex color code:");
                String hexCode = kb.next();
                String regex = "^#[A-Za-z0-9]{6}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(hexCode);
                if(matcher.matches()) {
                    System.out.println("The Hex color code is valid." );
                }else {
                    System.out.println("Invalid Hex color code");
                }
            }
            else {
                System.out.println("exit.");
                break;
            }
        }while(true);
    }
}
