package com.example.collections.setinterface.unionandintersection;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    public Set findUinion(Set<Integer> set1 , Set<Integer> set2){
        Set<Integer> set = new HashSet<>();
        for (int elements: set1) {
            set.add(elements);
        }
        for (int elements: set2) {
            set.add(elements);
        }
        return set;
    }
    public int findInterSection(Set<Integer> set1 , Set<Integer> set2){
        int intersection = -1;
        for (int elements: set1) {
            if(set2.contains(elements)) {
                intersection=elements;
                break;
            }
        }

        return intersection;
    }
}
