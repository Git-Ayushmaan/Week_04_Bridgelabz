package com.example.javagenerics.resumescreeningsystem;

public class DataScientist extends JobRole {

    public DataScientist(String name, String jobRole) {
        super(name, jobRole);
    }

    @Override
    public void diplayInfo() {
        System.out.println("Name:" + getName() + ", JobRole:" + getJobRole());
    }
}
