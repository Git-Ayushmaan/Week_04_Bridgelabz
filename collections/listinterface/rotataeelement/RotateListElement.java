package com.example.collections.listinterface.rotataeelement;

import java.util.List;

public class RotateListElement {
    public List rotate(List<Integer> arrayList , int position){
        for (int i = 0; i <position ; i++) {
           int temp=arrayList.get(0);
           arrayList.remove(0);
           arrayList.add(temp);
        }
        return arrayList;
    }
}
