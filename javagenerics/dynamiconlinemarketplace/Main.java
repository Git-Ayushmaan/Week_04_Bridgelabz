package com.example.javagenerics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clothing clothing = new Clothing("Trouser", 9000);
        Gadgets gadgets = new Gadgets("Bayblade", 4500);
        Books books = new Books("Java", 3500);

        Product<Clothing> clothingProduct = new Product<>();
        clothingProduct.add(clothing);
        Product<Gadgets> gadgetsProduct = new Product<>();
        gadgetsProduct.add(gadgets);
        Product<Books> booksProduct = new Product<>();
        booksProduct.add(books);
        clothingProduct.calculateDiscount(clothing, 10);
        gadgetsProduct.calculateDiscount(gadgets, 20);
        booksProduct.calculateDiscount(books, 30);
    }
}
