package com.example.javagenerics.smartwarehousemanagementsystem;

public class Main {
    public static void main(String[] args) {
        Groceries groceries = new Groceries("Lauki", 70, "30 feb 2025");
        Furniture furniture = new Furniture("Sofa", 2, "wooden");
        Electronics electronics = new Electronics("Fan", 2, "Havells");
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.add(groceries);
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.add(furniture);
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.add(electronics);
        furnitureStorage.displayAll(furnitureStorage.getList());
        groceriesStorage.displayAll(groceriesStorage.getList());
        electronicsStorage.displayAll(electronicsStorage.getList());
    }
}
