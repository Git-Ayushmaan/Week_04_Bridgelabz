package com.example.javagenerics.coursemanagementsystem;

public class Main {
    public static void main(String[] args) {
        ExamCourse examCourse1 = new ExamCourse("GATE", 20, 5000);
        ExamCourse examCourse2 = new ExamCourse("CAT", 18, 7000);
        AssignmentCourse assignmentCourse1 = new AssignmentCourse("Java", 12, 5000);
        AssignmentCourse assignmentCourse2 = new AssignmentCourse("C++", 9, 8000);
        ResearchCourse researchCourse1 = new ResearchCourse("Machine Learning", 12, 1500);
        ResearchCourse researchCourse2 = new ResearchCourse("Airtificial Intellgence", 8, 8500);
        Course<ExamCourse> examCourseCourse = new Course<>();
        examCourseCourse.add(examCourse1);
        examCourseCourse.add(examCourse2);
        Course<AssignmentCourse> assignmentCourseCourse = new Course<>();
        assignmentCourseCourse.add(assignmentCourse1);
        assignmentCourseCourse.add(assignmentCourse2);
        Course<ResearchCourse> researchCourseCourse = new Course<>();
        researchCourseCourse.add(researchCourse1);
        researchCourseCourse.add(researchCourse2);

        assignmentCourseCourse.displayAllCourses(assignmentCourseCourse.getList());
        System.out.println("====================================");
        examCourseCourse.displayAllCourses(assignmentCourseCourse.getList());
        System.out.println("====================================");
        researchCourseCourse.displayAllCourses(researchCourseCourse.getList());

    }

}
