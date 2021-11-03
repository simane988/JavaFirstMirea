package ru.mirea.task6.priceable;

public class Guitar implements Priceable{
    private int price;
    public Guitar(){}
    public Guitar(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
}
