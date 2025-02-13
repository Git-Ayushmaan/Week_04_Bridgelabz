package com.example.javagenerics.resumescreeningsystem;

public abstract class JobRole {
    private String name;
    private String jobRole;

    public JobRole(String name, String jobRole) {
        this.name = name;
        this.jobRole = jobRole;
    }

    public String getName() {
        return name;
    }

    public String getJobRole() {
        return jobRole;
    }

    public abstract void diplayInfo();
}
