package ru.mirea.task3.human.parts;

public class Leg {
    private double length;
    private double size;

    public Leg(){
        this.length = 750;
        this.size = 42;
    }

    public Leg(double length, double size){
        this.length = length;
        this.size = size;
    }

    public String getTopTop() {
        return "Top-Top-Top";
    }

    @Override
    public String toString() {
        return "Leg{" +
                "length=" + this.length +
                ", size=" + this.size +
                '}';
    }
}
