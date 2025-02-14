package com.example.collections.listinterface.reversealist;

import java.util.List;

public class ReverseAList {
    public List<Integer> reverseArrayList(List<Integer> arraylist){
        int i=0 , j=arraylist.size()-1;
        while (i<j){
            int temp=arraylist.get(i);
            arraylist.set(i, arraylist.get(j));
            arraylist.set(j , temp);
            i++;
            j--;
        }
      return arraylist;
    }
    public List<Integer> reverseLinkedList(List<Integer> linkedList){
        int i=0 , j=linkedList.size()-1;
        while (i<j){
            int temp=linkedList.get(i);
            linkedList.set(i, linkedList.get(j));
            linkedList.set(j , temp);
            i++;
            j--;
        }
        return linkedList;
    }
}
