package ru.mirea.task5.dog;

public class Test {
    public static void main(String[] args) {
        Doberman dob1 = new Doberman("Tirael", 5, "Black",
                                     true, true);
        System.out.println(dob1.bite());
        System.out.println(dob1.getBark());
        System.out.println(dob1.toString());

        FrenchBulldog frb1 = new FrenchBulldog("Bobik", 7, "White",
                                               false, 150);
        System.out.println(frb1.bite());
        System.out.println(frb1.getBark());
        System.out.println(frb1.toString());
    }
}
