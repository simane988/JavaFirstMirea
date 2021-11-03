package ru.mirea.task6.nameable;

public interface Nameable {
    public default String getName(){
        return this.getClass().getSimpleName();
    }
}
