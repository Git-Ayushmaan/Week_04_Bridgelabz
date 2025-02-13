package com.example.javagenerics.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    List<T> list;

    public Storage() {
        list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void add(T items) {
        list.add(items);
    }

    public void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayInfo();
        }

    }
}
