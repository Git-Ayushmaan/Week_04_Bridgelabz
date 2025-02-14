package com.example.collections.listinterface.removeduplicate;

import java.util.ArrayList;
import java.util.List;

public class RevomeDuplicate {
    public List remove(List<Integer> arrayList){
        ArrayList<Integer> newList=new ArrayList<>();
        for (int element: arrayList) {
            if(! newList.contains(element)){
                newList.add(element);
            }
        }
        return newList;
    }
}
