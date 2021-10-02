package ru.mirea.task5.dish;

public class Test {
    public static void main(String[] args) {
        Cup cup1 = new Cup("Glass", "Black", 200, true);
        System.out.println(cup1.getCrash());
        System.out.println(cup1.fill(250));
        System.out.println(cup1.toString());

        Plate plate1 = new Plate("Chinaware", "White", 10);
        System.out.println(plate1.getCrash());
        System.out.println(plate1.toString());
    }
}
