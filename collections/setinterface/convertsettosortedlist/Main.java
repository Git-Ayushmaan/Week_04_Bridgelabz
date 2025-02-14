package com.example.collections.setinterface.convertsettosortedlist;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Set<Integer> set1 = new HashSet<>();
            do {
                System.out.println("Press 1 to add element in FirstSet and 0 to exit");
                int choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("Enter element");
                    int element = sc.nextInt();
                    set1.add(element);
                } else {
                    System.out.println("======================");
                    break;
                }
            } while (true);
        System.out.println("The set is  " + set1);
        ConvertSetToSOrtedList convertSetToSOrtedList= new ConvertSetToSOrtedList();
        System.out.println("The sorted List is  "+convertSetToSOrtedList.convert(set1));

    }
}
