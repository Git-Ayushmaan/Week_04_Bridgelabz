package com.example.javagenerics.smartwarehousemanagementsystem;

public class Groceries extends WarehouseItem {

    private String expiryDate;

    public Groceries(String name, int quantity, String expiryDate) {
        super(name, quantity);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name:" + getName() + ", Quantity:" + getQuantity() + ", expiryDate:" + getExpiryDate());
    }
}
