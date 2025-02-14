package com.example.collections.setinterface.checkequals;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        do{
            System.out.println("Press 1 to add element in FirstSet and 0 to exit");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter element");
                int element=sc.nextInt();
                set1.add(element);
            }else{
                System.out.println("======================");
                break;
            }
        }while (true);

        do{
            System.out.println("Press 1 to add element in Secound Set and 0 to exit");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter element");
                int element=sc.nextInt();
                set2.add(element);
            }else break;
        }while (true);
        CheckElementsOfSet checkElementsOfSet= new CheckElementsOfSet();
        System.out.println("Set 1 is "+set1);
        System.out.println("Set 2 is "+set2);
        System.out.println("Is the elements of both the set are equals1 : "+checkElementsOfSet.chcekElements(set1 , set2));
    }
}
