package ru.mirea.task6.priceable;

public interface Priceable {
    public default int getPrice(){
        System.out.println("getPrice func is not set for this class.");
        return -1;
    }
}
