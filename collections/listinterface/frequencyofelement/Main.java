package com.example.collections.listinterface.frequencyofelement;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> arrayList= new ArrayList<>();
        do{
            System.out.println("Press 1 to add element in list and 0 to exit");
            int choice=sc.nextInt();
            if(choice==1) {
                System.out.println("Enter element");
                String element = sc.next();
                arrayList.add(element);
            } else break;
        }while (true);
        FindFrequency frequency = new FindFrequency();
        Map<String,Integer> map= frequency.findFrequency(arrayList);
        System.out.println("The Frequency of elements are " +map);
    }
    }

