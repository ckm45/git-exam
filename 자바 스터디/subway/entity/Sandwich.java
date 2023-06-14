package com.subway.entity;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private List<Ingredient> ingredients = new ArrayList<>();
    private int totalCalorie = 0;



    public Sandwich() {

    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public int getTotalCalorie() {
        return totalCalorie;
    }

    public void setTotalCalorie(int totalCalorie) {
        this.totalCalorie = totalCalorie;
    
    }


    

}
