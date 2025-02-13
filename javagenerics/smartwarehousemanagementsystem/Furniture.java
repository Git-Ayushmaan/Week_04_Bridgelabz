package com.example.javagenerics.smartwarehousemanagementsystem;

public class Furniture extends WarehouseItem {

    public String material;

    public Furniture(String name, int quantity, String material) {
        super(name, quantity);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name:" + getName() + ", Quantity:" + getQuantity() + ", Material:" + getMaterial());
    }
}
