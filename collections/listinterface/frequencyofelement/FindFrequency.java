package com.example.collections.listinterface.frequencyofelement;

import java.util.HashMap;
import java.util.List;

public class FindFrequency {
    public HashMap findFrequency(List<String> arrayList) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String element : arrayList) {
            if (hashMap.containsKey(element)) {
                hashMap.put(element, hashMap.get(element)+1);
            } else hashMap.put(element, 1);
        }
        return hashMap;
    }
    }