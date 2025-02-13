package com.example.javagenerics.dynamiconlinemarketplace;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    public void clothTest() {
        Product<Clothing> clothingProduct = new Product<>();
        clothingProduct.add(new Clothing("Trouser",7000));
        List<Clothing> list = clothingProduct.getList();
        assertEquals(1, list.size());
    }
    @Test
    public void gadgetTest() {
        Product<Gadgets> gadgetsProduct = new Product<>();
        gadgetsProduct.add(new Gadgets("Bayblade",2500));
        List<Gadgets> list = gadgetsProduct.getList();
        assertEquals(1, list.size());
    }

    @Test
    public void bookTest() {
        Product<Books> bookProduct = new Product<>();
        bookProduct.add(new Books("JAVA",1500));
        List<Books> list = bookProduct.getList();
        assertEquals(1, list.size());
    }
}