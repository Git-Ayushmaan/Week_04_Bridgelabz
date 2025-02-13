package com.example.javagenerics.personalisemealplangenerator;

public class VegetarianMeal implements MealPlan{
    private String mealName;
    private String type;
    @Override
    public String getName() {
        return mealName;
    }

    public VegetarianMeal(String mealName, String type) {
        this.mealName = mealName;
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void displayInfo() {
        System.out.println("The meal is "+mealName+"\nThe meal is a "+getType()+" meal.\n");
    }
}

