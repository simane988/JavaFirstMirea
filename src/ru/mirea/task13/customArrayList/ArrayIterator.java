package ru.mirea.task13.customArrayList;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private int index = 0;
    private E[] values;

    ArrayIterator(E[] values){
        this.values = values;
    }

    public boolean hasNext(){
        return index < values.length;
    }

    public E next(){
        return values[index++];
    }

}