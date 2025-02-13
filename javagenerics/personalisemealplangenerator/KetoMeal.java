package com.example.javagenerics.personalisemealplangenerator;

public class KetoMeal implements MealPlan{
    private String mealName;
    private String type;

    public KetoMeal(String mealName, String type) {
        this.mealName = mealName;
        this.type = type;
    }

    @Override
    public String getName() {
        return mealName;
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
