package com.example.javagenerics.resumescreeningsystem;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer(String name, String jobRole) {
        super(name, jobRole);
    }

    @Override
    public void diplayInfo() {
        System.out.println("Name:"+getName()+", JobRole:"+getJobRole());
    }
}
