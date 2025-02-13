package com.example.javagenerics.smartwarehousemanagementsystem;

import java.sql.Struct;

public class Electronics extends WarehouseItem {

    private String brand;

    public Electronics(String name, int quantity, String brand) {
        super(name, quantity);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name:" + getName() + ", Quantity:" + getQuantity() + ", Brand:" + getBrand());
    }
}
