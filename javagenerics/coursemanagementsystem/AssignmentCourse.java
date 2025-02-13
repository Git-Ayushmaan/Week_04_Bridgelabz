package com.example.javagenerics.coursemanagementsystem;

public class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, int duration, double price) {
        super(courseName, duration, price);
    }
    @Override
    void displayInfo() {
        System.out.println("The name of course is "+ getCourseName()+"\nThe duration is "+getDuration()+" months.\nThe price of cousre is "+getPrice()+"\n");
    }
}
