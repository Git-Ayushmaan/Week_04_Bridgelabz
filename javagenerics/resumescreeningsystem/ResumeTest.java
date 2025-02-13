package com.example.javagenerics.resumescreeningsystem;

import static org.junit.jupiter.api.Assertions.*;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class ResumeTest extends TestCase {
    @Test
    public void testDataScientist(){
        Resume<DataScientist> dataScientistResume=new Resume<>();
        dataScientistResume.add(new DataScientist("Sweta Agrawal","Data Scientist"));
        List<DataScientist> items=dataScientistResume.getList();
        assertEquals(1,items.size());
    }
    @Test
    public void testSoftwareEngineer(){
        Resume<SoftwareEngineer> softwareEngineerResume=new Resume<>();
        softwareEngineerResume.add(new SoftwareEngineer("Sweta Agrawal","Data Scientist"));
        List<SoftwareEngineer> items=softwareEngineerResume.getList();
        assertEquals(1,items.size());
    }
    @Test
    public void testProductManager(){
        Resume<ProductManager> productManagerResume=new Resume<>();
        productManagerResume.add(new ProductManager("Sweta Agrawal","Data Scientist"));
        List<ProductManager> items=productManagerResume.getList();
        assertEquals(1,items.size());
    }
}