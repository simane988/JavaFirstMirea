package ru.mirea.task3.Shape;

public abstract class Shape {
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

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public String toString();
}
