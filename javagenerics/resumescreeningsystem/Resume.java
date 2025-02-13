package com.example.javagenerics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Resume<T extends JobRole> {
    List <T>list;

    public Resume() {
        list = new ArrayList<>();
    }
    public void add (T items){
        list.add(items);
    }

    public List<T> getList() {
        return list;
    }
    public void displayAll(List<? extends JobRole> list){
        for (JobRole resume:list){
            resume.diplayInfo();
        }
    }
}
