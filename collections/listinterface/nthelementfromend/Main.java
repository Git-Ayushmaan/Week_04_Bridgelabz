package com.example.collections.listinterface.nthelementfromend;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LinkedList<Integer> linkedList= new LinkedList<>();
        do{
            System.out.println("Press 1 to add element in linkedList and 0 to exit");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter element");
                int element=sc.nextInt();
                linkedList.add(element);
            }else break;
        }while (true);
        System.out.println("Enter position which you want to remove ");
        int position= sc.nextInt();
        RemoveFromEnd removeFromEnd= new RemoveFromEnd();
        System.out.println("Original List is "+linkedList);
        System.out.println("After removing the List is " + removeFromEnd.removeFromEnd(linkedList , position));
    }
}