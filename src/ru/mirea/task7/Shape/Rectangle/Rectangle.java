package ru.mirea.task7.Shape.Rectangle;

import ru.mirea.task7.Shape.Shape;

public class Rectangle extends Shape {

    protected double width, length;

    public Rectangle(){
        this.width = 1d;
        this.length = 1d;
        this.color = "No color";
        this.filled = true;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        this.color = "No color";
        this.filled = true;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.width + 2 * this.length;
    }

    @Override
    public String toString() {
        return "Rectangular width: " + this.width + ", length: " + this.length +
                ", color: " + this.color + ", filled: " + this.filled;
    }
}
