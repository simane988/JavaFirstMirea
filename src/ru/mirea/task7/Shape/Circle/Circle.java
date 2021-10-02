package ru.mirea.task7.Shape.Circle;

import ru.mirea.task7.Shape.Shape;

public class Circle extends Shape {
    protected double radius;

    public Circle(){
        this.radius = 1d;
        this.color = "No Color";
        this.filled = true;
    }
    public Circle(double radius){
        this.radius = radius;
        this.color = "No Color";
        this.filled = true;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle radius: " + this.radius + ", color: " + this.color +
                ", filled: " + this.filled;
    }
}
