package com.example.collections.setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public Set findSymmetricDifference(Set<Integer> set1 , Set<Integer> set2){
        Set<Integer> set = new HashSet<>();
        int intersection = -1;
        for (int elements: set1) {
            if(!set2.contains(elements)) {
               set.add(elements);
            }
        }
        for (int elements: set2) {
            if(!set1.contains(elements)) {
                set.add(elements);
            }
        }

        return set;
    }
}
