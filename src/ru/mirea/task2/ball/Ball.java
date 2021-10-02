package ru.mirea.task2.ball;

public class Ball {
    private String color;
    private int radius;
    private float springRatio;

    public Ball(String color, int radius, float springRatio){
        this.color = color;
        this.radius = radius;
        this.springRatio = springRatio;
    }
    public Ball(String color, int radius){
        this.color = color;
        this.radius = radius;
        this.springRatio = 1f;
    }
    public Ball(String color, float springRatio){
        this.color = color;
        this.radius = 1;
        this.springRatio = springRatio;
    }
    public Ball(int radius, float springRatio){
        this.color = "Black";
        this.radius = radius;
        this.springRatio = springRatio;
    }
    public Ball(String color){
        this.color = color;
        this.radius = 1;
        this.springRatio = 1;
    }
    public Ball(int radius){
        this.color = "Black";
        this.radius = radius;
        this.springRatio = 1;
    }
    public Ball(float springRatio){
        this.color = "Black";
        this.radius = 1;
        this.springRatio = springRatio;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setSpringRatio(float springRatio) {
        this.springRatio = springRatio;
    }

    public String getColor() {
        return color;
    }
    public int getRadius() {
        return radius;
    }
    public float getSpringRatio() {
        return springRatio;
    }

    public float getBounceHeight(){
        return springRatio * 10f;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", springRatio=" + springRatio +
                '}';
    }
}
