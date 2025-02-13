package com.example.javagenerics.coursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private List<T> list;

    public Course() {
        list = new ArrayList<>();
    }

    public void add(T courses) {
        list.add(courses);
    }

    public List<T> getList() {
        return list;
    }

    public void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayInfo();
        }
    }
}
