package com.example.javagenerics.resumescreeningsystem;

public class Main {
    public static void main(String[] args) {
        DataScientist dataScientist = new DataScientist("Ayushmaan Tiwari", "Data Scientist");
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Alkesh Tiwari", "Software Engineer");
        ProductManager productManager = new ProductManager("Animesh Tiwari", "Product Manager");

        Resume<DataScientist> dataScientistResume = new Resume<>();
        dataScientistResume.add(dataScientist);
        dataScientistResume.displayAll(dataScientistResume.getList());

        Resume<ProductManager> productManagerResume = new Resume<>();
        productManagerResume.add(productManager);
        productManagerResume.displayAll(productManagerResume.getList());

        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>();
        softwareEngineerResume.add(softwareEngineer);
        softwareEngineerResume.displayAll(softwareEngineerResume.getList());
    }
}
