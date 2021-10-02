package ru.mirea.task2.Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape sh1 = new Shape("red", true);
        Shape sh2 = new Shape();

        System.out.println(sh1.toString());
        System.out.println(sh2.toString());
    }
}
