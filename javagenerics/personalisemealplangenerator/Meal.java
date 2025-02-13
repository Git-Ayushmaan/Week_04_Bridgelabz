package com.example.javagenerics.personalisemealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class Meal <T extends MealPlan>{
    private List<T> list;
    public Meal(){
        list=new ArrayList<>();
    }
    public void add(T lists){
        list.add(lists);
    }

    public List<T> getList() {
        return list;
    }

    public void displayAllMeals(){
        for (T meals:list) {
            meals.displayInfo();
        }
    }
}
