package com.example.collections.listinterface.reversealist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> arrayList= new ArrayList<>();
        LinkedList<Integer> linkedList= new LinkedList<>();
        do{
            System.out.println("Press 1 to add element in arrayList and LinkedList and 0 to exit");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter element");
                int element=sc.nextInt();
                arrayList.add(element);
                linkedList.add(element);
            }else break;
        }while (true);
        ReverseAList reverseAList= new ReverseAList();
        System.out.println("Original Array List is "+arrayList);
        reverseAList.reverseArrayList(arrayList);
        System.out.println("Update array List is " +arrayList);
        System.out.println("Original Linked List is "+linkedList);
        reverseAList.reverseLinkedList(linkedList);
        System.out.println("Update Linked List is " +linkedList);
    }
}
