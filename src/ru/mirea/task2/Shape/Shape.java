package ru.mirea.task2.Shape;

public class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        this.color = "No Color";
        this.filled = false;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
