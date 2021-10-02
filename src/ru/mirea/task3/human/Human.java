package ru.mirea.task3.human;

import ru.mirea.task3.human.parts.Hand;
import ru.mirea.task3.human.parts.Head;
import ru.mirea.task3.human.parts.Leg;

public class Human {
    private Head head;
    private Hand hand;
    private Leg leg;

    public Human(){
        this.head = new Head();
        this.hand = new Hand();
        this.leg = new Leg();
    }

    public Human(String hairColor, double hairLength, String eyeColor, double h_length, double strength, double l_length, double size){
        this.head = new Head(hairColor, hairLength, eyeColor);
        this.hand = new Hand(h_length, strength);
        this.leg = new Leg(l_length, size);
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head.toString() +
                ", hand=" + hand.toString() +
                ", leg=" + leg.toString() +
                '}';
    }
}
