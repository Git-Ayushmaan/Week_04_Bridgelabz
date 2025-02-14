package com.example.collections.setinterface.convertsettosortedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ConvertSetToSOrtedList {
    public List<Integer> convert(Set<Integer> set){
        List<Integer> arrayList= new ArrayList<>();
        for (int element:set) {
            if(arrayList.size()==0) arrayList.add(0, element);
            else {
                int i = arrayList.size() - 1;
                while (arrayList.get(i) > element && i > 0) {
                    i--;
                }
                if (arrayList.get(i) > element) {
                    arrayList.add(i, element);
                }
                else if(arrayList.get(i) < element) {
                    arrayList.add(i+1, element);
                }
                }
            }
        return arrayList;
    }
}
