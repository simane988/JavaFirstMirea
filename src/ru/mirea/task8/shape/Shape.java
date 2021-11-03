package ru.mirea.task8.shape;

public abstract class Shape {
    protected int r, g, b, posx, posy;

    public void setXY(int x, int y){
        this.posx = x;
        this.posy = y;
    }

    public void setColor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getX() {
        return posx;
    }

    public int getY() {
        return posy;
    }

    public int[] getColor() {
        return new int[]{r, g, b};
    }
}
