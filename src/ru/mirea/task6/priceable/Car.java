package ru.mirea.task6.priceable;

public class Car implements Priceable{
    private int price;
    public Car(){}
    public Car(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
}
