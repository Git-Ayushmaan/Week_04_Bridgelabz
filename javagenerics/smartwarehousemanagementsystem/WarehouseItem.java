package com.example.javagenerics.smartwarehousemanagementsystem;

public abstract class WarehouseItem {
    private String name;
    private int quantity;

    public WarehouseItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract void displayInfo();
}
