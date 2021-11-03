package ru.mirea.task6.priceable;

public class Test {
    public static void main(String[] args) {
        Car c0 = new Car();
        Car c1 = new Car(100);
        System.out.println(c0.getPrice());
        System.out.println(c1.getPrice());

        Guitar g0 = new Guitar();
        Guitar g1 = new Guitar(100);
        System.out.println(g0.getPrice());
        System.out.println(g1.getPrice());
    }
}
