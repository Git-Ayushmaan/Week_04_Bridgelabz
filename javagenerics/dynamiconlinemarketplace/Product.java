package com.example.javagenerics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class Product <T extends ProductCatalog>{
   private List <T> list;

    public Product() {
        list = new ArrayList<>();
    }
    public void add(T items){
        list.add(items);
    }

    public List<T> getList() {
        return list;
    }
    public void calculateDiscount( T product , double discount){
        double finalPrice  = product.getPrice()- (product.getPrice()*discount)/100;
        System.out.println("Updated Price:"+finalPrice);
    }
    public void displayAll(){
       for(T product : list){
           System.out.println("Name:"+ product.getName());
           System.out.println("Price:"+product.getPrice());
           System.out.println("Category:"+product.getCategory());
       }
    }
}
