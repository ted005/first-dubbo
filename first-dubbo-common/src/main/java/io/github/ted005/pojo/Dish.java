package io.github.ted005.pojo;

import java.io.Serializable;

public class Dish implements Serializable {

    private String name;
    private int calory;
    private boolean vegetarian;
    private DishType type;

    public Dish() {
    }

    public Dish(String name, int calory, boolean vegetarian, DishType type) {
        this.name = name;
        this.calory = calory;
        this.vegetarian = vegetarian;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalory() {
        return calory;
    }

    public void setCalory(int calory) {
        this.calory = calory;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public DishType getType() {
        return type;
    }

    public void setType(DishType type) {
        this.type = type;
    }
}
