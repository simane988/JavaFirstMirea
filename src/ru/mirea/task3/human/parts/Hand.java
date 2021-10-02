package ru.mirea.task3.human.parts;

public class Hand {
    private double length;
    private double strength;

    public Hand(){
        this.length = 600d;
        this.strength = 10d;
    }

    public Hand(double length, double strength){
        this.length = length;
        this.strength = strength;
    }

    public String getBonk(){
        return "bonk.";
    }

    @Override
    public String toString() {
        return "Hand{" +
                "length=" + length +
                ", strength=" + strength +
                '}';
    }
}
