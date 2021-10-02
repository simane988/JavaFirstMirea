package ru.mirea.task4.ball;

public class Ball {
    private double x = 0.0f;
    private double xSpeed = 1f;
    private double y = 0.0f;
    private double ySpeed = 1f;

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ball(){}

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball @ (" + x + "," + y + ')';
    }
}
