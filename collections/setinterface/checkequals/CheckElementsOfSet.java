package com.example.collections.setinterface.checkequals;

import java.util.Set;

public class CheckElementsOfSet {
    public boolean chcekElements(Set<Integer> set1 , Set<Integer> set2){
        boolean isEquals=true;
       if(set1.size()!=set2.size()) return false;
       else{
           for (int elements: set1) {
               if(!set2.contains(elements)) return false;
           }
       }
       return isEquals;
    }
}
