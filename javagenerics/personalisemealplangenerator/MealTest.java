package com.example.javagenerics.personalisemealplangenerator;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class MealTest extends TestCase {
    @Test
    public void testKetoMeal(){
        Meal<KetoMeal> ketoMeal=new Meal<>();
        ketoMeal.add(new KetoMeal("Keto Salad","Keto"));
        List<KetoMeal> items=ketoMeal.getList();
        assertEquals(1,items.size());
    }
    @Test
    public void testProteinMeal(){
        Meal<ProteinMeal> proteinMeal=new Meal<>();
        proteinMeal.add(new ProteinMeal("Protein Salad","protein"));
        List<ProteinMeal> items=proteinMeal.getList();
        assertEquals(1,items.size());
    }
    @Test
    public void testVeganMeal(){
        Meal<VeganMeal> veganMeal=new Meal<>();
        veganMeal.add(new VeganMeal("Vegan Salad","Vegan"));
        List<VeganMeal> items=veganMeal.getList();
        assertEquals(1,items.size());
    }
    @Test
    public void testVegetarianMeal(){
        Meal<VegetarianMeal> vegetarianMeal=new Meal<>();
        vegetarianMeal.add(new VegetarianMeal("Vegetarian Salad","Vegetarian"));
        List<VegetarianMeal> items=vegetarianMeal.getList();
        assertEquals(1,items.size());
    }
}