package com.example.javagenerics.personalisemealplangenerator;

public class Main {
    public static void main(String[] args) {
        KetoMeal keto1 = new KetoMeal("Kelo Salad", "Keto");
        KetoMeal keto2 = new KetoMeal("Kelo PanCakes", "Keto");
        ProteinMeal protein1 = new ProteinMeal("Paneer salad", "Protein");
        ProteinMeal protein2 = new ProteinMeal("Paneer Kofta", "Protein");
        VeganMeal vegan1 = new VeganMeal("Vegan pasta", "Vegan");
        VeganMeal vegan2 = new VeganMeal("Rice cake", "Vegan");
        VegetarianMeal vegetarian1 = new VegetarianMeal("Dosa", "Vegetarian");
        VegetarianMeal vegetarian2 = new VegetarianMeal("Idli", "Vegetarian");

        Meal<KetoMeal> ketoMeal = new Meal<>();
        ketoMeal.add(keto1);
        ketoMeal.add(keto2);

        Meal<ProteinMeal> proteinMeal = new Meal<>();
        proteinMeal.add(protein1);
        proteinMeal.add(protein2);

        Meal<VeganMeal> veganMeal = new Meal<>();
        veganMeal.add(vegan1);
        veganMeal.add(vegan2);

        Meal<VegetarianMeal> vegetarianMeal = new Meal<>();
        vegetarianMeal.add(vegetarian1);
        vegetarianMeal.add(vegetarian2);

        ketoMeal.displayAllMeals();
        System.out.println("=============================");
        proteinMeal.displayAllMeals();
        System.out.println("=============================");
        veganMeal.displayAllMeals();
        System.out.println("=============================");
        vegetarianMeal.displayAllMeals();


    }
}
