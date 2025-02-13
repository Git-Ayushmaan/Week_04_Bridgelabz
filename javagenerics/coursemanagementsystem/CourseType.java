package com.example.javagenerics.coursemanagementsystem;

abstract public class CourseType {
    private String courseName;
    private int duration;
    private double price;

    public CourseType(String courseName, int duration, double price) {
        this.courseName = courseName;
        this.duration = duration;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract void displayInfo();
}
