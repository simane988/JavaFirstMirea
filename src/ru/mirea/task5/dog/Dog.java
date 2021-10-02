package ru.mirea.task5.dog;

public abstract class Dog {
    protected String name;
    protected int age;
    protected String color;
    protected String breed;
    protected boolean isAngry;

    public String getBark(){
        return "Woof-Woof";
    }

    abstract public String toString();
    abstract public String bite();
}
