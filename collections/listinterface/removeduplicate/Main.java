package com.example.collections.listinterface.removeduplicate;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> arrayList= new ArrayList<>();
        do{
            System.out.println("Press 1 to add element in arrayList  and 0 to exit");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter element");
                int element=sc.nextInt();
                arrayList.add(element);
            }else break;
        }while (true);
        RevomeDuplicate revomeDuplicate= new RevomeDuplicate();
        System.out.println("Original List is "+arrayList);
        System.out.println("After removing duplicates the  List is " + revomeDuplicate.remove(arrayList));
    }
}
