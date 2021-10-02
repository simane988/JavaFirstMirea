package ru.mirea.task2.book;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Gary Potter", "Rowling", "Fantasy", 345);
        Book b2 = new Book("Red Hat", "Sharl Pero", "Fairytale");
        Book b3 = new Book("Dune", "Herbert Frank");
        Book b4 = new Book("Time machine");
        Book b5 = new Book();

        b4.setAuthor("Herbert Wells");

        System.out.println(b1.toString());
        System.out.println(b1.readTime());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b4.toString());
        System.out.println(b5.toString());
    }
}
