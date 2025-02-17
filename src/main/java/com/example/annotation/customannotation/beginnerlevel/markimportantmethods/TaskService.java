package com.example.annotation.customannotation.beginnerlevel.markimportantmethods;
public class TaskService {

    @annotation.customannotation.beginnerlevel.markimportantmethods.ImportantMethod(level = "HIGH")
    public void importantTaskOne() {}

    @annotation.customannotation.beginnerlevel.markimportantmethods.ImportantMethod(level = "MEDIUM")
    public void importantTaskTwo() {}

    public void normalTask() {}
}

