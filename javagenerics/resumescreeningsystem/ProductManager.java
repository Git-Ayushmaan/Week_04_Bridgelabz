package com.example.javagenerics.resumescreeningsystem;

public class ProductManager extends JobRole {
    public ProductManager(String name, String joRole) {
        super(name, joRole);
    }

    @Override
    public void diplayInfo() {
        System.out.println("Name:" + getName() + ", JobRole:" + getJobRole());
    }

}
