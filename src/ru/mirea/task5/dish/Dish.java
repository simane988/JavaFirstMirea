package ru.mirea.task5.dish;

public abstract class Dish {
    protected String material;
    protected String color;

    public Dish(){
        this.material = "None";
        this.color = "NoColor";
    }
    public Dish(String material, String color){
        this.material = material;
        this.color = color;
    }

    abstract public String toString();
    abstract public String getCrash();
}
