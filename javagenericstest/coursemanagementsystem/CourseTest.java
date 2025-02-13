package com.example.javagenerics.coursemanagementsystem;

import junit.framework.TestCase;
import org.testng.annotations.Test;

import java.util.List;

public class CourseTest extends TestCase {
    @Test
    public void testAssignmentCourse(){
        Course<AssignmentCourse> c1= new Course<>();
        c1.add(new AssignmentCourse("Python" , 10 , 9000));
        List<AssignmentCourse> item=c1.getList();
        assertEquals(1 , item.size());
    }
    @Test
    public void testResearchCourse(){
        Course<ResearchCourse> r1= new Course<>();
        r1.add(new ResearchCourse("Deep Learning" , 10 , 9000));
        List<ResearchCourse> item=r1.getList();
        assertEquals(1 , item.size());
    } @Test
    public void testExamCourse(){
        Course<ExamCourse> e1= new Course<>();
        e1.add(new ExamCourse("MAT" , 10 , 9000));
        List<ExamCourse> item=e1.getList();
        assertEquals(1 , item.size());
    }


}