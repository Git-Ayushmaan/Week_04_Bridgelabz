package com.example.collections.setinterface.findsubset;

import java.util.HashSet;
import java.util.Set;

public class IsSubset {
    public boolean isASubset(Set<Integer> set1 , Set<Integer> set2){
        boolean isSubset=true;
        for (int elements: set1) {
            if(!set2.contains(elements)) {
                isSubset=false;
            }
        }
        return isSubset;
    }
}
