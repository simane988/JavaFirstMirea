package ru.mirea.task1;

public class Task3 {
    public static void main(String[] args) {
        for (double i = 1; i <= 10; i++){
            System.out.printf("%6.0f", i);
        }
        System.out.println();
        for (double i = 1; i <= 10; i++){
            System.out.printf("%6.2f", 1.0/i);
        }
    }
}
