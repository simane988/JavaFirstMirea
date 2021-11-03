package ru.mirea.task5.furniture;

public abstract class Furniture {
    protected int amount;
    protected String id;
    protected String type;
    protected int price;
    protected String material;
    protected String style;

    abstract public String toString();

}
