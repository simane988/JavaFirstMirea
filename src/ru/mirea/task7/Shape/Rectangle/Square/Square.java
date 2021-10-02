package ru.mirea.task7.Shape.Rectangle.Square;

import ru.mirea.task7.Shape.Rectangle.Rectangle;

public class Square extends Rectangle {

    public Square(){
        this.width = 1d;
        this.length = this.width;
        this.color = "No color";
        this.filled = true;
    }
    public Square(double side){
        this.width = side;
        this.length = this.width;
        this.color = "No color";
        this.filled = true;
    }
    public Square(double side, String color, boolean filled){
        this.width = side;
        this.length = this.width;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return this.width;
    }
    public void setSide(double side){
        this.width = side;
        this.length = this.width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = this.width;
    }
    @Override
    public void setLength(double length) {
        this.width = length;
        this.length = this.width;
    }

    @Override
    public String toString() {
        return "Square side: " + this.width + ", color: " + this.color + ", filled: " + this.filled;
    }
}
