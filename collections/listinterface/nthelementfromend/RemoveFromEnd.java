package com.example.collections.listinterface.nthelementfromend;

import java.util.LinkedList;

public class RemoveFromEnd {
    public LinkedList removeFromEnd(LinkedList<Integer> linkedList , int position){
        linkedList.remove(linkedList.size()-position);
        return linkedList;
    }
}
